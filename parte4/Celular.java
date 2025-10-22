package parte4;

public class Celular {
    public String marca;
    public String modelo;
    float nivelBateria = 100;
    boolean ligado = false;

    public void ligar(){
        if (!ligado) {
            ligado = true;
            System.out.println("O celular foi ligado.");
        } else {
            System.out.println("O celular está ligado.");
        }
    }


        public void enviarMensagem(String mensagem){
            if (ligado){
                if (nivelBateria >0){
                    System.out.println(("Enviar mensagem "+ mensagem));
                    nivelBateria -= 10;
                } else {
                    System.out.println("Nivel da bateria está fraca! Carregue o dispositivo");
                }
            } else {
                System.out.println(("Celular desligado. Ligue"));
            }
        }
        public void carregar() {
        nivelBateria = 100;
        System.out.println("O celular foi carregado totalmente!");
    }
    } //tive uma pequena ajuda do chat nessa, me perdi na logica da mensagem

