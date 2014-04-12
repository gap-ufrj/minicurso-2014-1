package aula00;

//Declaração da classe abstrata Personagem
public abstract class Personagem {

    //Encapsulamento: mudança do modificador de acesso public para private
    /*public String nome;
    public int hp, mana;
    public int ataque, defesa, poderMagico;
    public int estado;*/

    private String nome;
    private int hp, mana;
    private int ataque, defesa, poderMagico;
    private int estado;

    /*Embora possua um construtor, essa classe não pode ser instanciada, pois é uma classe abstrata*/
    //Seu construtor serve para ser reaproveitado pelas classes filhas

    //public Personagem(String _nome, int _hp, int _ataque, int _defesa, int _poderMagico){
    public Personagem(String nome, int hp, int mana, int ataque, int defesa, int poderMagico){

        //Mudança para utilização da palavra this
        /*nome = _nome;
        hp = _hp;
        mana = _mana;
        ataque = _ataque;
        defesa = _defesa;
        poderMagico = _poderMagico;
        estado = Estado.VIVO;*/

        //A palavra this referencia o objeto que chamou o método/construtor
        this.nome = nome;
        this.hp = hp;
        this.mana = mana;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderMagico = poderMagico;
        this.estado = Estado.VIVO;
    }

    //Método que retorna os atributos de um Personagem
    public String quemSouEu(){
        return this.getNome()+" com HP: "+this.getHp()+" e Mana: "+this.getMana();
    }

    //Método abstrado danoBase()
    /*Um método abstrato deve ser obrigatoriamente implementado na classe filha*/
    public abstract int danoBase();

    /*Getters e setters*/

    public String getNome() {
        return nome;
    }

    //Comentado porque não possuo interesse em permitir a mudança do nome de um personagem
    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public int getHp() {
        return hp;
    }

    //Um exemplo do motivo pelo qual o encapsulamento é utilizado
    public void setHp(int hp) {
        if(hp < 0){
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
