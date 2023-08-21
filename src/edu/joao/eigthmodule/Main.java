package edu.joao.eigthmodule;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Conta cc = new ContaCorrente(joao);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(joao);
        cc.transferir(40, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
