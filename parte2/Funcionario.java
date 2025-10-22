package parte2;

public class Funcionario {
    public String nome;
    public double salarioMensal;
    
    public double SalarioAnual() {
        return salarioMensal * 12;
    }

    public void AumentarSalario (double percentual) {
          salarioMensal = salarioMensal + (salarioMensal * (percentual / 100)); //não precisa retornar nada, só atualiza o salárioMensal.
    }

}
