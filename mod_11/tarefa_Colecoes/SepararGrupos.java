import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararGrupos {

    public static void main(String[] args) {
        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e o sexo da pessoa (exemplo: Luana-F, José-M).");
        System.out.println("Digite 'sair' para encerrar a entrada de dados.");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1].toUpperCase();

                if (sexo.equals("F")) {
                    nomesFemininos.add(nome);
                } else if (sexo.equals("M")) {
                    nomesMasculinos.add(nome);
                }
            } else {
                System.out.println("Entrada inválida. Digite novamente.");
            }
        }

        System.out.println("Nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("Nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
        scanner.close();
    }
}

