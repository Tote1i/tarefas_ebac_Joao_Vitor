public class CarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Volkswagen(100, "full", "blue");
            case "B":
                return new Toyota(90, "full", "black");
            default:
            System.out.println("O carro solicitado nao esta disponivel.");
            return null;
        }
        
    }
    
}
