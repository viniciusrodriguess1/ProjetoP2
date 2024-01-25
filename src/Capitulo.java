import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private Escolha[] escolhas;
    private Personagens personagem;
    private Personagens inimigo;
    private double alteracaoVida;
    private Scanner escaneador;

    public Escolha[] getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(Escolha[] escolhas) {
        this.escolhas = escolhas;
    }

    private void mostrar() {
        System.out.println("-----------------------------------------------");
        System.out.println(nome);
        System.out.println("-----------------------------------------------");
        System.out.println(texto);
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i + 1 + ": " + escolhas[i].getTexto());
        }
        System.out.println("-----------------------------------------------");
        personagem.setVida(personagem.getVida() + alteracaoVida);
    }

    private int escolher() {
        Scanner escaneador = new Scanner(System.in);
        int opcaoEscolhida = 0;
        boolean escolhaValida = false;
        while (!escolhaValida) {
            System.out.println("Digite o número da escolha desejada:");
            int escolha = escaneador.nextInt();
            escaneador.nextLine();
            if (escolha >= 1 && escolha <= escolhas.length) {
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
            }
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado.");
            }
        }
    }

    public Capitulo(String nome, String texto, Personagens personagem, Personagens inimigo) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    private void fim() {
        System.out.println("Fim do jogo.");
    }

    public void executar() {
        Capitulo capituloAtual = this;

        while (capituloAtual != null) {
            if (capituloAtual.inimigo != null) {
                capituloAtual.batalha();
            }

            capituloAtual.mostrar();

            if (capituloAtual != null) {
                int escolhaDoUsuario = capituloAtual.escolher();

                if (escolhaDoUsuario > 0 && escolhaDoUsuario <= capituloAtual.escolhas.length) {
                    Capitulo proximoCapitulo = capituloAtual.escolhas[escolhaDoUsuario - 1].getProximo();

                    if (proximoCapitulo != null) {
                        capituloAtual = proximoCapitulo;
                    } else {
                        capituloAtual.fim();
                        capituloAtual = null;
                    }
                } else {
                    System.out.println("Escolha inválida. Fim do jogo.");
                    capituloAtual = null;
                }
            }
        }
    }
}
