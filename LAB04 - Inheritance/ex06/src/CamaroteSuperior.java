public class CamaroteSuperior extends VIP{
    private double valorAdicionalS;

    public CamaroteSuperior(double valor, double vA, double vAS) {
        super(valor, vA+vAS);
        this.valorAdicionalS = vAS;
    }

    public double getValorCamaroteS() {
        return getValorVIP() + valorAdicionalS;
    }

    public void setValorAdicionalS(double vAS) {
        this.valorAdicionalS = vAS;
    }
}