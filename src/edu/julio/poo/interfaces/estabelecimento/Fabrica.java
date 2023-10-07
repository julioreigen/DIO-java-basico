package edu.julio.poo.interfaces.estabelecimento;

import edu.julio.poo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        em.imprimir();
        em.digitalizar();
        em.copiar();
    }
}
