public class PessoasApp {
    
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas(1,"Nuno");
        Pessoas p2 = new Pessoas(2, "neto");

        System.out.println("Pessoa: "+p1.getCodigo()+" Nome: "+p1.getNome());
        
        //modificador
        p1.setNome("Vanessa");

        System.out.println("Pessoa: "+p2.getCodigo()+" Nome: "+p2.getNome());

        p2.setNome("Maria");
    }

}
