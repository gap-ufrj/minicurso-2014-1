package aula00;

//Declaração da classe Mago
/*Extends indica que Mago herda da classe Personagem*/
/*Implements indica que Mago implementa a interface Batalhador*/
public class Mago extends Personagem implements Batalhador{

    //Construtor da classe Mago
    /*O construtor da classe filha combina com o construtor da classe pai para a reutilização*/
    public Mago(String nome, int hp, int mana, int ataque, int defesa, int poderMagico){
        super(nome, hp, mana, ataque, defesa, poderMagico);
    }

    //Sobrescrevendo o método quemSouEu() da classe pai Personagem
    @Override
    public String quemSouEu() {
        /*Na prática, está apenas chamando o próprio método quemSouEu() da classe pai Personagem*/
        return super.quemSouEu();
    }

    //Implementando o método danoBase() da classe pai Personagem
    @Override
    public int danoBase() {
        return this.getPoderMagico()+8;
    }

    //Implementando o método ataca() da interface Batalhador implementada
    @Override
    public void ataca(Batalhador b) {
        b.recebeDano(danoBase());
    }

    //Implementando o método recebeDano() da interface Batalhador implementada
    @Override
    public void recebeDano(int dano) {
        int danoRecebido = dano - (this.getDefesa()-2);
        this.setHp(this.getHp() - danoRecebido);
        System.out.println(this.getNome()+" recebeu "+danoRecebido+" de dano!");
    }
}
