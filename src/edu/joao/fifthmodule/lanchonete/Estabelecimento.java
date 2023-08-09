package edu.joao.fifthmodule.lanchonete;
import edu.joao.fifthmodule.lanchonete.area.cliente.Cliente;
import edu.joao.fifthmodule.lanchonete.atendimento.Atendente;
import edu.joao.fifthmodule.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamentos();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

       

       

       

    }
}
