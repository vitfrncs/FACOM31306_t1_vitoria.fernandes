public class Classe3 extends Classe2{
    private double notaDisciplina;
    public int faltas;
    protected int cra;

    public Classe3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public Classe3(String nome, int idade, String curso, String turma, double mediaNotas, String disciplina, double notaDisciplina, int faltas, int cra) {
        super(nome, idade, curso, turma, mediaNotas, disciplina);
        this.notaDisciplina = notaDisciplina;
        this.faltas = faltas;
        this.cra = cra;
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nome: " + getNome() + ", Idade: " + idade + ", Curso: " + curso +
                ", Turma: " + turma + ", Média de Notas: " + getMediaNotas() +
                ", Disciplina: " + disciplina + ", Nota Disciplina: " + notaDisciplina +
                ", Faltas: " + faltas + ", CRA: " + cra);
    }

    @Override
    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println(" Nota Disciplina: " + notaDisciplina + ", Faltas: " + faltas + ", CRA: " + cra);
    }
}