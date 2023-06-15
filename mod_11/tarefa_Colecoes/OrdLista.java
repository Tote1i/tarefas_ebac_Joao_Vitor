import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdLista {
    public static void main(String[] args) {
        lista();
    }

    private static void lista() {
        List<String> lista = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira 4 nomes: ");
        for ( int x = 1; x <= 4; x++ ) {
            lista.add(teclado.next());
        }

        Collections.sort(lista);
        System.out.println(lista);
        
        teclado.close();
    }
}