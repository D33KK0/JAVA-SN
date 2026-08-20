import java.util.Scanner;

public class Atividade3_diversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome_professor = "Anderson";
        String nome;

        do{
            System.out.print("digitar  o nome do professor mais fofo do senai: ");
            nome = sc.nextLine();

            if (!nome.equalsIgnoreCase(nome_professor)){
                System.out.println("Nome errado.\n");
            }

        }while(!nome.equalsIgnoreCase(nome_professor));
        System.out.println("Parabéns, você acertou!");
        sc.close();
        }
}
