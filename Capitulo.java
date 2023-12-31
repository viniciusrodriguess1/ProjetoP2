import java.util.Scanner;

public class Capitulo {
    public String nome;
    public String texto;
    public Escolha[] escolhas;
    public Personagens personagem;
    public Personagens inimigo;
    public double alteracaoVida;
    public Scanner escaneador;

    void mostrar() {
        System.out.println("-----------------------------------------------");
        System.out.println(nome);
        System.out.println("-----------------------------------------------");
        System.out.println(texto);
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i + 1 + ": " + escolhas[i].texto);
        }
        System.out.println("-----------------------------------------------");
        personagem.vida += alteracaoVida;
    }

    int escolher() {
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

    void batalha() {
        while (inimigo.vida > 0 && personagem.vida > 0) {
            System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
            System.out.println("-----------------------------------------------");
            Scanner escaneador = new Scanner(System.in);
            int escolha = escaneador.nextInt();
            if (escolha == 1) {
                personagem.ataqueb(inimigo);
            }
            inimigo.ataqueb(personagem);
            if (personagem.vida <= 0) {
                System.out.println(personagem.nome + " foi derrotado, fim de jogo.");
            }
            if (inimigo.vida <= 0) {
                System.out.println(inimigo.nome + " foi derrotado.");
            }
        }
    }

    Capitulo(String nome, String texto, Personagens personagem, Personagens inimigo) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    void fim() {
        System.out.println("Fim do jogo.");
    }


    void executar() {
        Capitulo capituloAtual = this;
    
        while (capituloAtual != null) {
            if (capituloAtual.inimigo != null) {
                capituloAtual.batalha();
            }
    
            capituloAtual.mostrar();
    
            if (capituloAtual != null) {
                int escolhaDoUsuario = capituloAtual.escolher();
    
                if (escolhaDoUsuario > 0 && escolhaDoUsuario <= capituloAtual.escolhas.length) {
                    Capitulo proximoCapitulo = capituloAtual.escolhas[escolhaDoUsuario - 1].proximo;
    
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
