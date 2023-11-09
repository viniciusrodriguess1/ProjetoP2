import java.util.Scanner;

public class miniprojeto1 {
    /**
     * @param args
     */
    public static void main(String[] args){
        Personagens senhor = new Personagens();
        senhor.nome = "Senhor";
        senhor.vida = 10.0;
        senhor.dano = 3.0;
        Personagens assaltante = new Personagens();
        assaltante.nome = "Assaltante";
        assaltante.vida = 15.0;
        assaltante.dano = 2.0;
        System.out.println("-----------------------------------------------");
        System.out.println("Ola, seja bem vindo ao Livro interativo!");
        System.out.println("Esté livro funciona da seguinte forma:");
        System.out.println( "A historia é 'pré-programada' porem ha interação do usuario,onde o usuario pode escolher umas sequenca de passos pre definidos.");
        System.out.println("É basicamente isto, divirta-se com a historia!");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Para começarmos gostaria que voce nomeasse o seu personagem");
        Personagens protagonista = new Personagens();
        Scanner sc1 = new Scanner(System.in);
        protagonista.nome  = sc1.nextLine();
        protagonista.vida = 20.0;
        protagonista.dano = 5.0;
    
        System.out.println("Legal," + protagonista.nome + " é um otimo nome!" );
        System.out.println(protagonista.nome + ",voce é um e voce está em um bar a noite, onde estão todos muito animados bebendo e cantando.");
        System.out.println("Vê entrar no bar um senhor de idade mais avançada com uma expressão não muito amigavel.");
        System.out.println("Um de seus colegas tenta o convidar para entrar na brincadeira.");
        System.out.println("Porem ele irritado empurra seu colega e diz que não gosta que nimguem cante.");
        System.out.println("-----------------------------------------------");
        
        System.out.println("Voce tem 3 opções de escolha: ");
        System.out.println("Opção 1: Ir até o senhor e questionar sua atitude (digite 1).");
        System.out.println("Opção 2: Pedir para os outros pararem de cantar para não arranjarem problema (digite 2).");
        System.out.println("Opção 3: Sair do bar quieto (digite 3).");
        Scanner sc3 = new Scanner(System.in);
        int op1 = sc3.nextInt();

        if(op1 == 1){
            System.out.println("Voce se aproxima do senhor porem ao se aproximar ele parte de forma agressiva em sua direção e lhe da um soco.");
            System.out.println("Oque acarreta o inicio de uma briga.");
            System.out.println("-----------------------------------------------");
            while(senhor.vida>0 && protagonista.vida>0){
                System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                op1 = sc3.nextInt();
                System.out.println("-----------------------------------------------");
                if(op1 == 1){
                protagonista.ataqueb(senhor);
                }
                senhor.ataqueb(protagonista);
                if(protagonista.vida<=0){
                    System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                }
                if(senhor.vida<=0){
                        System.out.println(senhor.nome + " foi derrotado.");
                }
                System.out.println("-----------------------------------------------");
            }
                System.out.println("Voce consegue sair do bar sem mais confusões.");
                System.out.println("-----------------------------------------------");
                System.out.println("Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ");
                System.out.println("Voce pode escolher entre ir se hospedar e descansar(digite 1)");
                System.out.println("Tentar impedir o assaltante(digite 2)");
                op1 = sc3.nextInt();
                if(op1 == 1){
                System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                protagonista.desc();
                }else if(op1==2){
                    while(assaltante.vida>0 && protagonista.vida>0){
                        System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                        op1 = sc3.nextInt();
                        System.out.println("-----------------------------------------------");
                        if(op1 == 1){
                        protagonista.ataqueb(assaltante);
                        }
                        assaltante.ataqueb(protagonista);
                        if(protagonista.vida<=0){
                        System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                        }
                        if(assaltante.vida<=0){
                        System.out.println(assaltante.nome + " foi derrotado.");
                        }
                        System.out.println("-----------------------------------------------");
                    }
                    System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                    protagonista.desc();   
                }

        }else if(op1 == 2){
            System.out.println("Voce pede para os outros pararem de cantar porem ninguem lhe da muita atenção.");
            System.out.println("Voce tem 2 opções de escolha: ");
            System.out.println("Opção 1: Ir até o senhor e questionar sua atitude ( digite 1).");
            System.out.println("Opção 2: Sair do bar quieto ( digite 2).");
            op1 = sc3.nextInt();
            if(op1 == 1){
            System.out.println("Voce se aproxima do senhor porem ao se aproximar ele parte de forma agressiva em sua direção e lhe da um soco.");
            System.out.println("Oque acarreta o inicio de uma briga.");
            while(senhor.vida>0 && protagonista.vida>0){
                System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                op1 = sc3.nextInt();
                System.out.println("-----------------------------------------------");
                if(op1 == 1){
                protagonista.ataqueb(senhor);
                }
                senhor.ataqueb(protagonista);
                if(protagonista.vida<=0){
                    System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                }
                if(senhor.vida<=0){
                        System.out.println(senhor.nome + " foi derrotado.");
                }
                System.out.println("-----------------------------------------------");
                System.out.println("Voce consegue sair do bar sem mais confusões.");
                System.out.println("-----------------------------------------------");
                System.out.println("Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ");
                System.out.println("Voce pode escolher entre ir se hospedar e descansar(digite 1)");
                System.out.println("Tentar impedir o assaltante(digite 2)");
                op1 = sc3.nextInt();
                if(op1 == 1){
                System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                }else if(op1==2){
                    while(assaltante.vida>0 && protagonista.vida>0){
                        System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                        op1 = sc3.nextInt();
                        System.out.println("-----------------------------------------------");
                        if(op1 == 1){
                        protagonista.ataqueb(assaltante);
                        }
                        assaltante.ataqueb(protagonista);
                        if(protagonista.vida<=0){
                        System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                        }
                        if(assaltante.vida<=0){
                        System.out.println(assaltante.nome + " foi derrotado.");
                        }
                        System.out.println("-----------------------------------------------");
                    }
                    System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                    protagonista.desc();   
                }
            }
            }else if(op1 == 2){
                System.out.println("Voce paga sua conta e sair do bar quieto, pois sabe que vai dar confusão.");
                System.out.println("-----------------------------------------------");
                System.out.println("Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ");
                System.out.println("Voce pode escolher entre ir se hospedar e descansar(digite 1)");
                System.out.println("Tentar impedir o assaltante(digite 2)");
                op1 = sc3.nextInt();
                if(op1 == 1){
                System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                protagonista.desc();
                }else if(op1==2){
                    while(assaltante.vida>0 && protagonista.vida>0){
                        System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                        op1 = sc3.nextInt();
                        System.out.println("-----------------------------------------------");
                        if(op1 == 1){
                        protagonista.ataqueb(assaltante);
                        }
                        assaltante.ataqueb(protagonista);
                        if(protagonista.vida<=0){
                        System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                        }
                        if(assaltante.vida<=0){
                        System.out.println(assaltante.nome + " foi derrotado.");
                        }
                        System.out.println("-----------------------------------------------");
                    }   
                }
            }
        }else if(op1 == 3){
            System.out.println("Voce paga sua conta e sair do bar quieto, pois sabe que vai dar confusão.");
            System.out.println("-----------------------------------------------");
            System.out.println("Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ");
            System.out.println("Voce pode escolher entre ir se hospedar e descansar(digite 1)");
            System.out.println("Tentar impedir o assaltante(digite 2)");
            op1 = sc3.nextInt();
            if(op1 == 1){
                System.out.println("Voce decide ficar a noite na hospedaria descansando e vai ate la");
                protagonista.desc();
            }else if(op1==2){
                while(assaltante.vida>0 && protagonista.vida>0){
                    System.out.println("Voce pode atacar usando o seu ataque basico(digite 1) ou não fazer nada(digite 2)");
                    op1 = sc3.nextInt();
                    System.out.println("-----------------------------------------------");
                    if(op1 == 1){
                    protagonista.ataqueb(assaltante);
                    }
                    assaltante.ataqueb(protagonista);
                    if(protagonista.vida<=0){
                    System.out.println(protagonista.nome+" foi derrotado, fim de jogo.");
                    }
                    if(assaltante.vida<=0){
                        System.out.println(assaltante.nome + " foi derrotado.");
                    }
                    System.out.println("-----------------------------------------------");
                }
            }
        }else{
            System.out.println("Voce digitou um valor de opção invalido, tente novamente.");
        }
        System.out.println("-----------------------------------------------");
    }
}
