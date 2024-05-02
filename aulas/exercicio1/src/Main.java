import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double largura, comprimento, valor_m, area, preco;


        System.out.println("digite a largura do terreno em metros:");
        largura = sc.nextDouble();
        sc.nextLine();
        System.out.println("digite o comprimento do terreno em metros:");
        comprimento = sc.nextDouble();
        sc.nextLine();
        System.out.println("digite o valor do metro quadrado do terreno: (apenas numeros)");
        valor_m = sc.nextDouble();
        sc.nextLine();

        area = largura * comprimento;
        preco = area * valor_m;

        System.out.printf("A área do terreno é %.2f metros quadrados e o preço é R$ %.2f reais", area, preco);
        sc.close();
        }
    }
