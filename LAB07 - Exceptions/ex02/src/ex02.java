public class ex02 {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        System.out.println("Dividindo 15 por 7:");
        operacao.iniciarOperacao(15, 7);
        esperar();

        System.out.println("\nDividindo 15 por 0:");
        operacao.iniciarOperacao(15, 0);
        esperar();

        System.out.println("\nDividindo 3242 por 4:");
        operacao.iniciarOperacao(3242, 4);
    }

    // para erro ser impresso antes do resto do programa
    private static void esperar() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); //Pesquisei na internet isso!!
        }
    }
}
