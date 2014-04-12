package aula00;

//Declaração da classe Guerreiro
/*Extends indica que Guerreiro herda da classe Personagem*/
/*Implements indica que Guerreiro implementa a interface Batalhador*/
public class Guerreiro extends Personagem implements Batalhador{

    //Construtor da classe Guerreiro
    /*O construtor da classe filha combina com o construtor da classe pai para a reutilização*/
    public Guerreiro(String nome, int hp, int mana, int ataque, int defesa, int poderMagico){
        super(nome, hp, mana, ataque, defesa, poderMagico);
    }

    //Sobrescrevendo o método quemSouEu() da classe pai Personagem
    @Override
    public String quemSouEu() {
        return new String(super.quemSouEu()+" com Ataque: "+getAtaque());
    }

    //Implementando o método danoBase() da classe pai Personagem
    @Override
    public int danoBase() {
        return this.getAtaque()+5;
    }

    //Implementando o método ataca() da interface Batalhador implementada
    @Override
    public void ataca(Batalhador b) {
        b.recebeDano(this.danoBase());
    }

    //Implementando o método recebeDano() da interface Batalhador implementada
    @Override
    public void recebeDano(int dano) {
        int danoRecebido = dano - (this.getDefesa()+3);
        this.setHp(this.getHp() - danoRecebido);
        System.out.println(this.getNome()+" recebeu "+danoRecebido+" de dano!");
    }
}
