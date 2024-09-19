public class ex03 {
    public static void main(String[] args){
        Candidatos []v = new Candidatos[4];
        System.out.println("\nMatrícula: 12311BCC001 \nCódigo: 001 \nMunicípio: Sanclerlândia 5219001 ");
        v[0] = new Candidatos("JOÃO PAULO CARNEIRO", "18/07/1984", "Masculino", 388000.0,"Não", 44, "Prefeito" );
        v[1] = new Candidatos("ZÉ GORDO", "18/06/1969", "Masculino", 1823426.55, "Não", 45, "Prefeito");
        v[2] = new Candidatos("BETH", "29/12/1954", "Feminino", 132000.0, "Não", 44777, "Vereador");
        v[3] = new Candidatos("IRMÃ ANGENILDA", "27/04/1969", "Feminino", 3000, "Não", 12555, "Vereador");
        // usando for enhanced
        for (Candidatos c : v)
            c.mostrar();
    }
}