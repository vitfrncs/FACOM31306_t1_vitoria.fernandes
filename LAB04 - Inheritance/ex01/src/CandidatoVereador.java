public class CandidatoVereador {
    private String nome;
    private String genero;
    private double bens;
    private String reeleicao;
    private String numeroPartido;
    private String bairro;
    private String tresnumeros;

    // Construtor
    public CandidatoVereador (String n, String g, double b, String r, String nP, String bairro, String tres){
        this.nome = n;
        this.genero = g;
        this.bens = b;
        this.reeleicao = r;
        this.numeroPartido = nP;
        this.bairro = bairro;
        this.tresnumeros = tres;
    }

    // Getters e Setters
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

    public String tresnumeros() {
        return tresnumeros;
    }

    public void setTresnumeros(String tresnumeros) {
        this.tresnumeros = tresnumeros;
    }

    public String bairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String toString() {
        return "Candidato para Vereador: \n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + reeleicao + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Número vereador: " + tresnumeros + "\n" +
                "Bairro: " + bairro + "\n\n";
    }
}
