import java.util.Scanner;

public class miniprojeto1 {
    public static void main(String[] args){
        System.out.println("Ola, seja bem vindo ao Livro interativo");
        System.out.println("Esté livro funciona da seguinte forma:");
        System.out.println( "A historia é 'pré-programada' porem ha interação do usuario,onde o usuario pode escolher umas sequenca de passos pre definidos.");
        System.out.println("É basicamente isto, divirta-se com a historia");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Para começarmos gostaria que voce nomeasse o seu personagem");
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.nextLine();
        System.out.println("Legal," + nome + " é um otimo nome!" );
        System.out.println("-----------------------------------------------");

        System.out.println("Voce tem a opção de escolher uma classe para seu personagem, suas opções são, mercenario e cavaleiro");
        System.out.println("Para mercenario digite 1, para cavaleiro digite 2");
        Scanner cl = new Scanner(System.in);
        int classesc = cl.nextInt();
        String classe;

        System.out.println(nome + ", voce é um " + selecaoclass(classesc) + " e está em um bar ,onde estão todos muito animados bebendo e cantando.");
        System.out.println("Vê entrar no bar um senhor de idade mais avançada com uma expressão não muito amigavel.");
        System.out.println("Um de seus colegas tenta o convidar para entrar na brincadeira.");
        System.out.println("Porem ele irritado empurra seu colega e diz que não gosta que nimguem cante.");
        System.out.println("-----------------------------------------------");
        
  
        System.out.println("Voce tem 3 opções de escolha: ");
        System.out.println("Opção 1: Ir até o senhor e questionar sua atitude (no caso dessa escolha digite 1).");
        System.out.println("Opção 2: Pedir para os outros pararem de cantar para não arranjarem problema (no caso dessa escolha digite 2).");
        System.out.println("Opção 3: Sair do bar quieto (no caso dessa escolha digite 3).");
        Scanner sc2 = new Scanner(System.in);
        int op1 = sc2.nextInt();

        if(op1 == 1){
            System.out.println("Voce se aproxima do senhor porem ao se aproximar ele parte de forma agressiva em sua direção e lhe da um soco.");
            System.out.println("Oque acarreta o inicio de uma briga com todos que estão no bar.");
        }else if(op1 == 2){
            System.out.println("Voce pede para os outros pararem de cantar porem ninguem lhe da muita atenção.");
        }else if(op1 == 3){
            System.out.println("Voce paga sua conta e sair do bar quieto, pois sabe quem vai dar confusão.");
        }else{
            System.out.println("Voce digitou um valor de opção invalido, tente novamente.");
        }

    }
    public static String selecaoclass(int a){
        String classe;
        if(a == 1){
            classe = "mercenario";
        }else if(a ==2){
             classe = "cavaleiro";
        }else{
            System.out.println("Voce digitou um valor invalido, por favor tente novamente");
        }
        System.out.println(classe);
    }
}
