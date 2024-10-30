class Triangulo extends FormaBidimensional {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //sobreescrever metodos:

    @Override
    public double obterArea() {
        return (base * altura) / 2;
    }

    @Override
    public String descricao() {
        return "Triângulo";
    }

    //getters e setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}