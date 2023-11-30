import java.util.Scanner;

public class miniprojeto1 {
    /**
     * @param args
     */
    public static void main(String[] args){
        
        Personagens senhor = new Personagens("Senhor",10.0,3.0);

        Personagens assaltante = new Personagens("Assaltante",15.0,2.0);

        Personagens protagonista = new Personagens(null, 20.0, 5.0);

        Capitulo capitulo0 = new Capitulo("Prefacio", "Ola,"+protagonista.nome+ "seja bem vindo ao Livro interativo! \n"+
        "Esté livro funciona da seguinte forma: \n"+
        "A historia é 'pré-programada' porem ha interação do usuario,onde o usuario pode escolher umas sequenca de passos pre definidos. \n"+
        "É basicamente isto, divirta-se com a historia! ", null, null,protagonista,senhor);
        capitulo0.mostrar();

        Capitulo capitulo1 = new Capitulo("Capitulo 1",protagonista.nome + ", voce está em um bar a noite, onde estão todos muito animados bebendo e cantando. \n"+
        "Vê entrar no bar um senhor de idade mais avançada com uma expressão não muito amigavel. \n"+
        "Um de seus colegas tenta o convidar para entrar na brincadeira. \n"+
        "Porem ele irritado empurra seu colega e diz que não gosta que nimguem cante.",
        "Escolha 1: Ir até o senhor e questionar sua atitude (digite 1).",
        "Escolha 2: Sair do bar quieto (digite 2).",protagonista,senhor);

        capitulo1.mostrar();
        capitulo1.escolher();
        if(capitulo1.escolher() == 1){
            Capitulo capitulo21 = new Capitulo("Capitulo 2", "Voce se aproxima do senhor porem ao se aproximar ele parte de forma agressiva em sua direção e lhe da um soco. \n"+
            "Oque acarreta o inicio de uma briga."
            , "Voce pode atacar usando o seu ataque basico(digite 1)","Para não fazer nada(digite 2)" , protagonista,senhor);
            capitulo21.mostrar();
            capitulo21.escolher();
            capitulo21.batalha();
            if(senhor.vida<=0){
                Capitulo capitulo22 = new Capitulo("Capitulo 2", "Voce consegue sair do bar sem mais confusões.\n"+
            "Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ", "Voce pode ir se hospedar e descansar(digite 1)", "Tentar impedir o assaltante(digite 2)", protagonista,assaltante);
            capitulo22.mostrar();
            capitulo22.escolher();
            if(capitulo22.escolher()==1){
                Capitulo capitulo321 = new Capitulo("Capitulo 3", "Voce decide ficar a noite na hospedaria descansando e vai ate la", null, null, protagonista,null);
                capitulo321.mostrar();
                capitulo321.fim();
            }else{
                Capitulo capitulo322 = new Capitulo("Capitulo 3", "Voce decide impedir o assaltante", "Voce pode atacar usando o seu ataque basico(digite 1)", "Para não fazer nada(digite 2)", protagonista,assaltante);
                capitulo322.mostrar();
                capitulo322.escolher();
                capitulo322.batalha();
                if(assaltante.vida<= 0){
                     Capitulo capitulo321 = new Capitulo("Capitulo 3", "Voce decide ficar a noite na hospedaria descansando e vai ate la", null, null, protagonista,null);
                    capitulo321.mostrar();
                    capitulo321.fim();
                }else{
                    capitulo0.fim();
                }
            }
            }else{
                capitulo0.fim();
            }
        }
        
        else{
            Capitulo capitulo22 = new Capitulo("Capitulo 2", "Voce consegue sair do bar sem mais confusões.\n"+
            "Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ", "Voce pode ir se hospedar e descansar(digite 1)", "Tentar impedir o assaltante(digite 2)", protagonista,null);
            capitulo22.mostrar();
            capitulo22.escolher();
            if(capitulo22.escolher()==1){
                Capitulo capitulo321 = new Capitulo("Capitulo 3", "Voce decide ficar a noite na hospedaria descansando e vai ate la", null, null, protagonista,null);
                capitulo321.mostrar();
                capitulo321.fim();
            }else{
                Capitulo capitulo322 = new Capitulo("Capitulo 3", "Voce decide impedir o assaltante", "Voce pode atacar usando o seu ataque basico(digite 1)", "Para não fazer nada(digite 2)", protagonista,assaltante);
                capitulo322.mostrar();
                capitulo322.escolher();
                capitulo322.batalha();
                if(assaltante.vida<= 0){
                     Capitulo capitulo321 = new Capitulo("Capitulo 3", "Voce decide ficar a noite na hospedaria descansando e vai ate la", null, null, protagonista,null);
                    capitulo321.mostrar();
                    capitulo321.fim();
                }else{
                    capitulo0.fim();
                }
                
            }
        }
    }
}

