public class Candidatos {
    private String nome;
    private String data;
    private String genero;
    private double bens;
    private String reeleiçao;
    private int num_p;
    private String cargo = new String();

    public Candidatos(String n, String d, String g, double b, String r, int np, String c){
        this.nome = n;
        this.data = d;
        this.genero = g;
        this.bens = b;
        this.reeleiçao = r;
        this.num_p = np;
        this.cargo = c;
    }

    public void mostrar(){
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Nome: " + nome);
        System.out.print("\nData de nascimento: " + data);
        System.out.print("\nGênero: " + genero);
        System.out.print("\nBens: " + bens);
        System.out.print("\nReeleição: " + reeleiçao);
        System.out.print("\nNúmero do partido: " + num_p);
        System.out.print("\nCargo: " + cargo);
        System.out.println("\n-------------------------------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getGenero() {
        return genero;
    }

    public double getBens() {
        return bens;
    }

    public String getReeleicao() {
        return reeleiçao;
    }

    public int getNum_p() {
        return num_p;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setBens(double bens) {
        this.bens = bens;
    }

    public void setReeleicao(String reeleicao) {
        this.reeleiçao = reeleicao;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}