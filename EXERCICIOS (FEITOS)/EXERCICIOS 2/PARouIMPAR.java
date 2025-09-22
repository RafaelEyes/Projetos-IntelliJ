import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero e falaremos se é par ou impar: ");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.print("O numero é par");
        } else {
            System.out.print("O numero é impar");
        }
    }
}