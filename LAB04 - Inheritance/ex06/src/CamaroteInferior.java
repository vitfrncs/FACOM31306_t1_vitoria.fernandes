public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double v, double vA, String l) {
        super(v, vA);
        this.localizacao = l;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String l) {
        this.localizacao = l;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do ingresso: " + localizacao);
    }
}