package aula00;

//Declaração da classe Estado
/*O objetivo dessa classe é armazenar alguns valores constantes com nomes que facilitam a sua utilização*/
//O modificador final informa que não é possível estender a classe Estado
public final class Estado {

    //Um construtor privado impede que a classe Estado seja instanciada
    private Estado(){}

    //Um atributo static pertence diretamente a classe, ou seja, não é necessário instanciar a classe para utilizá-lo
    /*Um atributo final não pode ser modificado (constante)*/
    public static final int VIVO = 0;
    public static final int MORTO = 1;
    public static final int ENVENENADO = 2;
    public static final int CEGO = 3;
    public static final int SILENCIADO = 4;
}
