package edu.julio.poo.interfaces.equipamentos.multifuncional;

import edu.julio.poo.interfaces.equipamentos.copiadora.Copiadora;
import edu.julio.poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.julio.poo.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }
}
