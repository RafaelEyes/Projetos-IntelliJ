import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Simulando um sistema de login*/


        Scanner scanner = new Scanner(System.in);

        String usuario;
        String senha;

        boolean acertou = false;
        while (acertou== false) {

        System.out.println("Digite nome de usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Bem-vindo administrador");
            acertou = true;

        } else if (usuario.equals("professor") && senha.equals("4321")) {
            System.out.println("Bem-vindo, professor");
            acertou = true;

        } else if (usuario.equals("aluno") && senha.equals("0000")) {
            System.out.println("Bem-vindo, aluno");
            acertou = true;

        } else System.out.println("Usuário não encontrado ");
            acertwseou = false;

        }
    }
}