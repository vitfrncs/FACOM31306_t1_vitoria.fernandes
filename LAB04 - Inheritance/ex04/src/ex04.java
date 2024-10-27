public class ex04{
    public static void main (String[] args){
        // Construtor sem parâmetros
        System.out.println("Chamada do construtor sem parametros: ");
        Classe3 o1 = new Classe3();
        System.out.println("Mostrar atributos sem super:");
        o1.mostrarAtributos();
        System.out.println("Mostrar atributos com super:");
        o1.mostrarAtributosSuper();

        System.out.println("\n");

        // Construtor com parâmetros
        System.out.println("Chamada do construtor com parametros: ");
        Classe3 o2 = new Classe3("Ana", 27, "Psicologia", "Turma A", 7.5, "Estatistica", 8.2, 3, 85);
        System.out.println("Mostrar atributos sem super:");
        o2.mostrarAtributos();
        System.out.println("Mostrar atributos com super:");
        o2.mostrarAtributosSuper();
    }
}