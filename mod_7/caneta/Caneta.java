
/*
 * Aluno: Joao Vitor
 */

 public class Caneta {

//  Variáveis

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

//  Métodos

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public boolean getTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

//  Métodos Especiais

    public void status() {
        System.out.println("Cor: " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Está tampada? " + this.getTampada());
        System.out.println("Ponta: " + this.getPonta());
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Nao posso rabiscar, a caneta está tampada.");
        }else
            System.out.println("Estou rabiscando");
    }

    public void tampar() {
        this.setTampada(true);
    }

    public void destampar() {
        this.setTampada(false);
    }
}