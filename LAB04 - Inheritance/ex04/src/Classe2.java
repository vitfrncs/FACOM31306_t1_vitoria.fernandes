public class Classe2 extends Classe1 {
    public String turma;
    private double mediaNotas;
    protected String disciplina;

    public Classe2() {
        super();
        System.out.println("Classe C2: chamada do construtor padrão sem parâmetros");
    }

    public Classe2(String n, int i, String c, String t, double mediaN, String d) {
        super(n, i, c);
        this.turma = t;
        this.mediaNotas = mediaN;
        this.disciplina = d;
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nome: " + getNome() + ", Idade: " + idade + ", Curso: " + curso +
                ", Turma: " + turma + ", Média de Notas: " + mediaNotas +
                ", Disciplina: " + disciplina);
    }

    @Override
    public void mostrarAtributosSuper() {
        super.mostrarAtributos();
        System.out.print( " Turma: " + turma + ", Média de Notas: " + mediaNotas + ", Disciplina: " + disciplina);
    }

    //getters e setters

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaN) {
        this.mediaNotas = mediaN;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String d) {
        this.disciplina = d;
    }
}