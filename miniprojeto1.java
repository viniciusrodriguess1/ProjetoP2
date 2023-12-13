
public class miniprojeto1 {
    /**
     * @param args
     */
    public static void main(String[] args){
        // Criação de personagens
        Personagens senhor = new Personagens("Senhor",10.0,3.0);
        Personagens assaltante = new Personagens("Assaltante",15.0,2.0);
        Personagens protagonista = new Personagens(null, 20.0, 5.0);

        // Criação dos capitulos
        Capitulo capituloRaiz = new Capitulo("Prefacio", "Ola, " + protagonista.nome + " seja bem vindo ao Livro interativo! \n" +
                "Esté livro funciona da seguinte forma: \n" +
                "A historia é 'pré-programada' porem ha interação do usuario,onde o usuario pode escolher umas sequenca de passos pre definidos. \n" +
                "É basicamente isto, divirta-se com a historia! ", protagonista, null);
        Capitulo capitulo1 = new Capitulo("Capitulo 1",protagonista.nome + ", voce está em um bar a noite, onde estão todos muito animados bebendo e cantando. \n"+
        "Vê entrar no bar um senhor de idade mais avançada com uma expressão não muito amigavel. \n"+
        "Um de seus colegas tenta o convidar para entrar na brincadeira. \n"+
        "Porem ele irritado empurra seu colega e diz que não gosta que nimguem cante.",protagonista,null);
        Capitulo capitulo21 = new Capitulo("Capitulo 2","Voce decide tirar satisfação com o senhor",protagonista,senhor );
        Capitulo capitulo2 = new Capitulo("Capitulo 2", "Voce consegue sair do bar sem mais confusões.\n"+
            "Ao sair do bar voce avista uma hospedaria mas ao olhar para o outro lado ve um assalto acontecendo ", protagonista,null);
        Capitulo capitulo3 = new Capitulo("Capitulo 3", "Voce decide impedir o assaltante", protagonista,assaltante);
        Capitulo capitulo4 = new Capitulo("Capitulo 4", "Voce decide ficar a noite na hospedaria descansando e vai ate la",protagonista,null);
        
        //  Escolhas referente a cada capitulo
        Escolha[] escolhasRaiz = {
                new Escolha("Para iniciar o jogo digite 1",capitulo1),
                new Escolha("Caso não queira jogar, digite 2", null)
        };
        Escolha[] escolhas1 = {
            new Escolha("Escolha 1: Ir até o senhor e questionar sua atitude (digite 1)." , capitulo21),
            new Escolha("Escolha 2: Sair do bar quieto (digite 2).", capitulo2)              
        };
        Escolha[] escolhas21 = {
            new Escolha("Escolha 1: Sair do bar quieto (digite 1)." , capitulo2)           
        };
        Escolha[] escolhas2 ={
            new Escolha("Escolha 1: Ir até o assaltante e tentar impedir o assalto (digite 1)." , capitulo3),
            new Escolha("Escolha 2: Ir até a hospedaria (digite 2).", capitulo4)
        };
        Escolha[] escolhas3 ={
            new Escolha("Escolha 1: Ir até a hospedaria (digite 1)." , capitulo4),
        };
        capituloRaiz.escolhas = escolhasRaiz;
        capitulo1.escolhas = escolhas1;
        capitulo21.escolhas = escolhas21;
        capitulo2.escolhas = escolhas2;
        capitulo3.escolhas = escolhas3;
        capituloRaiz.executar();
    }
}

