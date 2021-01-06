
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

  
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero") );
        
         
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Hoy es Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Hoy es Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Hoy es Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Hoy es Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Hoy es Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Hoy es Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Hoy es Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El numero no corresponde a ningun dia");
                break;
        }
                          
               }
    
}
