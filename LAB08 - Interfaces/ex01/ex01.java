public class ex01 {
    public static void main (String[] args){
        Classificavel[] p = {
                new Produto("Teclado", 13),
                new Produto("Mouse", 12),
                new Produto("Monitor", 14)
        };
        Classificavel[] c = {
                new Cliente("João"),
                new Cliente("Jose"),
                new Cliente("Maria")
        };
        Classificavel[] s = {
                new Servico(300.0),
                new Servico(100.0),
                new Servico(200.0)
        };
        System.out.println("------------------------------------------------------------");

        //Imprimindo vetor antes da ordenação
        System.out.println("Antes ordenar:");
        for (Classificavel prod : p){
            System.out.println(prod.toString());
        }
        System.out.println();


        for (Classificavel clie : c){
            System.out.println(clie.toString());
        }
        System.out.println();

        for (Classificavel ser : s){
            System.out.println(ser.toString());

        }
        System.out.println();

        //Ordenando:
        Classificador obj =  new Classificador();
        obj.ordena(p);
        obj.ordena(c);
        obj.ordena(s);

        System.out.println("------------------------------------------------------------");

        //Apos ordenar:
        System.out.println("Após ordenar:");
        for (Classificavel prod : p){
            System.out.println(prod.toString());

        }
        System.out.println();

        for (Classificavel clie : c){
            System.out.println(clie.toString());
        }
        System.out.println();

        for (Classificavel ser : s){
            System.out.println(ser.toString());
        }


    }

}