import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.print("Digite sua nota e informaremos se foi aprovado. reprovado ou se esta de recuperação: ");
        nota = scanner.nextDouble();
        if (nota >= 7) {
            System.out.print("Aprovado");
        } else if (nota >= 4) {
            System.out.print("VocÊ está de recuperação ");
        } else
        System.out.print("Reprovado");
        }
    }
