public class Ingresso{
    private double valor;

    public Ingresso(double v) {
        this.valor = v;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double v) {
        this.valor = v;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}