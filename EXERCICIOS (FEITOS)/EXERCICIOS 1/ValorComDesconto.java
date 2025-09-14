import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor, ComDesconto;
        double desconto = 10;

        System.out.print("Digite o valor do produto:");
        valor = scanner.nextDouble();

        ComDesconto = valor - valor * desconto / 100;
        System.out.print("O valor do produto é:" + ComDesconto);
    }
}