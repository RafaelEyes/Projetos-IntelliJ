import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int par = 0;
        int impar = 0;
        int multiplo5 = 0;

        System.out.print("Digite um número: ");

        numero = scanner.nextInt();

        while (numero != 0) {

            System.out.print("Digite outro número (digite 0 para parar): ");
            numero = scanner.nextInt();
            quantidade++;

            if (numero % 2 == 0) {
                par++;

            } else {
                impar++;
            }
            if (numero % 5 == 0) ;
            multiplo5++;
        }

        System.out.println("A quantidade de números digitos antes do 0 é " + quantidade);
        System.out.println("A quantidade de números pares é " + par);
        System.out.println("A quantidade de número ímpares é " + impar);
        System.out.println("A quantidade de números múltiplos de 5 é " + multiplo5);

        System.out.println("Programa encerrado");
    }
}
