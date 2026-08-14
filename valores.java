public class valores {
    public static void main(String[] args) {
        
        String nome = "André";
        int idade = 21;
        double salario = 3500.50;
        
        System.out.printf(
            "Nome: %s | Idade: %d | Salário: R$ %.2f%n",
            nome,
            idade, 
            salario
        );
    }
}
