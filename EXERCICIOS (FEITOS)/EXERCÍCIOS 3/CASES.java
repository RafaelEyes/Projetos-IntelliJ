import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Digite algum desses nomes: Rafael, Vitória, Milene: ");

        nome = scanner.nextLine();

        switch (nome) {

            case "Rafael":

                System.out.print("O aniversãrio do Rafael é 14 de agosto"); break;

            case "Milene":
                System.out.print("O aniversário da Vitória é 29 de julho"); break;

            case "Vitória":
                System.out.print("O aniversário da Milene é 29 de julho");break;

                default:
                System.out.print("Não existe um aniversariante com esse nome");



        }
    }
}