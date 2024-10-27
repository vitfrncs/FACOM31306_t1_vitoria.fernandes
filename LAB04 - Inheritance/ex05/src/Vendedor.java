public class Vendedor extends Funcionario{
    private double salarioFixo;
    private double comissao;
    private int vendas;

    public Vendedor(String n, String d, double s, double c, int v) {
        super(n, d, "VENDEDOR(A)");
        this.salarioFixo = s;
        this.comissao = c;
        this.vendas = v;
    }

    @Override
    public double calcularSalario() {
        salario = salarioFixo + (comissao * vendas);
        return salario;
    }

    //getters e setters

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double c) {
        this.comissao = c;
        super.setSalario(salarioFixo+(c*vendas));
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double s) {
        this.salarioFixo = s;
        super.setSalario((comissao*vendas)+s);
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int v) {
        this.vendas = v;
        super.setSalario((comissao*v)+salarioFixo);
    }
}