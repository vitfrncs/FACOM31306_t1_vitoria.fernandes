

public class ex06 {
    public static void main(String[] args){
        //Ingresso normal:
        IngressoNormal normal = new IngressoNormal(550.00);
        normal.imprimeTipo();
        normal.imprimeValor();

        System.out.println();

        //Ingresso vip:
        Ingresso ingressoVIP = new VIP(550.00, 200.00);
        System.out.println("VIP");
        ingressoVIP.imprimeValor();

        System.out.println();

        //Ingresso camarote inferior
        CamaroteInferior ingressoCI = new CamaroteInferior(550.00, 200.00, "Setor B");
        System.out.println("CAMAROTE INFERIOR");
        ingressoCI.imprimeLocalizacao();
        ingressoCI.imprimeValor();

        System.out.println();

        //Ingresso camarote superior
        CamaroteSuperior ingressoCS = new CamaroteSuperior(550.00, 200.00, 300.00);
        System.out.println("CAMAROTE SUPERIOR");
        ingressoCS.imprimeValor();

    }
}