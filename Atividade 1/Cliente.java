public class Cliente {

    //atributos da classe
    String nome;
    String sexo;
    int idade;
    boolean financiamento;
    int parcela;


    //métodos
    public void nome() {
        System.out.println("\nO cliente é... " + nome);
    }

    public void sexo() {
        System.out.println("É do sexo " + sexo);
    }

    public void idade() {
        System.out.println("Sua idade é " + idade + " anos");
    }

    public void financiamento() {
        if(financiamento==true) {
            System.out.println("Esse cliente possui financiamento");
        }
        else {
            System.out.println("Esse cliente não possui financiamento");
        }
    }

    public void parcela() {
        System.out.println("Financiamento feito em " + parcela + " parcelas \n");
    }

    public static void main (String[] args) {

        //instânciando objetos da classe

        Cliente C1 = new Cliente();
        
        C1.nome = "Jordan Pereira";
        C1.sexo = "Masculino";
        C1.idade = 27;
        C1.financiamento = true;
        C1.parcela = 36;
        
        C1.nome();
        C1.sexo();
        C1.idade();
        C1.financiamento();
        C1.parcela();


        Cliente C2 = new Cliente();

        C2.nome = "Patrick Souza";
        C2.sexo = "Masculino";
        C2.idade = 23;
        C2.financiamento = false;

        C2.nome();
        C2.sexo();
        C2.idade();
        C2.financiamento();
    }
    
}
