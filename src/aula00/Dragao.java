package aula00;

//Declaração da classe Dragao
/*Extends indica que Dragao herda da classe Monstro*/
/*Implements indica que Dragao implementa a interface Batalhador*/
public class Dragao extends Monstro implements Batalhador{

    //Construtor da classe Dragao
    /*O construtor da classe filha combina com o construtor da classe pai para a reutilização*/
    public Dragao(int hp, int ataque, int defesa) {
        //A palavra super referencia a classe pai de Dragao
        /*Nesse caso, estamos utilizando a palavra super para chamar o construtor da classe pai Monstro*/
        super(hp, ataque, defesa);
    }

    //Implementando o método ataca() da interface Batalhador implementada
    @Override
    public void ataca(Batalhador b) {
        b.recebeDano(this.getAtaque()*10);
    }

    //Implementando o método recebeDano() da interface Batalhador implementada
    @Override
    public void recebeDano(int dano) {
        int danoRecebido = dano/this.getDefesa();
        this.setHp(this.getHp()-danoRecebido);
        System.out.println("Dragão recebeu "+danoRecebido+" de dano!");
    }
}
