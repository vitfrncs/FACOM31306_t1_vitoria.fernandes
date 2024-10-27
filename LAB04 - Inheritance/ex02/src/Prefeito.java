public class Prefeito extends Candidato{
    private String nomeVice;
    private String partidoVice;
    //construtor
    public Prefeito (String n, String g, double b, String r, String nP, String nV, String pV){
        super(n, g, b, r, nP);
        this.nomeVice = nV;
        this.partidoVice = pV;
    }

    //getters e setters

    public String partidoVice() {
        return partidoVice;
    }

    public void setPartidoVice(String partidoVice) {
        this.partidoVice = partidoVice;
    }


    public String nomeVice() {
        return nomeVice;
    }

    public void setNomeVice(String nomeVice) {
        this.nomeVice = nomeVice;
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

/*
    public String toString() {
        return   super.toString() + "Cargo: Prefeito \n" +
                "Nome do Vice: " + nomeVice + "\n" +
                "Partido do Vice: " + partidoVice + "\n\n";
    }*/

}