class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double obterArea(){
        return (4 * Math.PI) * (raio * raio);
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String descricao() {
        return "Esfera";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}