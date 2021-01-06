
package ejercicio10;

import javax.swing.JOptionPane;


public class Ejercicio10 {

       public static void main(String[] args) {
     int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
     int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
     int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero"));
     
     if (numero1 > numero2 && numero1 > numero3)
         System.out.println("El numero maas grande es", numero1);
         if (numero2 > numero3)
             System.out.println("El numero maas grande es", numero2);
         else
             System.out.println("El numero maas grande es", numero3);
     
     
    }
    
}
