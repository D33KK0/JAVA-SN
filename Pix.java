package Pagamento;
public class Pix implements Pagamento {
    
    @Override
    public void pagar(double valor){
        System.out.print("Pagamento realizado via PIX!");
        System.out.printf("Valor pago: R$ "+valor);
    }
}
