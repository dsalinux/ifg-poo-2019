package br.edu.ifg.projetopoo14;

import br.edu.ifg.projetopoo14.forms.TelaPrincipal;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
//            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        new TelaPrincipal().setVisible(true);
    }
    
}
