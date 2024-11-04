public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double teto;

    //construtor:
    public Funcionario(String c, String n, double s){
        this.cpf = c;
        this.nome = n;
        this.salario = s;
        this.teto = 40000.0;
    }

    //aumentar salario
    public void aumentarSalario(double percentual){
        double tempSalario = salario * (1 + (percentual/100.0));
        if (tempSalario > teto){
            throw new Excecao("Sálario excede o teto salarial.");
        } else if (tempSalario < 0){
            throw new Excecao("Sálario excede o teto salarial.");
        } else {
            this.salario =  tempSalario;
        }
    }

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTeto() {
        return teto;
    }

    public void setTeto(double teto) {
        this.teto = teto;
    }
}