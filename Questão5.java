git import java.util.Scanner;
public class Questão5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int valor = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + valor + " = " + (valor*i));
        }
    }
}