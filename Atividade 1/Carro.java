public class Carro{

    // atributos da classe -> características

    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    short ano;
    double preco;


    //métodos -> ações

    public void placa() {
        System.out.println("\nO carro tem a placa "+ placa);
    }

    public void potencia() {
        System.out.println("Com uma potência de " + potencia + "!!");
    }

    public void modelo() {
        System.out.println("Modelo " + modelo);
    }

    public void cor() {
        System.out.println("De cor " + cor);
    }

    public void marca() {
        System.out.println("Marca " + marca);
    }

    public void cambio_automatico() {
        if(cambio_automatico==true) {
            System.out.println("Possuindo câmbio automático");
        }
        else {
            System.out.println("Não tendo câmbio automático");
        }
    }

    public void ano() {
        System.out.println("Ano " + ano);
    }

    public void preco() {
        System.out.println("Custando apenas " + preco + " reais!!");
    }

    public void andar() {
        System.out.println("\nEle está andando...");
    }

    public boolean frear() {
        System.out.println("Agora está freando...");
        return true;
    }

    public void correr(int velocidade) {
        System.out.println("Com uma velocidade de " + velocidade + " Kms/h!");
    }
     
    public static void main (String[] args) {

        //instânciando objetos da classe
        Carro C1 = new Carro();

        //declarei e depois instânciei o objeto
        Carro C2;
        C2 = new Carro();

        C1.placa = "RTX-4050";
        C1.potencia = 2000;
        C1.modelo = "X1";
        C1.cor = "vermelho";
        C1.marca = "BMW";
        C1.cambio_automatico = true;
        C1.ano = 2020;
        C1.preco = 456000.58;

        C1.placa();
        C1.potencia();
        C1.modelo();
        C1.cor();
        C1.marca();
        C1.cambio_automatico();
        C1.ano();
        C1.preco();

        C1.andar();
        C1.correr(300);
        C1.frear();
        C1.correr(90);


    }

}