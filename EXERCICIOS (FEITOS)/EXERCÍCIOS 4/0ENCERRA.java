import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int numero;
        int numeroquantidade = 0;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero != 0) {

            System.out.print("Digite outro número (digite 0 para parar): ");
            numero = scanner.nextInt();

        }


        System.out.print("A quantidade de números digitos antes do 0 é " + numero);

        System.out.println("Programa encerrado");
    }
}
