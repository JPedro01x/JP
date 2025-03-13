// Classe ContaCorrente
class ContaCorrente {
    private double saldo;

    public void definirSaldoInicial(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
 