import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número menor que 100: ");
        numero = scanner.nextInt();
        while (numero <=100) {
            System.out.println(numero);
            numero++;
        }
    }
}