import java.util.Date;

public class Universidade {
    private String nome;
    private Date dataF;
    private Estudante[] estudantes = new Estudante[100]; // permite no máximo 100 alunos
    private int qtdEstudantes = 0; // para verificar quantos alunos a universidade tem

    public Universidade(String nome, Date d) {
        this.nome = nome;
        this.dataF = d;
    }

    //Letra A:
    public void quantosEstudantes() {
        int graduacao = 0, pos = 0, mestrado = 0, doutorado = 0;
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i] instanceof EstudanteGraduacao) {
                graduacao++;
            }else if (estudantes[i] instanceof EstudanteDoutorado) {
                pos++;
            } else if (estudantes[i] instanceof EstudanteMestrado) {
                mestrado++;
            } else if (estudantes[i] instanceof EstudantePosGrad) {
                doutorado++;
            }
        }
        System.out.println("Quantidade de estudantes de cada tipo: ");
        System.out.println("Graduacao: " + graduacao + "\nPos Graduacao: " + pos + "\nMestrado: " + mestrado + "\nDoutorado: " + doutorado);
    }

    //Letra B:

    public void mostrarInformacoesAlunos() {
        for (int i = 0; i < qtdEstudantes; i++) {
            Estudante estudante = estudantes[i];
            estudante.print();
            if (estudante instanceof EstudanteDoutorado doutorado) {
                System.out.println("Tese: " + doutorado.getTituloTese());
                System.out.println("Linha de pesquisa: " + doutorado.getLinhaDePesquisa());
            }
        }
    }

    //Letra C:
    //Na minha cabeça, doutorado e mestrado contam como posGraduação aqui!! (Na letra B não... Mas faz sentido (tecnicamente)!!)
    public void vetorPosGraduacao() {
        EstudantePosGrad[] posGraduacao = new EstudantePosGrad[qtdEstudantes]; //valor max de estudantes de pos-graduação é igual ao valor de alunos
        int count = 0;
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i] instanceof EstudantePosGrad) {
                posGraduacao[count] = (EstudantePosGrad) estudantes[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            posGraduacao[i].print();
        }
    }

    public void insereEstudante(Estudante e) {
        if (qtdEstudantes < estudantes.length) {
            estudantes[qtdEstudantes++] = e; //não precisa copiar os valores
        } else {
            System.out.println("Número de estudantes cadastrados é 100.");
        }
    }

    //getters e setters:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataF() {
        return dataF;
    }

    public void setDataF(Date dataF) {
        this.dataF = dataF;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public int getQtdEstudantes() {
        return qtdEstudantes;
    }

    public void setQtdEstudantes(int qtdEstudantes) {
        this.qtdEstudantes = qtdEstudantes;
    }
}
