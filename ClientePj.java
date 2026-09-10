public class ClientePj extends Cliente{
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePj(String nome, String endereço, String cnpj) {
        super(nome, endereço);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cnpj: "+cnpj);
    }

}
