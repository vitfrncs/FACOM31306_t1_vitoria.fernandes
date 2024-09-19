public class ex07{

    public static void ordenarPorNome(Produto[] produtos) { // Selection Sort
        int n = produtos.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                // função compareToIgnoreCase compara duas Strings e retorna um num menor que 0 se o que tiver no argumento for "maior"
                if (produtos[j].getNome().compareToIgnoreCase(produtos[menor].getNome()) < 0) {
                    menor = j;
                }
            }
            // troca o produto com o menor nome encontrado com o produto atual
            Produto temp = produtos[menor]; // Corrigido para usar "menor"
            produtos[menor] = produtos[i];
            produtos[i] = temp;
        }
    }

    public static void main (String[] args) {
        // criando vetor com 5 produtos:
        Produto[] p = new Produto[5];;

        //instanciando cada produto:
        p[0] = new Produto("Tênis", 312.56f, 5);
        p[1] = new Produto("Camiseta", 80.0f, 10);
        p[2] = new Produto("Calça", 180.0f, 25);
        p[3] = new Produto("Boné", 80.0f, 8);
        p[4] = new Produto("Meias", 25.0f, 50);

        //exibindo vetor de produtos antes da ordenação:
        System.out.println("Produtos antes da ordenação:");
        for (Produto produto : p) {
            produto.imprimeProduto();
        }

        //ordenando:
        ex07.ordenarPorNome(p);


        // Exibindo produtos após a ordenação
        System.out.println("Produtos após a ordenação por nome:");
        for (Produto produto : p) {
            produto.imprimeProduto();
        }

    }
}