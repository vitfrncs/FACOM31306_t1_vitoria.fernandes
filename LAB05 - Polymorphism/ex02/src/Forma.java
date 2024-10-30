public abstract class Forma {
    private String descricao;

    public Forma (){
        this.descricao = "Forma";
    }

    public String descricao() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}