package edu.joao.seventhmodule.MSN.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    

    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado.");
    }
}
