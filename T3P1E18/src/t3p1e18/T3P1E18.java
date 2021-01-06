
package t3p1e18;

import javax.swing.JOptionPane;


public class T3P1E18 {

    
    public static void main(String[] args) {
    
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        int contador = 0;
        int impar = 1;
        int resultado = 0;
        while(contador < numero)
        {
            resultado = resultado + impar;
            impar = impar + 2;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null,"El cuadrado de" + numero + "es" + resultado);
    }
    
}
