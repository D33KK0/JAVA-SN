package Geometria;
public class FormaApp {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(raio: 5);
        Retangulo retangulo = new Retangulo(raio: 5);
        System.out.print("Área do Circulo: "+circulo.CalcularArea());
        
        System.out.print("Área do Retângulo: "+retangulo.CalcularArea());

    }
}
