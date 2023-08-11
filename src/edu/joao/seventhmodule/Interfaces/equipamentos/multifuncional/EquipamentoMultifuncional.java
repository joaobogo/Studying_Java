package edu.joao.seventhmodule.Interfaces.equipamentos.multifuncional;

import edu.joao.seventhmodule.Interfaces.equipamentos.copiadora.Copiadora;
import edu.joao.seventhmodule.Interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.joao.seventhmodule.Interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora,Digitalizadora,Impressora{

    public void copiar() {
    System.out.println("Copiando via equipamento multi");
        
    }

    public void digitalizar() {
    System.out.println("Digitalizando via equipamento multi");
        
        
    }

    public void imprimir() {
      System.out.println("Imprimindo via equipamento multi");
        
        
    }
    
}
