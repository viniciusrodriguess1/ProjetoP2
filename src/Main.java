import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in);

        Leitor leitor = new Leitor();
        HashMap<String, Personagens> personagens = Leitor.lerPersonagens();
        HashMap<String, Capitulo> capitulos = Leitor.lerCapitulos(personagens, escaneador);

        capitulos.get("cap0").adicionarEscolha(new Escolha("Iniciar", capitulos.get("cap1")));
        capitulos.get("cap1").adicionarEscolha(new Escolha("Iniciar", capitulos.get("cap2")));
        capitulos.get("cap2").adicionarEscolha(new Escolha("Iniciar", capitulos.get("cap21")));
        capitulos.get("cap21").adicionarEscolha(new Escolha("Iniciar", capitulos.get("cap3")));
        capitulos.get("cap3").adicionarEscolha(new Escolha("Iniciar", capitulos.get("cap4")));

        Capitulo raiz = capitulos.get("cap0");
        // Executando livro interativo
        raiz.executar(escaneador);

        // Fechando o Scanner
        escaneador.close();
    }
}
