import java.util.Scanner;

public class prova {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de times que deseja cadastrar: ");
        int n = sc.nextInt();
        Time[] t = new Time[n];
        int i = 1;
        for (int p = 0; p < n; p++){
            sc.nextLine();
            System.out.print("\nDigite o nome do time" + (p+1) +": ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("O time tem jogador substituto? (Digite 1 para sim e 0 para não) ");
            int v = sc.nextInt();
            int tam;
            if (v == 1) tam = 3;
            else tam = 2;
            Jogador[] j = new Jogador[tam];
            for (int m = 0; m < 2; m++){
                sc.nextLine();
                System.out.print("\nDigite nome do jogador "+ (m+1) + ": ");
                String nomej1 = sc.next();
                sc.nextLine();
                System.out.print("Diite idade do jogador "+ (m+1) + ": ");
                int i1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite altura do jogador "+ (m+1) + ": ");
                float a1 = sc.nextFloat();
                sc.nextLine();
                System.out.print("Diite peso do jogador "+ (m+1) + ": ");
                float p1 = sc.nextFloat();
                j[m] = new Jogador(nomej1, i1, a1, p1);
            }
            if (tam == 3){
                sc.nextLine();
                System.out.print("\nDigite nome do substituto: ");
                String nomej1 = sc.next();
                sc.nextLine();
                System.out.print("Diite idade do substituto ");
                int i1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite altura do substituto: ");
                float a1 = sc.nextFloat();
                sc.nextLine();
                System.out.print("Diite peso do substituto: ");
                float p1 = sc.nextFloat();
                j[2] = new Jogador(nomej1, i1, a1, p1);
                t[p] = new Time(nome, j[0], j[1], j[2]);
            }
            else
                t[p] = new Time(nome, j[0], j[1]);

        }
        for (Time time : t){
            System.out.println("Time " + i + ":");
            time.toString();
            i++;
        }

        float maior = t[0].mediaIdades();
        int pos_maior = 0;
        for (int j = 1; j<n; j++) {
            if (maior < t[j].mediaIdades()){
                pos_maior = j;
            }
        }
        System.out.println("Time com maior média de idades: ");
        t[pos_maior].toString();
    }
}