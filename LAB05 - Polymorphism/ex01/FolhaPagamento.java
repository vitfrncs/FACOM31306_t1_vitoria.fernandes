public class FolhaPagamento {
    private Funcionario[] funcionarios;
    private double remuneracao;

    public FolhaPagamento(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
        setRemuneracao(funcionarios);
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Funcionario[] funcionarios) {
        double r = 0;
        for(Funcionario f : funcionarios){
            r = r+f.getSalario();
        }
        this.remuneracao = r;
    }

    public void imprimirDados() {
        System.out.println("Folha de Pagamento:");
        System.out.println("------------------------------------------------------------------------");

        for (Funcionario f : funcionarios) {
            System.out.println(f.getCargo() + ": " + f.getNome() + ", Salário: R$ " + f.getSalario());
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Remuneração Total: R$ " + getRemuneracao());
    }
}