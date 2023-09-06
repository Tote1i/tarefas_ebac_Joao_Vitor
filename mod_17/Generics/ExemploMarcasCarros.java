// Classe base para representar um carro
class Carro {
    private String nome;
    private String paisOrigem;

    public Carro(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }
}

// Classe representando uma marca de carro
class Toyota extends Carro {
    public Toyota() {
        super("Toyota", "Japão");
    }
}

// Classe representando outra marca de carro
class Ford extends Carro {
    public Ford() {
        super("Ford", "Estados Unidos");
    }
}

// Classe representando mais uma marca de carro
class BMW extends Carro {
    public BMW() {
        super("BMW", "Alemanha");
    }
}

public class ExemploMarcasCarros {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Ford ford = new Ford();
        BMW bmw = new BMW();

        System.out.println("Marca: " + toyota.getNome() + ", País de Origem: " + toyota.getPaisOrigem());
        System.out.println("Marca: " + ford.getNome() + ", País de Origem: " + ford.getPaisOrigem());
        System.out.println("Marca: " + bmw.getNome() + ", País de Origem: " + bmw.getPaisOrigem());
    }
}
