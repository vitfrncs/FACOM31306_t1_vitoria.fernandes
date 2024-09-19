public class ex04 {
    public static void main(String[] args){
        public class ex02 {
            public static void main(String[] args){
                System.out.println("\nMatrícula: 12311BCC001 Código: 001 Município: Sanclerlândia 5219001 ");
                Candidatos a = new Candidatos("JOÃO PAULO CARNEIRO", "18/07/1984", "Masculino", 388000.0,"Não", 44, "Prefeito" );
                Candidatos b = new Candidatos("ZÉ GORDO", "18/06/1969", "Masculino", 1823426.55, "Não", 45, "Prefeito");
                Candidatos c = new Candidatos("BETH", "29/12/1954", "Feminino", 132000.0, "Não", 44777, "Vereador");
                a.mostrar();
                b.mostrar();
                c.mostrar();
                System.out.println("Mudando a data de nascimento do(a) candidato(a) " + c.getNome() + ":");
                c.setData("18/12/1956");
                c.mostrar();
            }
        }
    }

}