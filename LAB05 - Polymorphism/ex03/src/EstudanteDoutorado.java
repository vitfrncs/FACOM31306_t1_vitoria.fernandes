public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    //Letra D:
    public void print(boolean uma) {
        if (uma) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco() + "; Formacao: " + getFormacao()
                    + "; Linha de Pesquisa: " + getLinhaDePesquisa());
        } else {
            print();
        }
    }
}
