package Geometria;
public class Retangulo extends FormaGeometrico {
    
    private double comprimento;
    
    private  double largura;
    
    public  Retangulo(double Comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double CalcularArea() {
        return comprimento*largura;
    }
}
