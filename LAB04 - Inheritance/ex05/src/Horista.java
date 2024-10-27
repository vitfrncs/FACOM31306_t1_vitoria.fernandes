public class Horista extends Funcionario{
    private double valorHr;
    private int totalHrs;


    public Horista(String n, String d, double v, int t) {
        super(n, d, "HORISTA");
        this.valorHr = v;
        this.totalHrs = t;
    }

    @Override
    public double calcularSalario() {
        salario = valorHr * totalHrs;
        return salario;
    }

    public int getTotalHrs() {
        return totalHrs;

    }

    public void setTotalHrs(int t) {
        this.totalHrs = t;
        super.setSalario(t*valorHr);
    }

    public double getValorHr() {
        return valorHr;
    }

    public void setValorHr(double v) {
        this.valorHr = v;
        super.setSalario(v*totalHrs);
    }
}