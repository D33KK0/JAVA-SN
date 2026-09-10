public class Cliente {
    
    private  String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String endereço;
    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public Cliente(String nome, String endereço){

    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereço);
    }
}
