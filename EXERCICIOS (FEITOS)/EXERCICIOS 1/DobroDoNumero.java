import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        double dobro;

        System.out.print("Digite o numeroreal:");
        numero = scanner.nextDouble();
        dobro = numero * 2;
        System.out.print("O dobro do numero real é:" + dobro);
    }
}