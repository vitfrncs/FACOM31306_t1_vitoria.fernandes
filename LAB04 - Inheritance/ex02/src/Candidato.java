public class Candidato {
    protected String nome;
    protected String genero;
    protected double bens;
    protected String reeleicao;
    protected String numeroPartido;

    //construtor
    public Candidato(String n, String g, double b, String r, String nP){
        this.nome = n;
        this.genero = g;
        this.bens = b;
        this.reeleicao = r;
        this.numeroPartido = nP;
    }

    //getters e setter
    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String reeleicao() {
        return reeleicao;
    }

    public void setReeleicao(String reeleicao) {
        this.reeleicao = reeleicao;
    }

    public String numeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(String numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public double bens() {
        return bens;
    }

    public void setBens(double bens) {
        this.bens = bens;
    }

    public String genero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString (){
        return "Candidato: \n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + reeleicao + "\n" +
                "Número do Partido: " + numeroPartido + "\n";
    }

}