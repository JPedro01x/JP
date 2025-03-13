
public class Pessoa {
    
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço alterado com sucesso.");
    }

    public String obterNome() {
        return nome;
    }

    public int obterIdade() {
        return idade;
    }

    public String obterEndereco() {
        return endereco;
    }

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("João", 30, "Rua A, 123");
        Pessoa pessoa2 = new Pessoa("Maria", 25, "Avenida B, 456");

        System.out.println("Pessoa 1:");
        pessoa1.imprimirInformacoes();
        System.out.println("\nPessoa 2:");
        pessoa2.imprimirInformacoes();

        pessoa1.alterarEndereco("Rua C, 789");
        pessoa2.alterarEndereco("Avenida D, 101");

        System.out.println("\nValores atualizados:");
        System.out.println("Pessoa 1:");
        pessoa1.imprimirInformacoes();
        System.out.println("\nPessoa 2:");
        pessoa2.imprimirInformacoes();
    }
}
