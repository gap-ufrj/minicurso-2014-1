package aula00;

//Declaração da classe abstrata Monstro
public abstract class Monstro {

    //Encapsulamento: mudança do modificador de acesso public para private
    private int hp;
    private int ataque, defesa;
    private int estado;

    /*Embora possua um construtor, essa classe não pode ser instanciada, pois é uma classe abstrata*/
    //Seu construtor serve para ser reaproveitado pelas classes filhas
    public Monstro(int hp, int ataque, int defesa){
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.estado = Estado.VIVO;
    }

    /*Getters e setters*/

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
