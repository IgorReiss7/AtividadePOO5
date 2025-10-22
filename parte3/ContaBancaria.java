package parte3;

public class ContaBancaria {
    public int numeroconta;
   public  double saldo = 0;

   public double depositar(double valordeposito) {
        return saldo += valordeposito;
    }

   public void sacar(double valorsaque) {
        if (valorsaque <= saldo) {
            saldo -= valorsaque;
        } else
            System.out.println(("Saldo insuficiente."));
    }

   public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
