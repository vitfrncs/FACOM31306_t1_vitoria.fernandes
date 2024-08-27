import java.util.Scanner;

public class principal {

    public static void ex01() {
        Scanner sc = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        System.out.println("\n");
    }

    public static void ex02() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }

        System.out.println("\n");
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é: ");
        for (int i = 5; i >= 0; i--) {
            System.out.printf("%d ", vet[i]);
        }
        System.out.println("\n");
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");
        int i = 0;

        while (i < 6) {
            System.out.printf("Entre com o número %d: ", i + 1);
            int temp = sc.nextInt();

            if (temp % 2 != 0) {
                System.out.println("Erro: Valor inválido");
            } else {
                vet[i] = temp;
                i++;
            }
        }

        System.out.println("Os números pares digitados foram: ");
        for (int j = 0; j < 6; j++) {
            System.out.printf("%d ", vet[j]);
        }
        System.out.println("\n");
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vet[i] = sc.nextInt();
        }

        int maior = vet[0];
        int menor = vet[0];
        int soma = vet[0];
        for (int i = 1; i < 5; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
            }
            if (menor > vet[i]) {
                menor = vet[i];
            }
            soma = soma + vet[i];
        }

        float media = soma / 5.0f;

        System.out.println("Os números digitados são: ");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%d ", vet[j]);
        }
        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A média é: %.1f\n", media);
        System.out.println("\n");
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vet[i] = sc.nextInt();
        }

        int maior = vet[0];
        int menor = vet[0];
        int soma = vet[0];
        int p_maior = 0;
        int p_menor = 0;

        for (int i = 1; i < 5; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
                p_maior = i;
            }
            if (menor > vet[i]) {
                menor = vet[i];
                p_menor = i;
            }
            soma = soma + vet[i];
        }

        float media = soma / 5.0f;

        System.out.println("Os números digitados são: ");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%d ", vet[j]);
        }
        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor\n", maior, p_maior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, p_menor);
        System.out.printf("A média é: %.1f\n", media);

        System.out.println("\n");
    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        float maior;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d: ", i + 1);
            vet[i] = sc.nextInt();
        }
        maior = vet[0];

        for (int i = 0; i < 5; i++)
            if (maior < vet[i]) maior = vet[i];

        float b = 100.0f / maior;

        System.out.println("Notas normalizadas");

        for (int i = 0; i < 5; i++) {
            vet[i] = vet[i] * b;
            System.out.println("A nota do aluno " + i + " é " + vet[i]);
        }
        System.out.println("\n");
    }

    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];
        double soma = 0;
        System.out.println("<<Média e desvio-padrão>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / 5.0;
        double soma_desvio = 0;

        for (int i = 0; i < 5; i++)
            soma_desvio += Math.pow((vet[i] - media), 2);

        double desvio = Math.sqrt(soma_desvio / (5 - 1));

        System.out.printf("A média é %.1f e o desvio padrão é %.13f", media, desvio);
        System.out.println("\n");
    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("<<Média de n alunos. Máximo 100 alunos>>");
        do {
            System.out.print("Entre com o número de alunos: ");
            n = sc.nextInt();
            if (n > 100) {
                System.out.println("Erro! O número máximo de alunos permitidos é 100.");
            }
        } while (n > 100);

        float[] vet = new float[n];
        float soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d: ", (i + 1));
            vet[i] = sc.nextFloat();
            soma += vet[i];
        }

        float media = soma / (float) n;

        System.out.println("Relatório de Notas");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nA nota do aluno %d é: %.1f ", i, vet[i]);
        }
        System.out.printf("\nA média da turma é: %.1f", media);
        System.out.println("\n");
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];

        System.out.println("<<Subtração de vetores>>");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de A: ");
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de B: ");
            b[i] = sc.nextInt();
            c[i] -= b[i];
        }

        System.out.printf("\nO vetor C, definido como C=A-B é (%d, %d, %d)", c[0], c[1], c[2]);
        System.out.println("\n");
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int n_v1 = 0, n_v2 = 0;

        System.out.println("<<Pares e ímpares>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();

            if (v[i] % 2 != 0) {
                v1[n_v1] = v[i];
                n_v1++;
            } else {
                v2[n_v2] = v[i];
                n_v2++;
            }
        }

        System.out.print("Ìmpares: " + v1[0]);
        for (int i = 1; i < n_v1; i++) {
            System.out.printf(", %d", v1[i]);
        }

        System.out.print("\nPares: " + v2[0]);
        for (int i = 1; i < n_v2; i++) {
            System.out.printf(", %d", v2[i]);
        }
        System.out.println("\n");
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<Probabilidades>>");
        System.out.println("Digite a quantidade de bolinhas");
        System.out.print("Verde: ");
        int verde = sc.nextInt();

        System.out.print("Azul: ");
        int azul = sc.nextInt();

        System.out.print("Amarela: ");
        int amarela = sc.nextInt();

        System.out.print("Vermelha: ");
        int vermelha = sc.nextInt();

        int total = azul + verde + amarela + vermelha;

        double p_verde = (double) verde / (double) total;
        double maior = p_verde;

        double p_azul = (double) azul / (double) total;
        if (maior < p_azul)
            maior = p_azul;

        double p_amarela = (double) amarela / (double) total;
        if (maior < p_amarela)
            maior = p_amarela;

        double p_vermelha = (double) vermelha / (double) total;
        if (maior < p_vermelha)
            maior = p_vermelha;

        System.out.print("\nProbabilidades: ");

        System.out.printf("\nVerde: %.1f%%", (p_verde * 100));
        if (maior == p_verde)
            System.out.print("<<Maior probabilidade");

        System.out.printf("\nAzul: %.1f%%", (p_azul * 100));
        if (maior == p_azul)
            System.out.print("<<Maior probabilidade");

        System.out.printf("\nAmarela: %.1f%%", (p_amarela * 100));
        if (maior == p_amarela)
            System.out.print(" <<Maior probabilidade");

        System.out.printf("\nVermelha: %.1f%%", (p_vermelha * 100));
        if (maior == p_vermelha)
            System.out.print("<<Maior probabilidade");
        System.out.println("\n");
    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("<<Zerando os negativos>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            int n = sc.nextInt();
            if (n < 0)
                v[i] = 0;
            else
                v[i] = n;
        }

        System.out.print("\nZerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("\n");
    }

    public static class Aluno {
        public int matricula;
        public char classe;
        public float nota;
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("<<Universidade X>>");
        do {
            System.out.print("Quantos alunos serão cadastrados: ");
            n = sc.nextInt();
            if (n > 10000) {
                System.out.println("Número máximo de alunos é 10000. Tente novamente.");
            }
        } while (n > 10000);
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            alunos[i] = new Aluno();
            System.out.print("\nEntre com o número do aluno: ");
            alunos[i].matricula = sc.nextInt();

            System.out.printf("Entre a classe social do aluno %d: ", alunos[i].matricula);
            alunos[i].classe = sc.next().charAt(0);

            System.out.printf("Entre com o CRA do aluno %d: ", alunos[i].matricula);
            alunos[i].nota = sc.nextFloat();

        }
        System.out.println("====Alunos Cadastrados====");
        for (int i = 0; i < n; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", alunos[i].matricula, alunos[i].classe, alunos[i].nota);
        }
        System.out.println("\n");
    }

    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        int n = 0;
        int[] iguais = new int[8];
        System.out.println("<<Valores iguais>>");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (v[i] == v[j]) {
                    boolean flag = false;
                    for (int m = 0; m < n; m++) {
                        if (iguais[m] == v[i]) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        iguais[n] = v[i];
                        n++;
                    }
                }
            }
        }
        if (n == 0) {
            System.out.println("Não há valores repetidos.");
        } else {
            System.out.printf("\nValores repetidos: %d", iguais[0]);
            for (int m = 1; m < n; m++) {
                System.out.printf(", %d", iguais[m]);
            }
        }
        System.out.println("\n");
    }

    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        int n = 0;
        int[] iguais = new int[8];
        int[] cont = new int[8];
        System.out.println("<<Valores iguais>>");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            boolean flag = false;
            for (int j = i + 1; j < 8; j++) {
                if (v[i] == v[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                boolean existe = false; // verifica se o valor já existe no vetor iguais
                for (int m = 0; m < n; m++) {
                    if (iguais[m] == v[i]) {
                        cont[m]++;
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    iguais[n] = v[i];
                    cont[n] = 2;
                    n++;
                }
            }
        }

        if (n == 0) {
            System.out.println("Não há valores repetidos.");
        } else {
            System.out.print("\nValores repetidos: ");
            for (int m = 0; m < n; m++) {
                System.out.printf("\n%d aparece %d vezes", iguais[m], cont[m]);
            }
        }

    }



    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
    }

}
