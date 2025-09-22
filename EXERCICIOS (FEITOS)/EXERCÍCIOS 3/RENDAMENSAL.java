import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*Lendo valor da renda mensal de uma pessoa*/

        Scanner scanner = new Scanner(System.in);

        double rendamensal;
        double prestacao;

        System.out.print("Digite sua renda mensal: ");
        rendamensal = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        prestacao = scanner.nextDouble();

        if (prestacao > rendamensal * 0.3) {

            System.out.print("Financiamneto negado por alta pretação " +
                    "(maior que 30% da renda mensal");

        } else if (prestacao > 3000 && rendamensal < 10000) {


            System.out.print
                    ("Financiamneto negado por baixa renda " +
                            "(prestação exige um salario igual ou maior a 10,000.00");

        } else {
            System.out.print("Financiamento aprovado");


        }
    }
}