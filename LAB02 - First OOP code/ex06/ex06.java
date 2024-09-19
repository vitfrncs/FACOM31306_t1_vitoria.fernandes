public class ex06{
    public static void main (String[] args) {
        //criando eleição
        Eleicao eleicao = new Eleicao("Sanclerlândia", 7511, "15/11/2024", 7107);

        //adicionando 5 candidatos
        eleicao.adicionarCandidato(new Candidatos("JOÃO PAULO CARNEIRO", "18/07/1984", "Masculino", 388000.0, "Não", 44, "Prefeito"));
        eleicao.adicionarCandidato(new Candidatos("ZÉ GORDO", "18/06/1969", "Masculino", 1823426.55, "Não", 45, "Prefeito"));
        eleicao.adicionarCandidato(new Candidatos("BETH", "29/12/1954", "Feminino", 132000.0, "Não", 44, "Vereador"));
        eleicao.adicionarCandidato(new Candidatos("IRMÃ ANGENILDA", "27/04/1969", "Feminino", 3000, "Não", 12, "Vereador"));
        eleicao.adicionarCandidato(new Candidatos("BRUNA", "13/02/1995", "Feminino", 0, "Não", 44, "Vereador"));

        eleicao.mostrarEleicao();

        eleicao.mostrarCandidatoMaisRico();

    }
}