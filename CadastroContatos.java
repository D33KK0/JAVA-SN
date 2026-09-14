import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String exibirDados() {
        return "Nome: " + nome + "\nTelefone: " + numero;
    }
}

class ContatoPessoal extends Contato {
    private String parentesco;

    public ContatoPessoal(String nome, String numero, String parentesco) {
        super(nome, numero);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: Pessoal\nParentesco: " + parentesco;
    }
}

class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String numero, String empresa, String cargo) {
        super(nome, numero);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: Profissional\nEmpresa: " + empresa + "\nCargo: " + cargo;
    }
}

class ContatoEmergencia extends Contato {
    private String grauPrioridade;

    public ContatoEmergencia(String nome, String numero, String grauPrioridade) {
        super(nome, numero);
        this.grauPrioridade = grauPrioridade;
    }

    public String getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(String grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: Emergência\nPrioridade: " + grauPrioridade;
    }
}

public class CadastroContatos {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nAGENDA DE CONTATOS");
            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("4 - Pesquisar contato");
            System.out.println("5 - Alterar contato");
            System.out.println("6 - Excluir contato");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telP = scanner.nextLine();
                    System.out.print("Parentesco: ");
                    String parentesco = scanner.nextLine();
                    contatos.add(new ContatoPessoal(nomeP, telP, parentesco));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeProf = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telProf = scanner.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    contatos.add(new ContatoProfissional(nomeProf, telProf, empresa, cargo));
                    break;

                case 3:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1));
                            System.out.println(contatos.get(i).exibirDados());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Contato encontrado!");
                            System.out.println(c.exibirDados());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                        break;
                    }
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + "\n" + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja alterar: ");
                    try {
                        int posAlt = Integer.parseInt(scanner.nextLine()) - 1;
                        if (posAlt >= 0 && posAlt < contatos.size()) {
                            System.out.print("Novo Nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Novo Telefone: ");
                            String novoTel = scanner.nextLine();

                            Contato c = contatos.get(posAlt);
                            c.setNome(novoNome);
                            c.setNumero(novoTel);
                        } else {
                            System.out.println("Contato inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 6:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                        break;
                    }
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + "\n" + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja excluir: ");
                    try {
                        int posExc = Integer.parseInt(scanner.nextLine()) - 1;
                        if (posExc >= 0 && posExc < contatos.size()) {
                            contatos.remove(posExc);
                            System.out.println("Contato excluído com sucesso!");
                        } else {
                            System.out.println("Contato inválido!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);

        scanner.close();
    }
}