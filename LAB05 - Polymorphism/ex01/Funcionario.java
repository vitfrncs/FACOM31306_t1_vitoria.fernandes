public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;
    private String cargo;
    public Funcionario(String n, String d, double s, String c){
        this.nome = n;
        this.dataNascimento = d;
        this.salario = s;
        this.cargo = c;
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}