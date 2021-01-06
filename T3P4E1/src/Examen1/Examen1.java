
package Examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW02
 */
public class Examen1 {

    
    private static String factura;
    private static int Cantidad;
    private static float Precio;
    private static float Total;
    private static float totalsiniva;
    private static int IVA;
    
    public static void main(String[] args) {
        
        String Cliente;
        float totalsiniva;
        
        int Producto;
        String Respuesta;
        do{
        
        Cliente = JOptionPane.showInputDialog("Introduzca el nombre del cliente");
        Producto = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos va a comprar"));
            int contador = 0;
        
            do{
            cantidadf();
            preciof();
            ivaf();
            operacionsiniva();
            totalsinivaf();
            
            contador = contador + 1;
            }
            
            while(contador<Producto);
         
        factura+="NOMBRE:" + Cliente + "\n"
                + "LINEAS DE DETALLE:" +"\n"
                + Cantidad + "X" + Precio + "=" + Total + "\n";
                + "TOTAL SIN IVA " + totalsiniva + "\n";
                + IVA + "% de " + 
                        
        
        Respuesta = JOptionPane.showInputDialog("¿Desea crear mas facturas?");
        
        }
        
        while ()
        {
            
            
            
        }
        
    }
    
    public static int cantidadf ()
        {        
        
            
        int Cantidad;    
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad deseada de dicho producto"));
        return (Cantidad);
               
        
        
        }
    
    public static int ivaf ()
        {     
            int IVA;
            IVA = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el IVA que se aplicara a su compra"));
            
            
            return (IVA);
        }
    
    public static float preciof ()
        {        
        float Precio;    
        Precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio por unidad"));  
        return (Precio);
        }
    
    public static float operacionsiniva ()
        {        
        float Total;
        
        
        Total = Precio * Cantidad;
        return (Total);  
            
            
        }
    
    public static float totalsinivaf ()
    {
        
        totalsiniva = Total;
        return (totalsiniva);
    }
    
    public static float sumatipoiva ()
    {
        float sumatipoiva;
        sumatipoiva = 
    }
    
    public static float sumaivas ()
    {
    
    }
}
