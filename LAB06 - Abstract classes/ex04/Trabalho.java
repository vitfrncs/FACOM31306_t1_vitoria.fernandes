class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String n, String a, String e, String ani, String t) {
        super(n, a, e, ani);
        this.tipo = t;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nTipo de contato no trabalho: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
