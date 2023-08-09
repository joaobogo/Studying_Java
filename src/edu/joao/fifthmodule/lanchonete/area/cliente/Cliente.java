package edu.joao.fifthmodule.lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolha o lanche");
    }

    public void fazerPedido(){
        System.out.println("Fazer pedido.");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagamento da conta.");
    }

    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo do aplicativo.");
    }

 
}
