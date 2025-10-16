import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ;
        /* IMPRIMINDO METADE DE 10 NÚMEROS

         */

        Scanner scanner = new Scanner(System.in);

        double numero;

        for (int x = 1; x<=10; x++){
            System.out.print("Digite o " + x + " número: ");
            numero = scanner.nextDouble();

            System.out.println("A metadde de " + numero + " é " + numero/2);


    }
}
}