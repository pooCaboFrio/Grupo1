/*
 * 25/10/2013
 * FELLIPE RODRIGUES DE SOUZA
 * FELIPE DA CRUZ
 * RICARDO JOSÉ
 */
package principal;

import java.awt.FlowLayout;
import javax.swing.*;

public class JanelaPrincipal extends JFrame{
    JInternalFrame ifThread;
    JPanel p;
    Alta a; 
    Baixa b;
    Normal n;
    JButton startB,stopB;
    JComboBox threadCombo;
    JRadioButton altaRadio,baixaRadio,normalRadio;
    ButtonGroup prioridadeG;
    
    
    
    public JanelaPrincipal(){
        iniciarComponentes(); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setSize(500, 300); 
        this.setVisible(true);
        ifThread.setVisible(true);
        
    }
    
    public void iniciarComponentes(){
        ifThread    = new JInternalFrame("THREAD");
        p           = new JPanel();
        a           = new Alta();
        b           = new Baixa();
        n           = new Normal();
        
        startB      = new JButton("Start");
        stopB       = new JButton("Stop");
        threadCombo = new JComboBox();
        altaRadio   = new JRadioButton("Prioridade Alta");
        baixaRadio  = new JRadioButton("Prioridade Baixa");
        normalRadio = new JRadioButton("Prioridade Normal");
        
        prioridadeG = new ButtonGroup();
        ifThread.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        ifThread.add(startB);
        ifThread.add(stopB);
        
        p.add(ifThread);
        this.add(p);
        
        
    
    }
    
}
