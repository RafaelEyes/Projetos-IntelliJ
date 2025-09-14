import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade;
        double meses;
        System.out.print("Digite sua idade:" );
        idade = scanner.nextDouble();
        meses = idade * 12;
        System.out.print("A sua idade em meses é: " + meses);

    }
}