import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Leitor {
    public static HashMap<String, Personagens> lerPersonagens() {
        HashMap<String, Personagens> personagens = new HashMap<String, Personagens>();

        File arquivo = new File("rsc\\Personagens.txt");
        try (Scanner leitor = new Scanner(arquivo, "UTF-8")) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                if (linha.equalsIgnoreCase("PERSONAGEM")) {
                    String key = leitor.nextLine();

                    Personagens personagem = lerPersonagem(leitor);
                    personagens.put(key, personagem);
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    private static Personagens lerPersonagem(Scanner leitor) {
        String nome = leitor.nextLine();
        int vida = Integer.parseInt(leitor.nextLine());
        int dano = Integer.parseInt(leitor.nextLine());
        Personagens personagem = new Personagens(nome, vida, dano);

        return personagem;

    }

    public static HashMap<String, Capitulo> lerCapitulos(
            HashMap<String, Personagens> personagens,
            Scanner escaneador) {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();

        File arquivo = new File("rsc\\Capitulos.txt");
        try (Scanner leitor = new Scanner(arquivo, "UTF-8")) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                if (linha.equalsIgnoreCase("CAPITULO")) {
                    String key = leitor.nextLine();

                    Capitulo capitulo = lerCapitulo(leitor, personagens, escaneador);
                    capitulos.put(key, capitulo);
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return capitulos;
    }

    private static Capitulo lerCapitulo(Scanner leitor, HashMap<String, Personagens> personagens, Scanner escaneador) {
        String titulo = leitor.nextLine();
        StringBuilder textoBuilder = new StringBuilder();
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            if (linha.trim().equalsIgnoreCase("mc")) {
                break;
            }
            textoBuilder.append(linha).append("\n");
        }
    
        String texto = textoBuilder.toString().trim();
        String keypersonagens = leitor.nextLine();
        Personagens personagem1 = personagens.get(keypersonagens);
        Personagens personagem2 = personagens.get(keypersonagens);
        Capitulo capitulo = new Capitulo(titulo, texto, personagem1, personagem2, escaneador);
        return capitulo;
    }
}
