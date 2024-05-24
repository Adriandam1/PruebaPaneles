/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapaneles;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Adrian
 */
public class PruebaPaneles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        panel1 panelP = new panel1();
        
        fran1 frame = new fran1();
        panel1 panel1 = new panel1();
        panel2 panel2 = new panel2();
        
        frame.setVisible(true);
        
        frame.add(panel1);
        frame.add(panel2);
        

        
        panel2.setVisible(false);
        //panel1.setVisible(true);
        
        frame.revalidate();
        frame.repaint(); 
        
        
        
        //panel1.setVisible(true);
        frame.pack();
         
        
        
    }
    
}
