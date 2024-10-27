public class Vereador extends Candidato{
    private String bairro;
    private String tresnumeros;

    // Construtor
    public Vereador (String n, String g, double b, String r, String nP, String bairro, String tres){
        super(n, g, b, r, nP);
        this.bairro = bairro;
        this.tresnumeros = tres;
    }

    // Getters e Setters

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
