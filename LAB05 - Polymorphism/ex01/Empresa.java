public class Empresa {
    public static void main (String[] args){
        Funcionario[] f = new Funcionario[5];
        //cadastrando funcionários
        f[0] = new Chefe("Ana", "13/12/1998", 16000.50);
        f[1] = new Operario("Paulo", "23/2/1997", 1200.00, 9);
        f[2] = new Vendedor("João", "12/01/1978", 2000.00, 540.00, 12);
        f[3] = new Horista("Maria", "28/09/1988", 90, 40);
        f[4] = new Vendedor("Carlos", "31/05/2000", 2000.00, 540.00, 8);

        FolhaPagamento folha = new FolhaPagamento(f);
        folha.setRemuneracao(f);
        folha.imprimirDados();



    }
}