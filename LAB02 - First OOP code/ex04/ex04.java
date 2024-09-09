public class ex04 {
    public static void main(String[] args){
        //eleição 1:
        Eleicao e1 = new Eleicao("Sanclerlândia", 7511, "15/11/2024", 7107);

        //criando candidatos:
        Candidatos c1 = new Candidatos("JOÃO PAULO CARNEIRO", "18/07/1984", "Masculino", 388000.0, "Não", 44, "Prefeito");
        Candidatos c2 = new Candidatos("ZÉ GORDO", "18/06/1969", "Masculino", 1823426.55, "Não", 45, "Prefeito");
        Candidatos c3 = new Candidatos("BETH", "29/12/1954", "Feminino", 132000.0, "Não", 44777, "Vereador");

        //adicionando candidatos a eleição:
        e1.adicionarCandidato(c1);
        e1.adicionarCandidato(c2);
        e1.adicionarCandidato(c3);

        //eleição 2:
        Eleicao e2 = new Eleicao("Ouro Preto do Oeste", 28501, "15/11/2024", 26305);

        Candidatos c4 = new Candidatos("SOELI MAGESKI", "02/03/1974", "Feminino", 85000, "Não", 13, "Prefeito");
        Candidatos c5 = new Candidatos("ALEX TESTONI", "27/01/1965", "Masculino", 37921017.59, "Não", 44, "Prefeito");
        Candidatos c6 = new Candidatos("WEMERSON DA INTERNET", "08/08/1990", "Masculino", 505930, "Não", 25123, "Vereador");

        e2.adicionarCandidato(c4);
        e2.adicionarCandidato(c5);
        e2.adicionarCandidato(c6);

        System.out.println("\nMatrícula: 12311BCC001 \nCódigo: 001 \nMunicípio: Sanclerlândia 5219001 \n");

        e1.mostrarEleicao();

        System.out.println("\nMatrícula: 12311BCC001 \nCódigo: 001 \nMunicípio: Ouro Preto do Oeste 1100155 \n");

        e2.mostrarEleicao();

    }

}