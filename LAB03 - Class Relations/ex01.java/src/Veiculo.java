public class Veiculo {
    private String modelo;
    private double valor;

    public Veiculo(String m, double v) {
        this.modelo = m;
        this.valor = v;
    }

    //getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}