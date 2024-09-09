public class Candidatos {
    public String nome;
    public String data;
    public String genero;
    public double bens;
    public String reeleiçao;
    public int num_p;
    public String cargo = new String();

    public Candidatos(String n, String d, String g, double b, String r, int np, String c){
        nome = n;
        data = d;
        genero = g;
        bens = b;
        reeleiçao = r;
        num_p = np;
        cargo = c;
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
}