//Combinação
//O endereço de contato é parte do todo Pessoa.
//Naõ faz sentido existir um endereço de contato se não existir uma pessoa atrelada a ele.
//Então, o Endereço não existe independente da Pessoa.
//Então, as classes não são independentes.

public class ex03 {
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa("Sueli", "543.543.654-45", "Rua Sergipe A", 1200, "Ipê");
        System.out.println(pessoa.getNome() + " mora na " + pessoa.getEnderecoDeContato().getRua() + ", localizada no bairro " + pessoa.getEnderecoDeContato().getBairro() + ".");
    }
}
