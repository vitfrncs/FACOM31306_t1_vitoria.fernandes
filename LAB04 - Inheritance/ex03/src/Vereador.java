public class Vereador extends Candidato{
    private String bairro;
    private String tresnumeros;

    // Construtores
    public Vereador (String n, String g, double b, String r, String nP, String bairro, String tres){
        super(n, g, b, r, nP);
        this.bairro = bairro;
        this.tresnumeros = tres;
    }
     public Vereador (Candidato c, String bairro, String tres){
         super(c.nome(), c.genero(), c.bens(), c.reeleicao(), c.numeroPartido());
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
/* Como os atributos da classe candidato estão privados, suas subclasses não conseguem acessa-los diretamente.
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

*/

    public String toString() {
        return  super.toString() + "Cargo: Vereador \n" +
                "Número vereador: " + tresnumeros + "\n" +
                "Bairro: " + bairro + "\n\n";
    }
}
