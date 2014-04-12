package aula00;

//Declaração da interface Batalhador
public interface Batalhador {

    /*Uma interface não pode ser instanciada*/

    //Declaração dos métodos abstratos da interface
    /*Um método abstrato deve ser obrigatoriamente implementado na classe que implementar a interface*/
    public void ataca (Batalhador b);
    public void recebeDano(int dano);

}
