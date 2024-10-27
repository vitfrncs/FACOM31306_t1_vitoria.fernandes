public class Operario extends Funcionario{
    private double valorProd;
    private int qtd;


    public Operario(String n, String d, double v, int q) {
        super(n, d, "OPERÁRIO(A)");
        this.valorProd = v;
        this.qtd = q;
    }

    @Override
    public double calcularSalario() {
        salario = valorProd * qtd;
        return salario;
    }

    //getters e setters

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int q) {
        this.qtd = q;
        super.setSalario(q*valorProd);
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double v) {
        this.valorProd = v;
        super.setSalario(qtd*v);
    }
}