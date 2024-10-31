class Amigos extends Contato {
    private int grau; //  (1= melhor amigo; 2 = amigo; 3 = conhecido)

    public Amigos(String n, String a, String e, String ani, int g) {
        super(n, a, e, ani);
        this.grau = g;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nGrau de amizade: " + grau;
    }

    // getters e setters
    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}
