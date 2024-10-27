public class ex02 {
        public static void main(String[] args){
            Prefeito c1 = new Prefeito("Luiz Caldas Portinelli", "Masculino", 120000.125, "NÃO", "45", "Jaciara Rodrigues da Silva", "MDB");
            System.out.printf(c1.toString());
            Vereador c2 = new Vereador("Ana Carla Fernandes Marques", "Feminino", 1000.50, "NÃO", "50", "Sibipiruna", "000");
            System.out.printf(c2.toString());
        }
}