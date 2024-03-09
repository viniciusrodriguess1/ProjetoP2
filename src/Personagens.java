import java.util.Scanner;

public class Personagens {
    private String nome;
    private int vida;
    private int dano;

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            System.out.println("Valor de vida inválido. Ajustando para 0.");
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public int getDano() {
        return dano;
    }

    public void ataqueB(Personagens atacado) {
        System.out.println(this.nome + " atacou " + atacado.getNome());
        atacado.setVida(atacado.getVida() - this.dano);
        System.out.println(atacado.getNome() + " agora tem " + atacado.getVida() + " pontos de vida.");
    }

    /*private void desc() {
        double vidaRecuperada = 10.0; 
        double vidaMaxima = 20.0;
        if ((this.vida + vidaRecuperada) > vidaMaxima) {
            this.vida = vidaMaxima;
        } else {
            this.vida += vidaRecuperada;
        }

        System.out.println(this.nome + " recuperou " + vidaRecuperada + " pontos de vida, agora está com " + this.vida);
    } */

    public Personagens(String nome, int vida, int dano) {
        this.vida = vida;
        this.dano = dano;
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Antes de começarmos a história gostaria que me informasse o nome do seu personagem");
            Scanner sc1 = new Scanner(System.in);
            this.nome = sc1.nextLine();
        }
    }
}