public class Servico implements Classificavel {
    private double preco;

    public Servico(double p){
        this.preco = p;
    }
    public boolean eMenorQue (Classificavel o){
        Servico compara = (Servico) o;
        if (this.preco < compara.preco){
            return true;
        }else{
            return false;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "preco=" + preco +
                '}';
    }
}