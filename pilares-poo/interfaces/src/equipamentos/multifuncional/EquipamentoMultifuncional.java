package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO NA MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO NA MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO NA MULTIFUNCIONAL");
    }
}
