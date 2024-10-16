// Pessoa e veículo são objetos independente que continuam existindo idependente da relação entre eles existir ou não.
// Uma pessoa pode ter um veículo ou não. Vender e comprar um veículo irá influenciar no atributo capital de um objeto Pessoa.
// Logo, um objeto Pessoa usa um objeto Veículo chamando um metodo (comprar ou vender veículo) publico.
// Pessoa e Veículo possuem uma associação simples.

public class ex01 {
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa("Mariana", 40000.0, null);
        Veiculo carro = new Veiculo("Opala", 15000.0);

        pessoa.mostrarCapital(); // Capital inicial

        pessoa.comprarVeiculo(carro); // Mariana compra o Opala

        pessoa.mostrarCapital(); // Capital após compra

        pessoa.venderVeiculo(); // Mariana vende o Opala

        pessoa.mostrarCapital(); // Capital após a venda
    }
}