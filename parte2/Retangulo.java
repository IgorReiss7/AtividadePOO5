package parte2;

public class Retangulo {
    public double largura; //como não estava enxergando os atributos, tive que deixar publico
    public double altura;

    public double Area() {
        return largura * altura;

    }
    public double Perimetro () {
        return largura *2+altura*2;
    }
}