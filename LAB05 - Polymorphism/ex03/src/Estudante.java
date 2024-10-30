public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print() {
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Letra D:
    /*Não é possível utilizar o print boolean em um polimorfismo tendo como base um vetor da classe Estudante, pois não há
    presença na classe Estudante desse metodo com essa assinatura para ser reescrito nas subclasses*/
    //Logo, para isso ser possível, é necessário criar um metodo print boolean na classe Estudante.
    /*Contudo, para as instâncias da classe pós-graduação será impresso apenas o nome e o endereço do estudante, já que a subclasse não
    possui um metodo de sobreescrita*/

    public void print(boolean uma) {
        if (uma) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco());
        } else {
            print();
        }
    }


}
