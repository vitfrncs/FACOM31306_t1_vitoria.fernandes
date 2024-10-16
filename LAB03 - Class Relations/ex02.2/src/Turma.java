import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String disciplina;
    private int ano;
    private List<Aluno> alunos;

    //construtor
    public Turma(String d, int a) {
        this.disciplina = d;
        this.ano = a;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println(aluno + " foi adicionada à disciplina "+ disciplina + ".");
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println(aluno.getNome() + " foi removida da turma da disciplina " + disciplina + ".");
        } else {
            System.out.println(aluno.getNome() + " não está cursando a disciplina " + disciplina + ".");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos da turma " + disciplina + " do ano " + ano + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    //getters e setters

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}