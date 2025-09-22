import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*Triângulo válido ou não
        Leia três valores e verifique se eles podem formar um triângulo.
    (Condição: cada lado deve ser menor que a soma dos outros dois)*/
        Scanner scanner = new Scanner(System.in);

        double t1;
        double t2;
        double t3;

        System.out.println("Descobriremos se 3 valores aleatorios formam uma triangulo");

        System.out.print("Informe o primeiro valor: ");
        t1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor ");
        t2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        t3 = scanner.nextDouble();

        if (t1 < t2 + t3 && t2 < t1 + t3 && t3 < t3 + t2) {
            System.out.print("Não é um triângulo");

    }else{
            System.out.print("É um triângulo");

    }
    }
}