import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota 1 : ");
        int n1 = teclado.nextInt();
        System.out.print("Nota 2 : ");
        int n2 = teclado.nextInt();
        System.out.print("Nota 3 : ");
        int n3 = teclado.nextInt();
        System.out.print("Nota 4 : ");
        int n4 = teclado.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

//  Condições

        if(media >= 7) {
            System.out.println("Aprovado!");
        }else if(media >= 5) {
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
    }
}