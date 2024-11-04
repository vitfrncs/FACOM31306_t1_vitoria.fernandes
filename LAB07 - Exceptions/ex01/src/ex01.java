public class ex01{
    public static void main (String [] args){
        Funcionario funcionario = new Funcionario("123.123.321-23", "Ronaldo Paz", 30000);

        System.out.println("Salário atual: " + funcionario.getSalario());

        System.out.println("\nEssa tentativa de aumento resultaria em um valor acima do teto");
        try {
            funcionario.aumentarSalario(50);
        } catch (Excecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual após tentativa de aumento: " + funcionario.getSalario());
        }
        System.out.println("\nEssa tentativa de aumento resultaria em um valor negativo");
        try {
            funcionario.aumentarSalario(-150);
        } catch (Excecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual após tentativa de aumento: " + funcionario.getSalario());
        }
        System.out.println("\nEssa tentativa de aumento dará certo.");
        try {
            funcionario.aumentarSalario(20);
        } catch (Excecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual após tentativa de aumento: " + funcionario.getSalario());
        }


    }
}