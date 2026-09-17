package Geometria;
public class Circulo extends FormaGeometrico {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double CalcularArea() {
        return  Math.PI*raio*raio;
    }
    
}
