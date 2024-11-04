public class Cliente implements Classificavel {
    private String nome;

    public Cliente (String n){
        this.nome = n;
    }
    public boolean eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        if(this.nome.compareTo(compara.nome) < 0){
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}