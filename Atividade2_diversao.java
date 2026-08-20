import java.util.Scanner;

public class Atividade2_diversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("==============CONTADOR DE NUMERO==============\nObs: Parará caso numero digitado seja negativo\n ");
        System.out.print("Digite um número: ");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            System.out.printf(
                "Numero - %d%n", numero);

            if (numero < 0) {
                System.out.printf(
            "NEGATIVO", numero);

                break;
            }
        }
        
        sc.close();
    }
}
