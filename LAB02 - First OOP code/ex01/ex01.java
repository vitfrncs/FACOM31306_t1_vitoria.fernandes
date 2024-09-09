public class ex01 {
    public static void main(String[] args){
        System.out.println("\nMatrícula: 12311BCC001 Código: 001 Município: Sanclerlândia 5219001 ");
        Candidatos a = new Candidatos("JOÃO PAULO DE OLIVEIRA CARNEIRO", "18/07/1984", "Masculino", 388000.0,"Não", 44, "Prefeito" );
        Candidatos b = new Candidatos("JOSÉ LAGARES DA CRUZ", "18/06/1969", "Masculino", 1823426.55, "Não", 45, "Prefeito");
        Candidatos c = new Candidatos("BETH", "29/12/1954", "Feminino", 132000.0, "Não", 44777, "Vereador");
        a.mostrar();
        b.mostrar();
        c.mostrar();
    }
}