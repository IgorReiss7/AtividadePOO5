package parte4;

import java.util.ArrayList;

public class VideoGame {
    public String nome;
   public String modelo;
    ArrayList<String> JogosDIsponiveis = new ArrayList<>();

    public void listarjogos() {
        System.out.println("Jogos disponiveis: ");
        for (String jogo : JogosDIsponiveis) {
            System.out.println("\t" + jogo);
        }
    }

    public void adicionarJogo(String novojogo) {
        JogosDIsponiveis.add(novojogo);
    }
}
