import java.util.Scanner;
public class CarroApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Carro c =new Carro(null, null, 0);

        System.out.println("Informe a Marca do Carro: ");
        c.setMarca(sc.nextLine());

        System.out.println("Informe o Modelo: ");
        c.setModelo(sc.nextLine());

        System.out.println("infome o ano: ");
        c.setAnoFabricacao(sc.nextInt());

        System.out.println("A marca: "+c.getMarca());
        System.out.println("O Modelo: "+c.getModelo());
        System.out.println("O Ano de Fábrica: "+c.getAnoFabricacao());

        sc.close();
    
    }
}
