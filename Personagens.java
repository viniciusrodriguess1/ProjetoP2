public class Personagens{
    // Caracteristicas do personagem
    String nome;
    Double vida;
    Double dano;
    public void ataqueb(Personagens atacado) {
        System.out.println(this.nome + " atacou " + atacado.nome);
        atacado.vida -= this.dano;
        System.out.println(atacado.nome + " agora tem " + atacado.vida + " pontos de vida.");
    }
    public void desc() {
        double vidaRecuperada = 10.0; // Quantidade de vida a ser recuperada
        double vidaMaxima = 20.0; // Valor máximo da vida inicial
    
        if ((this.vida + vidaRecuperada) > vidaMaxima) {
            this.vida = vidaMaxima;
        } else {
            this.vida += vidaRecuperada;
        }
    
        System.out.println(this.nome + " recuperou " + vidaRecuperada + " pontos de vida, agora está com " + this.vida);
    }
    
}
