import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        double soma, media;
        System.out.print("Digite o primeiro numero inteiro:");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero inteiro: ");
        num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro inteiro: ");
        num3 = scanner.nextDouble();

        soma = num1 + num2 + num3;
        media = soma / 3;
        System.out.print("A soma é: " + soma);
        System.out.print(" A media é: " + media);
    }
}