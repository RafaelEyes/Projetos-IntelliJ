import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double numero;
System.out.print("Digite um numero e veremos se é positivo ou negativo: ");
numero = scanner.nextDouble();
if (numero>0) {
    System.out.print("O numero é positivo");
}else{
    System.out.print("O numero é negativo");
        }
    }
}