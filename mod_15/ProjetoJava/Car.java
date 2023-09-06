public class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    //  Construtor
    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void clean() {
        System.out.println("Limpando...");
    }

    public void mechanicCheck() {
        System.out.println("Checando parte mecanica...");
    }

    public void fuelCar() {
        System.out.println("Checando combustivel...");
    }

    public void startEngine() {
    }


}
