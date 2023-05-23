import java.util.Scanner;

public class Boxing {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();
        System.out.println("Numero digitado: "+ num);

        
        Integer i = num;
        System.out.println("Apos o boxing: " + i);

        teclado.close();
    }
}