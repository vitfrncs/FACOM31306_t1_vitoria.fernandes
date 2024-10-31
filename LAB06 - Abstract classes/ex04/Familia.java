class Familia extends Contato {
    private String parentesco;

    public Familia(String n, String a, String e, String ani, String p) {
        super(n, a, e, ani);
        this.parentesco = p;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nParentesco: " + parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String p){
        this.parentesco = p;
    }
}
