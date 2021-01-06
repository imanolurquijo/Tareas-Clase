package t3p2e1;

import javax.swing.JOptionPane;

public class T3P2E1 {

    // Variables globales
    private static int horasTrabajadas;
    private static String estadoCivil;
    private static String niveldeEstudios;
    private static int sueldo=0;
    
    public static void main(String[] args) {
        
        solicitardatos();
        calcularSueldo();
        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo); 
    }
         

    
    public static void solicitardatos(){
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));
        
        estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador (S,C,V,D)");
        
        niveldeEstudios = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador (P,M,S)");
    }
    

     
    public static float calcularSueldo(){
         //Constantes
         int PRECIOHORANORMAL = 10;
         int PRECIOHORAEXTRA = 15;
         
        if (horasTrabajadas > 40) // 40 podría ser otra constante
            sueldo = (horasTrabajadas - 40) * PRECIOHORAEXTRA + 40 * PRECIOHORANORMAL;
        else
            sueldo = horasTrabajadas * PRECIOHORANORMAL; 
                
        int plus = 100;
                
        if ("S".equals(niveldeEstudios))
            sueldo = sueldo + plus;
        else
            if (estadoCivil.compareTo("S") ==0)
                sueldo += plus;
            else
                if (estadoCivil.compareTo("V") ==0 && "P".equals(niveldeEstudios))
                    sueldo += plus;
        
        return sueldo;        
    }
}
