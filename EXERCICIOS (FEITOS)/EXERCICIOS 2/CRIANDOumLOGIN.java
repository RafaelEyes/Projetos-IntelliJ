import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Simulando um sistema de login*/


        Scanner scanner = new Scanner(System.in);

        String usuario;
        String senha;

        int contador = 0;
        while (contador <= 3) {

            System.out.println("Digite nome de usuário: ");
            usuario = scanner.nextLine();
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();

            if (usuario.equals("admin") && senha.equals("1234")) {
                System.out.println("Bem-vindo administrador");
            } else if (usuario.equals("admin") && senha != "1234") {
                System.out.println("senha incorreta");

            } else if (usuario.equals("professor") && senha.equals("4321")) {
                System.out.println("Bem-vindo, professor");
            } else if (usuario.equals("professor") && senha != "4321") {
                System.out.println("Senha incorreta");

            } else if (usuario.equals("aluno") && senha.equals("0000")) {
                System.out.println("Bem-vindo, aluno");
            } else if (usuario.equals("aluno") && senha != "0000") {
                System.out.print("Senha incorreta");

            } else System.out.println("Usuário não encontrAdo ");

            contador++;


        }
    }
}