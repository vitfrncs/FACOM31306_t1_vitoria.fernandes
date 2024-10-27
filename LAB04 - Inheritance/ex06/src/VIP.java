public class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double vA) {
        super(valor+vA);
        this.valorAdicional = vA;
    }

    public double getValorVIP() {
        return getValor() + valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}