class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    //sobreescrever metodos:

    @Override
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public String descricao() {
        return "Quadrado";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}