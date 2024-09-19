public class ex02 {
    public static void main(String[] args){
        System.out.println("\nMatrícula: 12311BCC001 Código: 001 Município: Sanclerlândia 5219001 ");
        // Instanciando os objetos candidatos sem construtores
        Candidatos candidato1 = new Candidatos();
        candidato1.setNome("JOÃO PAULO CARNEIRO");
        candidato1.setData("18/07/1984");
        candidato1.setGenero("Masculino");
        candidato1.setBens(388000.0);
        candidato1.setReeleicao("Não");
        candidato1.setNum_p(44);
        candidato1.setCargo("Prefeito");

        Candidatos candidato2 = new Candidatos();
        candidato2.setNome("ZÉ GORDO");
        candidato2.setData("18/06/1969");
        candidato2.setGenero("Masculino");
        candidato2.setBens(1823426.55);
        candidato2.setReeleicao("Não");
        candidato2.setNum_p(45);
        candidato2.setCargo("Prefeito");

        Candidatos candidato3 = new Candidatos();
        candidato3.setNome("BETH");
        candidato3.setData("29/12/1954");
        candidato3.setGenero("Feminino");
        candidato3.setBens(132000.0);
        candidato3.setReeleicao("Não");
        candidato3.setNum_p(44777);
        candidato3.setCargo("Vereador");

        candidato1.mostrar();
        candidato2.mostrar();
        candidato3.mostrar();
        System.out.println("Mudando a data de nascimento do(a) candidato(a) " + candidato3.getNome() + ":");
        candidato3.setData("18/12/1956");
        candidato3.mostrar();
    }
}