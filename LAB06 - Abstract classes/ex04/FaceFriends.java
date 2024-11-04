import java.util.Scanner;




public class FaceFriends {

    static Contato [] contatos = new Contato[100];
    static int c = 0; //quatidade de contatos gravados
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        /*Contato [] contatos = new Contato[100];
        int c = 0; //quatidade de contatos gravados*/
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\nMENU");
            System.out.println("1. Inserir contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir familiares");
            System.out.println("4. Imprimir amigos");
            System.out.println("5. Imprimir colegas de trabalho");
            System.out.println("6. Imprimir melhores amigos, irmãos e colegas de trabalho");
            System.out.println("7. Imprimir um único contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    inserirContato(scanner);
                    break;
                case 2:
                    imprimirContatos();
                    break;
                case 3:
                    imprimirFamilia();
                    break;
                case 4:
                    imprimirAmigos();
                    break;
                case 5:
                    imprimirTrabalho();
                    break;
                case 6:
                    imprimirEspecifico();
                    break;
                case 7:
                    imprimirUnico(scanner);
                    break;
                case 0:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opcão inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }
    private static void inserirContato(Scanner s){
        if (c >= contatos.length) {
            System.out.println("Não é possível inserir mais contatos.");
            return;
        }

        System.out.print("Escolha o tipo de contato (1. Família, 2. Amigos, 3. Trabalho): ");
        int tipo = s.nextInt();
        s.nextLine();
        while (tipo != 1 && tipo != 2 && tipo != 3){
            System.out.println("Tipo inválido! Tente novamente.\n");
            System.out.print("Escolha o tipo de contato (1. Família, 2. Amigos, 3. Trabalho): ");
            tipo = s.nextInt();
            s.nextLine();
        }

        System.out.print("Apelido: ");
        String apelido = s.nextLine();
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Email: ");
        String email = s.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = s.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Parentesco: ");
                String parentesco = s.nextLine();
                contatos[c] = new Familia(apelido, nome, email, aniversario, parentesco);
                c++;
                break;
            case 2:
                System.out.print("Grau de amizade (1 = melhor amigo, 2 = amigo, 3 = conhecido): ");
                int grau = s.nextInt();
                s.nextLine();
                while (grau != 1 && grau != 2 && grau != 3){
                    System.out.println("Grau inválido! Tente novamente.\n");
                    System.out.print("Grau de amizade (1 = melhor amigo, 2 = amigo, 3 = conhecido): ");
                    grau = s.nextInt();

                }
                contatos[c] = new Amigos(apelido, nome, email, aniversario, grau);
                c++;
                break;
            case 3:
                System.out.print("Tipo de contato no trabalho: ");
                String tipoTrabalho = s.nextLine();
                contatos[c] = new Trabalho(apelido, nome, email, aniversario, tipoTrabalho);
                c++;
                break;
            default:
                System.out.println("Opção de contato inválida.");
        }
    }

    private static void imprimirContatos(){
        for (int i = 0; i < c; i++){
            System.out.println(contatos[i].imprimirContato());
            System.out.println();
        }

    }

    private static void imprimirFamilia(){
        for (int i = 0; i < c; i++){
            if(contatos[i] instanceof Familia){
                System.out.println(contatos[i].imprimirContato());
                System.out.println();
            }
        }
    }

    private static void imprimirAmigos(){
        for (int i = 0; i < c; i++){
            if(contatos[i] instanceof Amigos){
                System.out.println(contatos[i].imprimirContato());
                System.out.println();
            }
        }
    }

    private static void imprimirTrabalho(){
        for (int i = 0; i < c; i++){
            if(contatos[i] instanceof Trabalho){
                System.out.println(contatos[i].imprimirContato());
                System.out.println();
            }
        }
    }

    private static void imprimirEspecifico(){
        for (int i = 0; i < c; i++){
            if(contatos[i] instanceof Amigos && ((Amigos) contatos[i]).getGrau() == 1){
                System.out.println(contatos[i].imprimirContato());
            } else if(contatos[i] instanceof Familia && ((Familia) contatos[i]).getParentesco().equals("irmão")){
                System.out.println(contatos[i].imprimirContato());
            } else if(contatos[i] instanceof Trabalho && ((Trabalho) contatos[i]).getTipo().equals("colega")){
                System.out.println(contatos[i].imprimirContato());
            }
            System.out.println();
        }
    }

    private static void imprimirUnico(Scanner s){
        System.out.print("Índice do contato: ");
        int indice = s.nextInt();
        s.nextLine();
        while (indice > c || indice < 0){
            System.out.println("Opção inválida. Tente novamente.\n");
            System.out.print("Índice do contato: ");
            indice = s.nextInt();
            s.nextLine();
        }

        String tipoContato = contatos[indice] instanceof Familia ? "Família"
                : contatos[indice] instanceof Amigos ? "Amigos"
                : "Trabalho";
        System.out.println("Tipo de Contato: "+tipoContato + "\n" + contatos[indice].imprimirContato());
        System.out.println();
    }
}