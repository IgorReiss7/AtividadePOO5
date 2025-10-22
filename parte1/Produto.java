package parte1;

public class Produto {
    String nome;
    Double preco;
    float quantidade;
    void CalcularValorTotal(){
        double total = preco * quantidade;
        System.out.printf("O valor total do estoque em estoque: %.2f\n",total);
    }
}
