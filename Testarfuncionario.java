// Classe TestarFuncionario
class TestarFuncionario {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario("Luis", "Silva", 10, 25.50);
        System.out.println("Nome completo: " + novoFuncionario.nomeCompleto());
        System.out.println("Salário inicial: " + novoFuncionario.calcularSalario());
        
        novoFuncionario.incrementarHoras(8);
        System.out.println("Salário após incremento de horas: " + novoFuncionario.calcularSalario());
    }
}