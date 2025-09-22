import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int numero;
System.out.print("Digite sua idade e falaremos se vocÊ é de maior ou menor: ");
numero = scanner.nextInt();
if ( numero >=18) {
    System.out.print("Você é de maior");
} else {
    System.out.print("Você é de menor");
}
    }
}