public class CompanyCarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Tesla(120, "full", "blue");
            case "B":
                return new Audi(130, "full", "black");
            default:
            System.out.println("O carro solicitado nao esta disponivel.");
            return null;
        }
    
    }
}
