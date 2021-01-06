
package t3p3e1;

import javax.swing.JOptionPane;

public class T3P3E1 {

    
    public static void main(String[] args) {
        
        String cadena = entradadatos();
        
        int numero = vocales(cadena);
        
        JOptionPane.showMessageDialog(null, " La cadena tiene las siguientes vocales" + numero);
    }
    
    public static String entradadatos(){
        
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
            
        return cadena;
    }
    
    public static int vocales(String cadena){
        
        int contador = 0;
        for(int x = 0; x < cadena.length(); x++)
        {
            switch (cadena.charAt(x))
            {
                case 'a':     
                case 'A':
                case 'e':     
                case 'E':
                case 'i':     
                case 'I':
                case 'o':     
                case 'O':
                case 'u':     
                case 'U':
                contador = contador +1;
                break;
            }
        }
        return contador; 
    } 
}
