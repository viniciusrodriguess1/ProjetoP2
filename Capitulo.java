import java.util.Scanner;

public class Capitulo {
    public String nome;
    public String texto;
    public String escolha1;
    public String escolha2;
    public Personagens personagem;
    public Personagens inimigo;
    public double alteracaoVida;
    public Scanner escaneador;

    void mostrar(){
        System.out.println("-----------------------------------------------");
        System.out.println(nome);
        System.out.println("-----------------------------------------------");
        System.out.println(texto);
        System.out.println("-----------------------------------------------");
        System.out.println(escolha1);
        System.out.println("-----------------------------------------------");
        System.out.println(escolha2);
        System.out.println("-----------------------------------------------");
        personagem.vida += alteracaoVida;        
    }

    int escolher(){
        Scanner escaneador = new Scanner(System.in);
        int escolha = escaneador.nextInt();
        while(escolha != 1 && escolha !=2){
            escolha = escaneador.nextInt();
        }
        return escolha;
        
    }
    void batalha(){
        while(inimigo.vida>0 && personagem.vida>0){
            System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
            System.out.println("-----------------------------------------------");
            Scanner escaneador = new Scanner(System.in);
            int escolha = escaneador.nextInt();
            if(escolha == 1){
            personagem.ataqueb(inimigo);
            }
            inimigo.ataqueb(personagem);
            if(personagem.vida<=0){
                System.out.println(personagem.nome+" foi derrotado, fim de jogo.");
            }
            if(inimigo.vida<=0){
                    System.out.println(inimigo.nome + " foi derrotado.");
            }
        }

    }

    Capitulo(String nome,String texto,String escolha1,String escolha2,Personagens personagem,Personagens inimigo){
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    void fim(){
        System.out.println("Fim do jogo.");
    }

}
