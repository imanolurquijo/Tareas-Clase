
package t3p1e19;

import javax.swing.JOptionPane;


public class T3P1E19 {

    
    public static void main(String[] args) {
    
        int Numaleatorio = (int) (Math.random()*100);
        
        String numero = JOptionPane.showInputDialog(null,"Introduzca un numero entre 0 y 100");
        
        while (!numero.equalsIgnoreCase("Fin"))
        {
            int num = Integer.parseInt(numero);
            if (num != Numaleatorio)
            {
                if (num < Numaleatorio)
                    JOptionPane.showMessageDialog(null,"El numero es demasiado bajo");
                else
                    JOptionPane.showMessageDialog(null,"El numero es demasiado alto");
            
                numero = JOptionPane.showInputDialog("Intentalo otra vez");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Has acertado");
                numero = "Fin";
            }
        }
    }
}
