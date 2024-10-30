class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    //sobreescrever metodos:

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String descricao() {
        return "Círculo";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}