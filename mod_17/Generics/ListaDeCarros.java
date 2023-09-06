import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros {
    public static void main(String[] args) {
        // Criar uma lista genérica para armazenar carros
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionar instâncias de marcas de carros à lista
        listaDeCarros.add(new Toyota());
        listaDeCarros.add(new Ford());
        listaDeCarros.add(new BMW());

        // Iterar sobre a lista e acessar informações de cada carro
        for (Carro carro : listaDeCarros) {
            System.out.println("Marca: " + carro.getNome() + ", País de Origem: " + carro.getPaisOrigem());
        }
    }
}
