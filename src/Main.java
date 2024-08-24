import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boleto1, boleto2, boleto3,boleto4, total, salario, sobra;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        salario = ler.nextDouble();

        System.out.println("Digite o 1º boleto:");
        boleto1 = ler.nextDouble();

        System.out.println("Digite o 2º boleto:");
        boleto2 = ler.nextDouble();

        System.out.println("Digite o 3º boleto:");
        boleto3 = ler.nextDouble();

        System.out.println("Digite o 4º boleto:");
        boleto4 = ler.nextDouble();

        total = (boleto1+boleto2+boleto3+boleto4);
        salario = salario * 0.86;
        sobra = salario - total;
        System.out.print("O seu salário liquido é: " + salario);
        System.out.print("\no TOTAL DA FACADA É: " + total);
        System.out.print("\nO que sobrou de salário foi: " + sobra);
    }
}