package edu.joao.fifthmodule.lanchonete.atendimento;

public class Atendente {
    
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Atendendo a mesa");
    }

    private void pegarLancheCozinha(){
        System.out.println("Pegando o lanche da cozinha");
    }

    public void receberPagamentos(){
        System.out.println("Recebendo pagamento do cliente");
    }

    void trocarGas(){
        System.out.println("Trocando gasolina");
    }

    private void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balcão");
    }
}
