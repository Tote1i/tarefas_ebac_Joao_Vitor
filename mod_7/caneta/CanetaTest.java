public class CanetaTest {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.setModelo("Esferografica");
        c1.setCor("Azul");
        c1.setPonta(0.7f);
        c1.setTampada(false);
        c1.status();
        c1.rabiscar();
    }
}
