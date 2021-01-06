
package t3p1e15;

import javax.swing.JOptionPane;


public class T3P1E15 {

    
    public static void main(String[] args) {
    
        int contador=0;
        int suma=0;
        int respuesta;
      
        do
        {
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea la edad del alumno"));
            contador++;
            suma += edad;
            respuesta = JOptionPane.showConfirmDialog(null, "Ay mas alumnos");
        }
        while(respuesta == 0);
        JOptionPane.showMessageDialog(null, " La media de edad es " + suma);
    }
    
}
