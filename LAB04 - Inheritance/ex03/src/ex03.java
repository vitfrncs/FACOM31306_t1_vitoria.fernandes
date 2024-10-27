public class ex03 {
    public static void main(String[] args){
        Prefeito c1 = new Prefeito("Luiz Caldas Portinelli", "Masculino", 120000.125, "NÃO", "45", "Jaciara Rodrigues da Silva", "MDB");
        System.out.printf(c1.toString());
        Candidato c2 = new Candidato("Ana Carla Fernandes Marques", "Feminino", 1000.50, "NÃO", "50");
        Vereador c3 = new Vereador(c2, "Sibipiruna", "000");
        System.out.printf(c3.toString());
    }
}