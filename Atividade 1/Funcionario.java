public class Funcionario {

    //atributos da classe
    String nome;
    String sexo;
    int idade;
    int setor;
    String cargo;
    int carga_horaria;
    float salario;


    //métodos
    public void nome() {
        System.out.println("O funcionário é... " + nome);
    }

    public void sexo() {
        System.out.println("É do sexo " + sexo);
    }

    public void idade() {
        System.out.println("Sua idade é de " + idade + " anos");
    }

    public void setor() {
        System.out.println("Trabalha no setor " + setor + ",");
    }

    public void cargo() {
        System.out.println("Atuando como " + cargo);
    }

    public void carga_horaria() {
        System.out.println("Sua carga horária semanal é de " + carga_horaria + " horas");
    }

    public void salario() {
        System.out.println("E seu salário é de " + salario + " reais");
    }

    public static void main (String[] args) {

        Funcionario F1 = new Funcionario();
        
        F1.nome = "Tiago Camillo";
        F1.sexo = "Masculino";
        F1.idade = 18;
        F1.setor = 03;
        F1.cargo = "estagiário";
        F1.carga_horaria = 30;
        F1.salario = 700;

        F1.nome();
        F1.sexo();
        F1.idade();
        F1.setor();
        F1.cargo();
        F1.carga_horaria();
        F1.salario();

    }
    
}
