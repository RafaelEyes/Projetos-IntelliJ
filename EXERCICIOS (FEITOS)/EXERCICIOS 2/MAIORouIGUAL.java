import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.print("Digite o numero1 ");
        numero = scanner.nextInt();
        System.out.print("Digite o numero2 ");
        numero2 = scanner.nextInt();
        if (numero > numero2) {
            System.out.print("O numero maior é " + numero);
        } else if (numero2 > numero){
        System.out.print("O numero maior é " + numero2);
    }else{
        System.out.print("Os dois numeros são iguais ");

        }
    }
}