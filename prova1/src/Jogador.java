public class Jogador {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    //construtor


    public Jogador(String n, int i, float a, float p){
        this.nome = n;
        this.idade = i;
        this.altura = a;
        this.peso = p;
    }
    //getters settes

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //imprimir
    public String toString(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        return null;
    }
}