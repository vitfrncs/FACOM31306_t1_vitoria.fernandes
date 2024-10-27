public class Classe1 {
    private String nome;
    public int idade;
    protected String curso;

    public Classe1(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public Classe1() {
        System.out.println("Classe C1: chamada do construtor sem parâmetros");
    }

    public void mostrarAtributos() {
        System.out.print("Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso);
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}