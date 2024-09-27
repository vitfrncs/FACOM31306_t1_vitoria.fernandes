public class Time{
    private Jogador j1;
    private Jogador j2;
    private Jogador sub;
    private String nome;

    //construtores

    public Time(String n, Jogador a, Jogador b, Jogador s){
        this.j1 = new Jogador(a.getNome(), a.getIdade(), a.getAltura(), a.getPeso());
        this.j2 = new Jogador(b.getNome(), b.getIdade(), b.getAltura(), b.getPeso());
        this.sub = new Jogador(s.getNome(), s.getIdade(), s.getAltura(), s.getPeso());
        this.nome = n;
    }
    public Time(String n, Jogador a, Jogador b){
        this.j1 = new Jogador(a.getNome(), a.getIdade(), a.getAltura(), a.getPeso());
        this.j2 = new Jogador(b.getNome(), b.getIdade(), b.getAltura(), b.getPeso());
        //this.sub = null;
        this.nome = n;
    }


    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getSub() {
        return sub;
    }

    public void setSub(Jogador sub) {
        this.sub = sub;
    }

    public Jogador getJ2() {
        return j2;
    }

    public void setJ2(Jogador j2) {
        this.j2 = j2;
    }

    public Jogador getJ1() {
        return j1;
    }

    public void setJ1(Jogador j1) {
        this.j1 = j1;
    }

    public String toString(){
        System.out.println("Nome: " + nome);
        System.out.println("Jogador 1: --------------------------------");
        j1.toString();
        System.out.println("Jogador 2: --------------------------------");
        j2.toString();
        System.out.println("Substituto: -------------------------------");
        if (sub != null)
            sub.toString();
        else System.out.println("Time não possui substituto.");
        System.out.println("-------------------------------------------");
        return null;
    }

    public float mediaIdades(){
        float media;
        if (sub != null)
            media = (j1.getIdade() + j2.getIdade() + sub.getIdade()) / 3.f;
        else
            media = (j1.getIdade() + j2.getIdade()) / 2.f;
        return media;
    }
}