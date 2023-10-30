// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Objects;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        String opcao = "1"; // criando a variável opcao, do tipo String, e está colocando dentro dela o valor 1

        int area = 0; // receber o resultado dos calculos de areas

        while (!Objects.equals(opcao.toUpperCase(), "S")) {

            entrada = new Scanner(System.in); // instanciar o objeto de leitura do console

            System.out.println("Escolha o cálculo desejado: ");
            System.out.println("(1) - Área do quadrado");
            System.out.println("(2) - Área do retangulo");
            System.out.println("(3) - Área do triângulo");
            System.out.println("(4) - Área do circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S) - SAIR");

            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    break;
                case "2":
                    area = calcularAreaDoRetangulo();
                    break;
                case "3":
                    area = calcularAreaDoTriangulo();
                    break;
                case "4":
                    area = calcularAreaDoCirculo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (area > 0) {
                System.out.println("A área é de " + area + "m².");
            }

        }

    }

    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a área do quadrado
    }

    public static int calcularAreaDoRetangulo(){

        int altura;
        int largura;

        System.out.println("Digite o tamanho da largura: ");
        largura = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return altura * largura;
    }

    public static int calcularAreaDoTriangulo() {

        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura / 2;

    }

    public static int calcularAreaDoCirculo() {

        int raio;

        System.out.println("Digite o tamanho do raio do circulo: ");
        raio = entrada.nextInt();
        return (int) (2 * 3.14 * raio);
    }

    public static void tabuada() {
        System.out.println("Você quer calcular a tabuada de qual número?");
        byte numero = entrada.nextByte();

        for (byte i = 1; i <= 10; i++) {
            System.out.print(numero * i + " ");
        }
    }

    public static void fibonacci() {
        System.out.println("Quantos números você deseja calcular na sequencia?");

        byte numero = entrada.nextByte();

        switch (numero) {
            case 0:
                System.out.println("A sequencia está vazia.");
                break;
            case 1:
                System.out.print("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for (byte i = 2; i <= numero; i++) {
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }
    }
    public static void contagemRegressiva() {

        System.out.println("Começar a contagem a partir de qual número?");
        int numero = entrada.nextInt();

        System.out.println("Diminuindo de quantos em quantos números por vez?");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1; i -= decrescimo) {
            System.out.println(i);
        }
    }
}
