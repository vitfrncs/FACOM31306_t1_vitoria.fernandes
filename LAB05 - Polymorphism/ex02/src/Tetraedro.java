class Tetraedro extends FormaTridimensional {
    private double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    public double obterArea() {
        return (aresta * aresta) * Math.sqrt(3);
    }

    public double obterVolume() {
        double altura = aresta * Math.sqrt(2.0 / 3);
        return (1.0 / 3) * (obterArea() / 4.0) * altura;
    }

    @Override
    public String descricao() {
        return "Tetraedro";
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
