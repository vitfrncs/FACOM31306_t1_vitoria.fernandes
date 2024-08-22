import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

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

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é: ");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
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

        System.out.printf("Os números pares digitados foram: ");
        for (int j = 0; j < 6; j++) {
            System.out.printf("%d ", vet[j]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< 5 valores >>");

        for(int i = 0; i<5; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        int maior = vet [0];
        int menor = vet[0];
        int soma = vet[0];
        for(int i = 1; i<5; i++){
            if (maior < vet[i]){
                maior = vet[i];
            }
            if (menor > vet[i]){
                menor = vet[i];
            }
            soma = soma + vet[i];
        }

        float media = soma / 5.0f;

        System.out.printf("Os números digitados são: ");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%d ", vet[j]);
        }
        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A média é: %f\n", media);
    }

    public static void main(String[] args) {
        // ex01();
        //ex02();
        //ex03();
        //ex04();
        ex05();
    }


}
