public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco enderecoDeContato;

    public Pessoa (String n, String cp, String rua, int numero, String bairro){
        this.nome = n;
        this.cpf = cp;
        enderecoDeContato = new Endereco(rua,numero,bairro);
    }

    //getters e setters

    public Endereco getEnderecoDeContato() {
        return enderecoDeContato;
    }

    public void setEnderecoDeContato(Endereco enderecoDeContato) {
        this.enderecoDeContato = enderecoDeContato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}