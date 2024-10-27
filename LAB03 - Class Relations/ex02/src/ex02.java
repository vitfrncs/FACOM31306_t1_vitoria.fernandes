//Agregação
//Aluno faz parte de Turma mas não deixa de existir se sair da turma ou se a turma parar de existir.
//Além disso, os objetos são independentes

public class ex02 {
    public static void main(String[] args) {
        // criando alunos
        Aluno aluno1 = new Aluno("Fátima", 61);
        Aluno aluno2 = new Aluno("Sueli", 87);

        // criando uma turma
        Turma turma = new Turma("Introdução ao Cinema Norueguês", 2024);

        // adicionando alunos à turma
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        // Limprimindo alunos da turma
        turma.listarAlunos();

        // removendo um aluno da turma
        turma.removerAluno(aluno1);

        // monstrando que aluno ainda existe após remoção
        System.out.println(aluno1.getNome() + " ainda existe fora da turma.");

        // imprimindo alunos restantes na turma
        turma.listarAlunos();
    }
}
