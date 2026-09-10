public class Carro {
    
    private  String Marca;
    private String modelo;
    private int anoFabricacao;

    public Carro(String Marca, String modelo, int anoFabricacao){
        this.Marca=Marca;
        this.modelo=modelo;
        this.anoFabricacao=anoFabricacao;

    }

    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca=Marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao=anoFabricacao;
    }
}
