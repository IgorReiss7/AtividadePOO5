package parte1;

import parte2.Aluno;
import parte2.Funcionario;
import parte2.Retangulo;
import parte3.ContaBancaria;
import parte3.Relogio;
import parte3.Temperatura;
import parte4.Animal;
import parte4.Celular;
import parte4.Musica;
import parte4.VideoGame;

public class App {
  public static void main(String[] args) {
    // Pessoa p1 = new Pessoa();
    // p1.nome = "Jorge";
    // p1.idade = 20;
    // p1.Apresentar();

    // Carro c1 = new Carro();
    // c1.marca = "Chevrolet";
    // c1.modelo = "Onix";
    // c1.ano = 2024;
    // c1.ExibirInformacoes();

    // Produto pr1 = new Produto();
    // pr1.nome = "Arroz Koblenz";
    // pr1.preco = 29.90;
    // pr1.quantidade = 18;
    // pr1.CalcularValorTotal();

    // Livro l1 = new Livro();
    // l1.titulo = "O Pequeno Príncipe";
    // l1.autor = "Antoine de Saint-Exupéry";
    // l1.numPaginas = 96;
    // l1.Resumo();
    /*
     * Aluno a1 = new Aluno();
     * a1.nome = "Gabriel";
     * a1.nota1 = 2;
     * a1.nota2 = 10;
     * a1.resultado();
     * 
     * Aluno a2 = new Aluno();
     * a2.nome = "João";
     * a2.nota1 = 8;
     * a2.nota2 = 9;
     * a2.resultado();
     */

    /*
     * Retangulo r1 = new Retangulo();
     * r1.largura = 5;
     * r1.altura = 3;
     * System.out.println("Área: " + r1.Area());
     * System.out.println("Perímetro: " + r1.Perimetro());
     */

    /*
     * Funcionario f1 = new Funcionario();
     * f1.nome = "Igor";
     * f1.salarioMensal = 2500;
     * 
     * System.out.print("Salário anual: " + f1.SalarioAnual());
     * 
     * f1.AumentarSalario(10); //aumenta 10%
     * System.out.println("Novo salário mensal: " + f1.salarioMensal);
     */

     /*VideoGame vg1 = new VideoGame();
     vg1.nome = "PS2";
     vg1.modelo = "FAT";

     vg1.adicionarJogo("Downhill Domination");
        vg1.adicionarJogo("GTA San Andreas");
        vg1.adicionarJogo("God of War 2");

     vg1.listarjogos();*/


    /* ContaBancaria cb1 = new ContaBancaria();
     cb1.numeroconta = 1542;
     cb1.depositar(500);
     cb1.exibirSaldo();
      cb1.sacar(200);
      cb1.exibirSaldo();
      cb1.sacar(400); */

      /*Temperatura temp = new Temperatura();
      temp.celsius = 25;
      System.out.println("Em Fahrenheit: " + temp.paraFahrenheit());
      System.out.println("Em Kelvin: " + temp.paraKelvin()); */

    /*Relogio rel = new Relogio();
    rel.hora = 03;
    rel.minuto = 37;
    rel.segundo = 57;
    rel.exibirHorario();*/

     /*  Celular c1 = new Celular();
        c1.marca ="Samsung";
        c1.modelo ="Galaxy S23";
        c1.ligar();
        c1.enviarMensagem("\nOlá, boa tarde?");
        c1.enviarMensagem("\nMensagem 2");
        c1.carregar();*/

         /*Animal a1 = new Animal();
        a1.nome = "Falcão-Peregrino";
        a1.especie = "alco peregrinus";
        a1.idade = 4;
        System.out.println("Nome: "+a1.nome);
        System.out.println("Espécie:" +a1.especie);
        System.out.println("Idade:" +a1.idade+" anos");
        a1.emitirSom();*/

        Musica m1 = new Musica();
        m1.titulo = "ÈTPM";
        m1.artista = "Jovem Dex";
        m1.duracao = 3.02;
        m1.tocar();
    }
  }
