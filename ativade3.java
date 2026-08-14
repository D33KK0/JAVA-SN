import java.util.Scanner;

public class ativade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do cliente:");
        String nome_do_cliente = scanner.nextLine();

        System.out.print("Nome do produto: ");
        String nome_do_produto = scanner.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Valor unitário: ");
        double valor_unitario = scanner.nextDouble();

        double valor_total = quantidade*valor_unitario;

        System.out.println("==============NOTA FISCAL==============");
        System.out.printf(
            "Cliente: %s%nProduto: %s%nQuantidade: %d%nValor unitário: %.2f%nValor total: %.2f%n",
            nome_do_cliente, nome_do_produto, quantidade, valor_unitario, valor_total
        );
        System.out.println("==========================================");
    }
    
}
