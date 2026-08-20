import java.util.Scanner;

public class Dw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();

        int numero=5;
        do{
            System.out.println(numero);
            numero++;
        }while(numero<=limite);
    }
}