public class UsaBanco {
    public static void main(String[] args) {
        ContaCorrente conta1 = ContaEspecial.criarConta(500, 12, 1234, 0);
        ContaCorrente conta2 = ContaEspecial.criarConta(1000, 13, 5678, 500);

        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo(1234));
        System.out.println("Saldo inicial da conta 2: " + conta2.getSaldo(5678));

        System.out.println("\nCONTA 1: ------------------------------------------------");
        System.out.println("Debitando 200 da conta 1:");
        if (conta1.debitaValor(200, 1234)) {
            System.out.println("Débito realizado com sucesso.\n");
        } else {
            System.out.println("Débito não permitido.\n");
        }

        System.out.println("Debitando 300 da conta 1:");
        if (conta1.debitaValor(300, 1234)) {
            System.out.println("Débito realizado com sucesso.\n");
        } else {
            System.out.println("Débito não permitido.\n");
        }

        System.out.println("Saldo atual da conta 1: " + conta1.getSaldo(1234));
        System.out.println("Estado final da conta 1: " + conta1.getEstado(1234));

        System.out.println("\nCONTA 2: ------------------------------------------------");
        System.out.println("Debitando 1200 da conta 2.\n");
        if (conta2.debitaValor(1200, 5678)) {
            System.out.println("Débito realizado com sucesso.\n");
        } else {
            System.out.println("Débito não permitido.\n");
        }

        System.out.println("Saldo atual da conta 2: " + conta2.getSaldo(5678));

        // Tentativa de débito além do saldo e do limite na conta 2:
        System.out.println("Debitando 500 da conta 2:");
        if (conta2.debitaValor(500, 5678)) {
            System.out.println("Débito realizado com sucesso.\n");
        } else {
            System.out.println("Débito não permitido.\n");
        }

        System.out.println("Saldo final da conta 2: " + conta2.getSaldo(5678));
        System.out.println("Estado final da conta 2: " + ((ContaEspecial) conta2).getEstado(5678));
    }
}
