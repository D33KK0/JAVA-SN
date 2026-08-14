import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1+nota2) / 2;

        System.out.printf(
            "Aluno: %s%nNota 1: %.2f%nNota 2: %.2f%nMédia: %.2f%n",
            aluno, nota1, nota2, media

        );
    }
    
}
