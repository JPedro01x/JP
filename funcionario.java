// Classe Funcionario
class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, String sobrenome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public void incrementarHoras(int horas) {
        this.horasTrabalhadas += horas;
    }
}
