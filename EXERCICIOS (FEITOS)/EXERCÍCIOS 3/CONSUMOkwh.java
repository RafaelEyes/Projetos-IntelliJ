import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


Scanner scanner = new Scanner (System.in);

int consumo;
double valorporkwh;
double valorconta;

System.out.print("Digite a quantidade de kWh consumidos: ");
consumo = scanner.nextInt();

if (consumo<= 100) {
    valorporkwh = 0.50;

}else if (consumo <= 200) {
    valorporkwh = 0.70;

}else
    valorporkwh = 0.90;

    valorconta = valorporkwh * consumo;

    System.out.println("O valor a ser pago é de: " + valorconta);

    if (consumo >500) {
        System.out.print("Consumo elevado: considere economizar energia");

    } else if (consumo >200) {
      valorconta = valorconta * 0.90;

    }else if (consumo<30){

    System.out.print
            ("Valou igual ou inferior R$ 30,00. O valor será somado e cobrado na próxima conta ");

        }
    }
}