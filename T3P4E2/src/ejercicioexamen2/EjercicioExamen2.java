
package ejercicioexamen2;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class EjercicioExamen2 {

    
    public static void main(String[] args) {
    
    menu();
    edad();
    palindromo();
        
    }
    
    public static void menu ()
    {
        String[] botones = {"Calcular la edad de una persona", 
        "Numeros pares y primos", 
        "Palındromos", 
        "Salir"};			
    int ventana = JOptionPane.showOptionDialog(null, 							
            "Elija una opcion:", 							
            "Examen2", 							
            JOptionPane.DEFAULT_OPTION, 							
            JOptionPane.QUESTION_MESSAGE, null, 							
            botones, botones[0]);			
    if(ventana == 0) {System.out.println("Calcular la edad de una persona");} 			
    else if(ventana == 1) {System.out.println("Numeros pares y primos");}			
    else if(ventana == 2) {System.out.println("Palındromos");}			
    else if(ventana == 3) {System.out.println("Salir");}
    }   
    
    public static void edad ()
    {
        String anos = JOptionPane.showInputDialog("Introduzca ano de nacimiento");
        String meses = JOptionPane.showInputDialog("Introduzca mes de nacimiento");
        String dias = JOptionPane.showInputDialog("Introduzca dia de nacimiento");
                        
        int ano = Integer.parseInt(anos);
        int mes = Integer.parseInt(meses);
        int dia = Integer.parseInt(dias);
        LocalDate nacimiento = LocalDate .of (ano, mes, dia);
        LocalDate actual = LocalDate .now ();

        Period periodo = Period.between(nacimiento , actual);
        JOptionPane.showMessageDialog(null, "La persona tiene " + periodo.getYears () + "anos");
        menu();
        
    }   
    
    public static void paresprimos ()
    {
        
    }
    
    public static void palindromo ()
    {
        int contador = 1;
        String palabra;
        boolean bien = false;
        
        while (!bien)
        {
            palabra = JOptionPane.showInputDialog(null, "Teclee una palabra cualquiera.");
            int fin = palabra.length()-1;
            if (palabra.charAt(0) == palabra.charAt(fin))
                JOptionPane.showInternalMessageDialog(null, "La palabra no es un palindromo");
            int fuera = 333;
            do{
            boolean correcto;
            int posfinal = palabra.length()-contador;
        
            int posdelante = (palabra.length()-palabra.length())+contador;
        
                if(palabra.charAt(posdelante) == palabra.charAt(posfinal));
                correcto = true;
        
            if(correcto = true)
                contador = contador +1;
            
            if(correcto = false)
                contador = contador + fuera;
        
            }
            while (contador>palabra.length());
            
            bien = true;                  
        }
        JOptionPane.showMessageDialog(null, "La palabra es un palindromo");
    }
    
                
}
