import java.util.Scanner;

public class Conde04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();

        if (idade <= 12){
            System.out.print("Criança.");
        } else if (idade < 18){
            System.out.print("Adolescente.");
        } else if (idade < 60){
            System.err.print("Adulto.");
        } else{
            System.out.print("Idoso.");
        }
        
        sc.close();
    }
}
