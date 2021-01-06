package t3p3e2;

import javax.swing.JOptionPane;

public class T3P3E2 {

    
    public static void main(String[] args) {
        
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        
        invertir(cadena);
    }
    
    public static void invertir(String cadena){
        
        String cadenaInvertida="";
        
        for(int X = cadena.length()-1; X >= 0; X--)
        {
            cadenaInvertida = cadenaInvertida + cadena.charAt(X);
        }
        JOptionPane.showMessageDialog(null, cadenaInvertida);
    }
}