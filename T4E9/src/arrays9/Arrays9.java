
package arrays9;

import excepciones.CodigoNoValido;
import javax.swing.JOptionPane;


public class Arrays9 {

    
    public static void main(String[] args) {
    
        try
        {
            int[] unidadesvendidas= new int[10];
            int[] codigodeproducto= {10,23,30,47,55,65,135,256,526,663};
            
            char continuar;

            do
            {
                
                ventas(codigodeproducto,unidadesvendidas);
                continuar=preguntaContinuar();
            }
            while(continuar=='s');  

            salida(codigodeproducto,unidadesvendidas);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    
     private static void ventas(int[] codigodeproducto,int[] unidadesvendidas) throws Exception
    {
        int x=0;
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo del producto"));
            
        if(codigo!=10 && codigo!=23 && codigo!=30 && codigo!=47 && codigo!=55 && codigo!=65 && codigo!=135 && codigo!=256 && codigo!=526 && codigo!=663){
            
            throw new CodigoNoValido();
        }
        
        switch(codigo){
        
            case 10:
                int unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[0]= unidadesvendidas[0]+unidades;
                break;
            case 23:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[1]= unidadesvendidas[1]+unidades;
                break;
            case 30:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[2]= unidadesvendidas[2]+unidades;
                break;
            case 47:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[3]= unidadesvendidas[3]+unidades;    
                break;
            case 55:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[4]= unidadesvendidas[4]+unidades;    
                break;
            case 65:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[5]= unidadesvendidas[5]+unidades;    
                break;
            case 135:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[6]= unidadesvendidas[6]+unidades;    
                break;
            case 256:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[7]= unidadesvendidas[7]+unidades;     
                break;
            case 526:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[8]= unidadesvendidas[8]+unidades;     
                break;
            case 663:
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de unidades del producto"));
                unidadesvendidas[9]= unidadesvendidas[9]+unidades;     
                break;
            
        }
        
    }
    
    
    private static char preguntaContinuar() throws Exception
    {
        
        char continuar=' ';
        while (continuar!='s' && continuar!='n')
        {
                continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
    }
    
    
    private static void salida(int[] codigodeproducto, int[] unidadesvendidas) throws Exception
    {
        String texto="El total de productos vendidos es: \n";
        for(int x=0; x<codigodeproducto.length && codigodeproducto[x]!=0; x++)
        {  
          texto=texto + "Codigo:" + codigodeproducto[x]+ " - "+unidadesvendidas[x]+ "unidades" + "\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}