import java.util.Scanner;

public class Conde05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();


        System.out.print("Informe a senha: ");
        String senha = sc.nextLine();

        if (nome.equals("Raquel") && senha.equals("1234")) {
            System.out.print("Login realizado com sucesso!");

        } else if (nome.equals("Maria") && senha.equals("5678")) {
            System.out.print("Login realizado com sucesso!");

        } else{
            System.out.print("Dados incorretos.");
        }
        sc.close();
    }
}
