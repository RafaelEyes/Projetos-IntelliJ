import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        while (idade < 18){
            System.out.println("Você tem " + idade + " anos, ainda não pode entrar");
            idade++;
        }
        System.out.println("Você " + idade + " anos,agora pode entrar");
    }
}
