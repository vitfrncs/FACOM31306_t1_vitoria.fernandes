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

    public void mostrarCandidatoMaisRico() {
        if (candidatos.isEmpty()) {
            System.out.println("Nenhum candidato registrado.");
            return;
        }
        // variavel que armazenará candidato amis rico recebe o primeiro elemento da lista
        Candidatos candidatoMaisRico = candidatos.get(0);
        double totalBens = 0.0;

        // Usando for enhanced para varrer lista de candidatos e guardar mais rico em candidatoMaiSRico
        for (Candidatos candidato : candidatos) {
            if (candidato.getBens() > candidatoMaisRico.getBens()) {
                candidatoMaisRico = candidato;
            }
            //calculando total de bens para depois calcular percentual do mais rico
            totalBens += candidato.getBens();
        }

        // Calculando o percentual de bens do candidato mais rico em relação ao total
        double percentual = (candidatoMaisRico.getBens() / totalBens) * 100;

        System.out.println("Candidato com mais bens:");
        candidatoMaisRico.mostrar();
        System.out.printf("Percentual de bens em relação ao total: %.2f%%\n", percentual);
    }
}