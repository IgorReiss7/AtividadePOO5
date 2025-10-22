package parte2;


public class Aluno {
       public String nome;
    public double nota1;
    public double nota2;

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return media() >= 7;
    }

    public void resultado() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media());
        System.out.println("Aprovado: " + (aprovado() ? "Sim" : "Não"));
    }
}

