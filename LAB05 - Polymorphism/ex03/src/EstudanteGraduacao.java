public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    //Letra d:
    //Sobrecarga: métodos com mesmo nome mas assinaturas diferentes presentes na mesma classe.
    public void print(boolean uma) {
        if (uma) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco() + "; TCC: " + tituloTCC);
        } else {
            print();
        }
    }
}
