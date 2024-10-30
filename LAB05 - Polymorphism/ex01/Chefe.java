public class Chefe extends Funcionario{
    private double salarioFixo;


    public Chefe(String n, String d, double s) {
        super(n, d, s, "CHEFE");
        this.salarioFixo=s;
    }

    //getters e setters

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
        super.setSalario(salarioFixo);
    }
}