public class Pessoa {
    private String nome;
    private double capital;
    private Veiculo veiculo;

    public Pessoa(String n, double c, Veiculo v) {
        this.nome = n;
        this.capital = c;
        this.veiculo = v;
    }

    //getters e setters

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    //mostrar capital

    public void mostrarCapital() {
        System.out.println(nome + " tem um capital de: " + capital);
    }

    //metodo para comprar veículo

    public void comprarVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.capital = capital - veiculo.getValor();
        System.out.println(nome + " comprou o veículo " + veiculo.getModelo() + " por R$ " + veiculo.getValor());
    }

    //metodo para vender veículo

    public void venderVeiculo() {
        if (veiculo != null) {
            this.capital += veiculo.getValor();
            System.out.println(nome + " vendeu o veículo " + veiculo.getModelo() + " por " + veiculo.getValor());
            veiculo = null;
        } else {
            System.out.println(nome + " não possui veículo para vender.");
        }
    }
}