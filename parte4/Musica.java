package parte4;

public class Musica {
    public String titulo;
    public String artista;
    public double duracao; // em minutos, por exemplo

    public void tocar() {
        System.out.println("Tocando "+ titulo+ " de "+ artista + "...");
    }

}
