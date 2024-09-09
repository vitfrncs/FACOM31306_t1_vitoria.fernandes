import java.util.ArrayList;

public class Eleicao {
    private String municipio;
    private int votantes;
    private String dataEleicao;
    private ArrayList<Candidatos> candidatos;
    private int biometria;

    public Eleicao(String municipio, int votantes, String dataEleicao, int biometria) {
        this.municipio = municipio;
        this.votantes = votantes;
        this.dataEleicao = dataEleicao;
        this.biometria = biometria;
        this.candidatos = new ArrayList<>();
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getVotantes() {
        return votantes;
    }

    public void setVotantes(int v) {
        this.votantes = v;
    }

    public String getDataEleicao() {
        return dataEleicao;
    }

    public void setDataEleicao(String dataEleicao) {
        this.dataEleicao = dataEleicao;
    }

    public int getBiometria() {
        return biometria;
    }

    public void setbiometria(int b) {
        this.biometria = b;
    }

    public ArrayList<Candidatos> getCandidatos() {
        return candidatos;
    }

    public void adicionarCandidato(Candidatos candidato) {
        this.candidatos.add(candidato);
    }

    public void mostrarEleicao() {
        System.out.println("###################################################################################################");
        System.out.println("Município: " + municipio);
        System.out.println("Número de votantes: " + votantes);
        System.out.println("Data da eleição: " + dataEleicao);
        System.out.println("Número de votantes com biometria: " + biometria);
        System.out.println("Candidatos:");
        for (Candidatos candidato : candidatos) {
            candidato.mostrar();
        }
        System.out.println("###################################################################################################");
    }
}