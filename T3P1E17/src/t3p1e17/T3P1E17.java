
package t3p1e17;

import javax.swing.JOptionPane;


public class T3P1E17 {

    
    public static void main(String[] args) {
    
        int n1 = 1;
        int n2 = 1;
        int n3;
        int contador = 2;
        String serie = n1 +" "+  n2 + " ";
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero"));
        while (contador < numero)
        {
            n3 = n1 + n2;
            serie = serie + n3+ " ";
            contador++;
            n1 = n2;
            n2 = n3;
        }
        JOptionPane.showMessageDialog(null,"La secuencia Fibonacci es " + serie);
    }
    
}
