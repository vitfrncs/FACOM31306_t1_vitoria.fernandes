public class CandidatoPrefeito {
    private String nome;
    private String genero;
    private double bens;
    private String reeleicao;
    private String numeroPartido;
    private String nomeVice;
    private String partidoVice;
    //construtor
    public CandidatoPrefeito (String n, String g, double b, String r, String nP, String nV, String pV){
        this.nome = n;
        this.genero = g;
        this.bens = b;
        this.reeleicao = r;
        this.numeroPartido = nP;
        this.nomeVice = nV;
        this.partidoVice = pV;
    }

    //getters e setters

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String partidoVice() {
        return partidoVice;
    }

    public void setPartidoVice(String partidoVice) {
        this.partidoVice = partidoVice;
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

    public String nomeVice() {
        return nomeVice;
    }

    public void setNomeVice(String nomeVice) {
        this.nomeVice = nomeVice;
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

    public String toString() {
        return "Candidato para Prefeito: \n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Bens: " + bens + "\n" +
                "Reeleição: " + reeleicao + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Nome do Vice: " + nomeVice + "\n" +
                "Partido do Vice: " + partidoVice + "\n\n";
    }

}