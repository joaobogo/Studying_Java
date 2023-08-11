package edu.joao.seventhmodule.MSN;

import edu.joao.seventhmodule.MSN.apps.FacebookMessenger;
import edu.joao.seventhmodule.MSN.apps.MSNMessenger;
import edu.joao.seventhmodule.MSN.apps.ServicoMensagemInstantanea;
import edu.joao.seventhmodule.MSN.apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
  ServicoMensagemInstantanea smi = null;

  String appEscolhido = "msn";

  if(appEscolhido.equals("msn"))
  smi = new MSNMessenger();
  else if(appEscolhido.equals("fbm"))
  smi= new FacebookMessenger();
  else if(appEscolhido.equals("tlg"))
  smi =new TelegramMessenger();

  smi.enviarMensagem();
  smi.receberMensagem();
    }
}
