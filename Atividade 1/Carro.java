public class Carro{

    // atributos da classe -> características

    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preco;


    //métodos -> ações

    public void andar() {
        System.out.println("andando...");
    }

    public boolean frear() {
        System.out.println("freando...");
        return true;
    }

    public void correr(int velocidade) {
        System.out.println("Agora estou correndo à " + velocidade + " Kms/h!");
    }
     
    public static void main (String[] args) {

        //instânciando objetos da classe
        Carro C1 = new Carro();

        //declarei e depois instânciei o objeto
        Carro C2;
        C2 = new Carro();

        C1.ano = 2020;
        C1.cor = "vermelho";
        C1.andar();

        C2.marca = "Ferrari";
        C2.correr(300);

        Carro C3 = new Carro();
        C3.frear();

        Carro C4 = new Carro();
        C4.correr(180);


    }

}