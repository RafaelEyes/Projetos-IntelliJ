import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double soma;
        double diferenca;
        double produto;
        double quociente;

        System.out.print( "Digite o primeiro numero real: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero real: ");
        num2 = scanner.nextDouble();

        soma = num1 + num2;
        diferenca = num1 - num2;
        produto =  num1 * num2;
        quociente = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("produto: " + produto);
        System.out.println("diferenca: " + diferenca);
        System.out.println("quociente: " + quociente);

    }
}