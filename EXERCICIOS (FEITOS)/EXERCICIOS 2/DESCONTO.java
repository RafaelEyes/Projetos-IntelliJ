import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Leia o valor de uma compra. Se for maior ou igual a 100 reais,
            aplique 10% de desconto. Caso contrário, não aplique desconto.
        Mostre o valor final.
        */
        double valor;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        valor = scanner.nextDouble();

        if (valor >=100) {
            valor = valor * 0.9;
            System.out.print("Você recebeu 10% de desconto, o valor agora é de " + valor + " reais");
        } else  {
            System.out.print("Você não recebeu desconto algum, seu valor permanece o mesmo: ");

        }
    }
}