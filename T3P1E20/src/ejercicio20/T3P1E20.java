
package ejercicio20;

import javax.swing.JOptionPane;


public class T3P1E20 {

    
    public static void main(String[] args) {
    
        boolean primo = false;
    
    int contador = 0;
    int numero = IntegerParseInt(JOptionPane.showInputDialog("inserte numero"));
    for(int i = numero; i > 0; i--){
        if(numero % i == 0 ){
        contador++;
    }
    }
    if(contador == 2){
    primo = true;
    }
    JOptionPane.showMessageDialog(null, primo);
    }

    private static int IntegerParseInt(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
