package edu.joao.seventhmodule.MSN.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo FB");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo FB");

    }

}
