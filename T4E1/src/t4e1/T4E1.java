
package t4e1;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class T4E1 {

    
    public static void main(String[] args) {
    
        float[] numeros ={(Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))) , 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))) , 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero"))), 
            (Float.parseFloat(JOptionPane.showInputDialog("Introducir numero")))};
        
        Arrays.sort(numeros);
               
        JOptionPane.showMessageDialog(null, "Minimo: " + numeros[0] + " Maximo: " + numeros[9]);
        
    }
    
}
