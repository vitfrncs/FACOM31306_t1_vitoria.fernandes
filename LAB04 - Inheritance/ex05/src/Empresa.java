public class Empresa {
    public static void main (String[] args){
        //funcionarios:
        Funcionario[] funcionarios = new Funcionario[8];

        //chefes:
        funcionarios[0] = new Chefe("Ana", "03/09/1996", 5300.00);
        funcionarios[1] = new Chefe("Mariana", "18/08/1989", 5500.00);

        //horistas:
        funcionarios[2] = new Horista("Pedro", "15/01/2002", 20.00, 160);
        funcionarios[3] = new Horista("Beatriz", "28/04/2000", 22.00, 150);

        //operários:
        funcionarios[4] = new Operario("José", "10/11/1978", 30.00, 100);
        funcionarios[5] = new Operario("Luiza", "12/03/1999", 35.00, 90);

        //venderdores:
        funcionarios[6] = new Vendedor("João", "31/01/1990", 2000.00, 50.00, 30);
        funcionarios[7] = new Vendedor("Ana", "01/01/2000", 2100.00, 60.00, 25);

        //calculando salario
        for (Funcionario f : funcionarios) {
            f.calcularSalario();
            System.out.println();
            System.out.println("Funcionário: " + f.getNome() +
                    "\nData de Nascimento: " + f.getDataNascimento() +
                    "\nSalário Calculado: R$ " + f.getSalario());
        }

    }
}