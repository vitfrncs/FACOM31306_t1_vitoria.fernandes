import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Instanciando a universidade
        Universidade universidade = new Universidade("UFO", new Date(2012-12-12));

        // Criando estudantes
        Estudante e = new Estudante("Carlos", "Rua 1o de Abril");
        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton", "Rua 31 de fevereiro", "Engenharia", "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla", "Rua Primavera", "Medicina", "Vacinas de RNA", "academico", "Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno", "Rua Inverno", "Tecnologia", "Processamento de Imagens", "Carros Inteligentes");

        // Adicionando os estudantes na universidade
        universidade.insereEstudante(e);
        universidade.insereEstudante(eg);
        universidade.insereEstudante(ep);
        universidade.insereEstudante(epm);
        universidade.insereEstudante(epd);

        // Letra A
        System.out.println("(A)Contagem de estudantes de cada tipo:");
        universidade.quantosEstudantes();

        // Letra B
        System.out.println("\n(B)Informações de todos os estudantes:");
        universidade.mostrarInformacoesAlunos();

        // Letra C
        System.out.println("\n(C)Estudantes de pós-graduação:");
        universidade.vetorPosGraduacao();

        // Letra D
        System.out.println("\n(D) Usando print(boolean): ");
        for (int i = 0; i < universidade.getQtdEstudantes(); i++) {
            System.out.println();
            universidade.getEstudantes()[i].print(true); // Em linha única
            universidade.getEstudantes()[i].print(false); // Em múltiplas linhas
            System.out.println();
        }
    }
}
