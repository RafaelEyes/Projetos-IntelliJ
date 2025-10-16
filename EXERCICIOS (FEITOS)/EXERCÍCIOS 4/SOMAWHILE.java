import java.util.SequencedSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int acumulador = 0;

        for (int numero = 1; numero <= 100; numero++) {


            System.out.println(numero);

            acumulador = acumulador + numero;


        }
        System.out.print("Somatorio de 1 a 100 é: " + acumulador);

    }
}
