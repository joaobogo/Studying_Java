package edu.joao.fifthmodule.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLADO SAIDA DE ITENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGAR INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("Almoxarife trocando gas");
    }

}
