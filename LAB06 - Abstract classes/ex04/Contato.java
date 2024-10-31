import java.util.Date;

abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private String aniversario;

    public Contato (String n, String a, String e, String ani){
        this.nome = n;
        this.apelido = a;
        this.email = e;
        this.aniversario = ani;
    }

    String imprimirBasico(){
        return ("Apelido: " + apelido + "\nNome: "+ nome + "\nE-mail: "+ email + "\nAniversario: " + aniversario);
    }

    abstract String imprimirContato();

    // getters e setters

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}