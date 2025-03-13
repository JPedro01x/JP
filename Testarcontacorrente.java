// Classe TestarContaCorrente
class TestarContaCorrente {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo inicial: " + novaConta.getSaldo());

        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println("Saldo após saque e depósito: " + novaConta.getSaldo());

        novaConta.sacar(600);
        System.out.println("Saldo final: " + novaConta.getSaldo());
    }
    }