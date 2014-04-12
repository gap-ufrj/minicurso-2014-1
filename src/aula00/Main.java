package aula00;

//Classe principal que possui o método inicial main()
public class Main {

    //Método inicial de execução do programa
    public static void main(String[] args){

        //Criação de um objeto da classe Guerreiro
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 150, 40, 18, 20, 3);
        //Criação de um objeto da classe Mago
        Mago mago = new Mago("Mago", 90, 180, 4, 11, 35);
        //Criação de um objeto da classe Dragão
        Dragao dragao = new Dragao(200, 15, 2);

        //Chamada ao método ataca()
        guerreiro.ataca(dragao);
        mago.ataca(dragao);
        dragao.ataca(guerreiro);
        dragao.ataca(mago);

        //Utilização dos getters e setters
        if(guerreiro.getHp() == 0){
            //Utilização do atributo static da classe Estado, classe que tem a função de armazenar constantes
            guerreiro.setEstado(Estado.MORTO);
        }
        if(mago.getHp() == 0){
            mago.setEstado(Estado.MORTO);
        }

        //Utilização de um método static
        Main.printPersonagem(guerreiro);
        Main.printPersonagem(mago);
    }

    //Demonstração de polimorfismo e utilização de um método static
    public static void printPersonagem(Personagem p){
        String print = p.quemSouEu();
        System.out.println(print);
    }
}
