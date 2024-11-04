/*Usando o exercício anterior para responder as perguntas.
* throws aparece na assinatura de um metodo e é um indicação de que o metedo pode
* lançar uma ou mais exceções que não são necessariamente tratadas pelo metodo
* throw é a instanciação de uma exceção, indica que essa exceção ocorrera em algum ponto
* do código e que será lançada naquele local
* Usei isso: https://www.javatpoint.com/difference-between-throw-and-throws-in-java para responder
* Checked Exceptions: são exceções de tratamento obrigatório e são notadas em tempo de compilação.
* Geralmente representam erros que geralmente estão fora do controle do programa.
* Exemplos IOException, FileNotFoundException
* Unchecked Exceptions: São exceções que não são verificadas em tempo de compilação.
* Elas derivam de RuntimeException e não possuem tratamento obrigatório.
* Exemplos: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException(divisão por zero)
* https://www.baeldung.com/java-checked-unchecked-exceptions#checked*/



public class Operacao {

    public void iniciarOperacao(int numerador, int denominador) {
        try {
            double resultado = calcular(numerador, denominador);
            System.out.println("Resultado: " + resultado);
            System.out.flush();
        } catch (DivisaoPorZeroException e) {
            System.err.println("Erro: " + e.getMessage());
            System.err.flush();
        }
    }


    public double calcular(int numerador, int denominador) throws DivisaoPorZeroException {
        return dividir(numerador, denominador);
    }

    public  double dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Erro: Tentativa de divisão por zero.");
        }
        return (double) numerador / denominador;
    }


}

