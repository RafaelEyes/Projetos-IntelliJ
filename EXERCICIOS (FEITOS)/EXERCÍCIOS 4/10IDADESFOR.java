import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int maiordeidade = 0;
        int menoresdeidade = 0;

        for (int x = 1; x <= 10; x++) {

            System.out.print("Digite a idade da pessoa número " + x + ":");

            idade = scanner.nextInt();

            if (idade >= 18) {
                maiordeidade++;

            }else{
                menoresdeidade++;
            }
        }
        System.out.println("Existem " + maiordeidade + " maior de idade");
        System.out.print("Existem " + menoresdeidade + " menor de idade");
    }
}