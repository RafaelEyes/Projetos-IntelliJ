import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Leia a idade de um nadador e classifique-o em uma categoria:
        Infantil (até 12 anos)
        Juvenil (13 a 17 anos)
        Adulto (18 anos ou mais*/

        Scanner scanner = new Scanner(System.in);

        double idade;
        System.out.print("Digite sua idade e classificaremos você em uma categoria: ");
        idade = scanner.nextInt();


        if (idade <13) {
            System.out.print("Entra na categoria infantil");

        } else if (idade <18) {
            System.out.print("Entra na categoria juvenil");

        } else if (idade>=18){
            System.out.print("Entra na categoria adulto");
        }
    }
}