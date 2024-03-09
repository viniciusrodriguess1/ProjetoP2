import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
    private Personagens personagem;
    private Personagens inimigo;
    private Scanner escaneador;

    public ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(ArrayList<Escolha> escolhas) {
        this.escolhas = escolhas;
    }

    public void adicionarEscolha(Escolha a) {
        this.escolhas.add(a);
    }

    public String getNome() {
        return nome;
    }

    private void mostrar() {
        System.out.println("-----------------------------------------------");
        System.out.println(nome);
        System.out.println("-----------------------------------------------");
        System.out.println(texto);
        System.out.println("-----------------------------------------------");

        int index = 1;
        for (Escolha escolha : escolhas) {
            System.out.println(index + ": " + escolha.getTexto());
            index++;
        }
        System.out.println("-----------------------------------------------");

        if (personagem != null && personagem.getVida() > 0) {
            System.out.println("Vida do " + personagem.getNome() + ": " + personagem.getVida());
        }
        if (inimigo != null && inimigo.getVida() > 0) {
            System.out.println("Vida do " + inimigo.getNome() + ": " + inimigo.getVida());
        }
    }

    private int escolher(Scanner escaneador) {
        int opcaoEscolhida = 0;
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.println("Digite o número da escolha desejada:");
            int escolha = escaneador.nextInt();
            escaneador.nextLine();

            if (escolha >= 1 && escolha <= escolhas.size()) {
                escolhaValida = true;
                opcaoEscolhida = escolha;
            } else {
                System.out.println("Escolha inválida, por favor tente novamente");
            }
        }

        return opcaoEscolhida;
    }

    private void batalha() {
        while (inimigo.getVida() > 0 && personagem.getVida() > 0) {
            System.out.println("Você pode atacar usando o seu ataque básico (digite 1) ou não fazer nada (digite 2)");
            System.out.println("-----------------------------------------------");
            Scanner escaneador = new Scanner(System.in);
            int escolha = escaneador.nextInt();
            if (escolha == 1) {
                personagem.ataqueB(inimigo);
            }
            inimigo.ataqueB(personagem);
            if (personagem.getVida() <= 0) {
                System.out.println(personagem.getNome() + " foi derrotado, fim de jogo.");
                personagem.setVida(0); // Certifica-se de que a vida não fica negativa
            }
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado.");
                inimigo.setVida(0); // Certifica-se de que a vida não fica negativa
            }
        }
    }

    private void fim() {
        System.out.println("Fim do jogo.");
    }

    public void executar(Scanner escaneador) {
        while (this != null) {
            if (inimigo != null) {
                batalha();
            }

            mostrar();

            if (this != null) {
                int escolhaDoUsuario = escolher(escaneador);

                if (escolhaDoUsuario > 0 && escolhaDoUsuario <= escolhas.size()) {
                    Escolha escolhaSelecionada = escolhas.get(escolhaDoUsuario - 1);
                    Capitulo proximoCapitulo = escolhaSelecionada.getProximo();

                    if (proximoCapitulo != null) {
                        proximoCapitulo.personagem = personagem;
                        proximoCapitulo.inimigo = inimigo;

                        proximoCapitulo.executar(escaneador);
                    } else {
                        fim();
                        break;
                    }
                } else {
                    System.out.println("Escolha inválida. Fim do jogo.");
                    break;
                }
            }
        }
    }

    public Capitulo(String nome, String texto,Personagens personagem,
     Personagens inimigo, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.inimigo = inimigo;
        this.escaneador = escaneador;
    }
}
