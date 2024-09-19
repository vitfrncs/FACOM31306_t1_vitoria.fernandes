public class Produto {
    //atributos de um produto (de acordo com o que está em produto_e08.c)
    private String nome;
    private float preco;
    private int qtd_estoque;

    //construtores
    public Produto(String nome) { //carater definidor do produto é seu nome, então não é possível cadastrar um produto sem seu nome
        this(nome, 0.0f, 0);
    }

    public Produto(String n, float p, int et){
        this.nome = n;
        this.preco = p;
        this.qtd_estoque = et;
    }

    //setters
    public void setNome(String n){
        this.nome = n;
    }

    public void setPreco(float p){
        this.preco = p;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    //getters

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    //métodos

    public void imprimeProduto () {
        System.out.println("--------------------------------------------");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + qtd_estoque);
        System.out.println("--------------------------------------------");
    }

    //método de alterar preço

    public int alteraPreco(float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100;
            this.preco = this.preco * temp;
            return 0;
        } else {
            return -1;
        }
    }

}