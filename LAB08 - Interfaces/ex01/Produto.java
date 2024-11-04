public class Produto implements Classificavel {

    private int codigo;
    private String nomeP;

    public Produto (String n, int c){
        this.codigo = c;
        this.nomeP = n;
    }

    public boolean eMenorQue ( Classificavel o) {
        Produto compara = ( Produto ) o;
        if ( this . codigo < compara . codigo ) {
            return true ;
        } else {
            return false ;
        }
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nomeP='" + nomeP + '\'' +
                '}';
    }
}
