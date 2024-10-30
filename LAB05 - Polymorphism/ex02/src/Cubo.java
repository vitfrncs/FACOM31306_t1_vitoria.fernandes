class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double obterArea(){
        return (lado * lado) * 6.0;
    }

    @Override
    public double obterVolume() {
        return (lado * lado) * lado;
    }

    @Override
    public String descricao() {
        return "Cubo";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}