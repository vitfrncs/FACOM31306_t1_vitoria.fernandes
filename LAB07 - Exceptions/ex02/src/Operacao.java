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

