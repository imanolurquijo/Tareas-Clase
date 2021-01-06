
package t3p1e16;

import javax.swing.JOptionPane;


public class T3P1E16 {

    
    public static void main(String[] args) {
    
        int notamaxima = -1;
        int notaminima = 11;
        String nombremaxima="";
        String nombreminima="";
    
        for ( int contador = 0; contador < 40; contador++)
        {
            String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Teclea la calificación del alumno"));
            if (calificacion > notamaxima)
            {
                notamaxima = calificacion;
                nombremaxima = nombre;
            }
            if (calificacion < notaminima)
            {
                notaminima = calificacion;
                nombreminima = nombre;
            }
        }
    
        JOptionPane.showMessageDialog(null, "La nota mas alta es " + notamaxima + "de" + nombremaxima 
                + "y la nota mas baja es " + notaminima + "de" + nombreminima);
    }
    
}
