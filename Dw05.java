import java.util.Scanner;

public class Dw05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op; // Declarada fora para ser visível na condição do while

        do {
            System.out.println("\n1 - Iniciar jogo");
            System.out.println("2 - Carregar jogo");
            System.out.println("3 - Configurações");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Iniciando jogo.");
                    break;
                case 2:
                    System.out.println("Carregando jogo.");
                    break;
                case 3:
                    System.out.println("Configurações.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 0);
    }
}