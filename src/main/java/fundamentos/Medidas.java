// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[]args) {
        String opcao;
        int area = 0; // receber o resultado dos calculos de areas

        entrada = new Scanner (System.in); // instanciar o objeto de leitura do console

        System.out.println("Escolha o cálculo desejado: ");
        System.out.println("(1) - Área do quadrado");
        System.out.println("(2) - Área do retangulo");
        System.out.println("(3) - Área do triângulo");
        System.out.println("(4) - Área do circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch(opcao){
            case "1":
                area =  calcularAreaDoQuadrado();
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
            default:
                throw new IllegalStateException("Valor inválido. Tente novamente. " + opcao);

        }
        System.out.println("A área é de " + area + "m2" );
    }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado ^ 2; // retorna a área do quadrado
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
    public static int calcularAreaDoTriangulo(){

        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura / 2;

    }
    public static int calcularAreaDoCirculo(){

        int raio;

        System.out.println("Digite o tamanho do raio do circulo: ");
        raio = entrada.nextInt();
        return (int) (2 * 3.14 * raio);
    }
}
