public class ex02 {
    public static void main (String[] args){
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(4);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 5);
        formas[3] = new Esfera(4);
        formas[4] = new Cubo(4);
        formas[5] = new Tetraedro(4);

        //É necessário usar instance of para saber se vai imprimir a área ou o volume
        for (Forma forma : formas) {
            System.out.println("Forma: " + forma.descricao());

            if (forma instanceof FormaBidimensional) {
                System.out.println("Área: " + String.format("%.2f", ((FormaBidimensional) forma).obterArea()));
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Volume: " + String.format("%.2f", ((FormaTridimensional) forma).obterVolume()));
            }

            System.out.println();
        }

    }
}