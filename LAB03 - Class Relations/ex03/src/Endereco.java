public class Endereco {
    private String rua;
    private int numero;
    private String bairro;

    public Endereco (String r, int n, String b) {
        this.rua = r;
        this.numero = n;
        this.bairro = b;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}