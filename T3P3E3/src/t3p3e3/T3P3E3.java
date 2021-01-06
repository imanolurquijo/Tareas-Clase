package t3p3e3;

import javax.swing.JOptionPane;

public class T3p3e3 {

    
    public static void main(String[] args) {
        
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        
        char caracter = JOptionPane.showInputDialog("Teclea el carácter").charAt(0);
       
        int Nveces = buscar(cadena, caracter);
        
        JOptionPane.showMessageDialog(null, "El carácter " + caracter + " aparece " + Nveces + " veces en la cadena");
    }
    
    public static int buscar(String cadena, char c){
        int contador = 0;
        for(int X = 0; X < cadena.length(); X++)
            if (cadena.charAt(X)== c)
                contador=contador +1;
        return contador;
    }
      
}
