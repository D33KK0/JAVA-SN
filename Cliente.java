package Pagamento;
public class Cliente extends Pessoa implements Pagamento{

    public Cliente(String nome){
        super(nome);
    }

    // Método da interface
    
    @Override
    public void pagar(double valor) {
        System.out.print("Pagamento realizado: R$ "+valor);
    }

    public void comprar(String produto){
        System.out.print("Produto comprado: "+produto);
    }
    
    public void comprar(String produto, int quantidade){
        System.out.print("Produto comprado: "+produto);
        System.out.print("Quantidade: "+quantidade);
    }

    public void comprar(String produto, int quantidade, double valor){
        System.out.print("Produto comprado: "+produto);
        System.out.print("Quantidade: "+quantidade);
        System.out.print("Valor Unitário: "+valor);
        System.out.print("Valor: "+(quantidade+valor));
    }

}