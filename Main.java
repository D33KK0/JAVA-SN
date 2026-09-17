package Pagamento;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do Cliente: ");
        String nome = sc.nextLine();

        Cliente cliente = new Cliente(nome);
        cliente.mostrarDados();
        

        System.out.print("Informe o nome do Produto: ");
        String produto = sc.nextLine();

        System.out.print("Informe a quantidade do produto: ");
        int quantidade = sc.nextInt();

        System.out.print("Informe o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.print("\n<<<COMPRAS>>>");
        cliente.comprar(produto, quantidade);
        System.out.println();

        cliente.comprar(produto, quantidade, valor);
        
        double total = quantidade*valor;

        System.out.print("=======PAGAMENTO=======");
        cliente.pagar(total);


        sc.close();
    }
}
