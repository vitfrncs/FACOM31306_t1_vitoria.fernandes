public class ex01 {
    public static void main(String[] args){
        CandidatoPrefeito c1 = new CandidatoPrefeito("Luiz Caldas Portinelli", "Masculino", 120000.125, "NÃO", "45", "Jaciara Rodrigues da Silva", "MDB");
        System.out.printf(c1.toString());
        CandidatoVereador c2 = new CandidatoVereador("Ana Carla Fernandes Marques", "Feminino", 1000.50, "NÃO", "50", "Sibipiruna", "000");
        System.out.printf(c2.toString());

    }
}