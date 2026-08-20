import java.util.Scanner;

public class Wh4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=5) {
            
            System.out.print("1 - Cadastro");
            
            System.out.print("2 - Lista");
            
            System.out.print("3 - Alterar");
            
            System.out.print("4 - Remover");
            
            System.out.print("5 - Sair");
            
            System.out.print("Escolha a opção: ");
            int opcao= sc.nextInt();


            switch (op) {
                case 1:
                    System.out.print("MENU");
                case 2:
                    System.out.print("CADASTRAR: ");
                case 3:
                    System.out.print("MENU");
                case 4:
                    System.out.print("MENU");
                case 5:
                    System.out.print("Saindo...");
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}