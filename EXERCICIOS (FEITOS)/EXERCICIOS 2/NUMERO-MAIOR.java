import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Leia três números inteiros e mostre qual deles é o maior*/


Scanner scanner = new Scanner(System.in);

int numb1;
int numb2;
int numb3;

System.out.println("Digite 3 numeros e diremos qual é maior");

System.out.print("Digite o primeiro numero: ");
numb1 = scanner.nextInt();

System.out.print("Digite o segundo numero: ");
numb2 = scanner.nextInt();

System.out.print("Digite o terceiro numero: ");
numb3 = scanner.nextInt();

if (numb1 >= numb2 && numb1>= numb3) {
    System.out.print("O maior número é o primeiro: " + numb1);

}else if (numb2 >= numb1 & numb2>= numb3) {
    System.out.print("O maior número é o segundo: " + numb2);

}else{
    System.out.print("O maior número é o terceiro: " + numb3);


        }
    }
}