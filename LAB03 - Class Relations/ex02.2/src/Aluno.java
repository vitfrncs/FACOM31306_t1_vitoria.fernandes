public class Aluno {
    private String nome;
    private double cra;

    public Aluno (String n, double c){
        this.nome = n;
        this.cra = c;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getCra() {
        return cra;
    }

    public void setCra(double cra) {
        this.cra = cra;
    }

    @Override
    public String toString() {
        return nome;
    }

}