import java.util.Scanner;

public class Conde03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade=sc.nextInt();

        System.out.println("É estudante? Digite 1 para Sim ou 0 NÃO: ");
        int estudante=sc.nextInt();

        if (idade>60 || estudante==1){
            System.out.println("Você tem direito a desconto.");
        }else{
            System.out.println("Você não tem direito ao desconto.");
        }
        sc.close();
    }
}