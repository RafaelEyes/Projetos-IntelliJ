import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int numero1;
System.out.print("Digite um número: ");
numero1 = scanner.nextInt();

for(int numero = numero1; numero<50; numero++){
    System.out.println(numero1 + "+" + numero + "= " + (numero1 + numero));
        }
    }
}