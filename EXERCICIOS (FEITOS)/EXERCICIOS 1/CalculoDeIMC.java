import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura;
        double peso;
        double IMC;
        System.out.print("Digite sua altura em cm:");
        altura = scanner.nextDouble();;

        System.out.print("Digite seu peso em kg:");
        peso = scanner.nextDouble();

        IMC = peso / (altura * altura);
        System.out.print("O seu IMC é igual a: " + IMC)
    }
}