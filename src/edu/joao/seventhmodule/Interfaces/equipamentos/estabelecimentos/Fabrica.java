package edu.joao.seventhmodule.Interfaces.equipamentos.estabelecimentos;

import edu.joao.seventhmodule.Interfaces.equipamentos.copiadora.Copiadora;
import edu.joao.seventhmodule.Interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.joao.seventhmodule.Interfaces.equipamentos.impressora.Impressora;
import edu.joao.seventhmodule.Interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;




        digitalizadora.digitalizar();
        copiadora.copiar();
        impressora.imprimir();
    }
}
