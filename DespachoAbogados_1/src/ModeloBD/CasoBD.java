/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Caso;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CasoBD {
    
    private static ConexionBD base;
    private static ResultSet resultado;
    
    public CasoBD(){
        base = new ConexionBD();
    }
    
    public void Insertar(Caso c) throws Exception {

      
        String plantilla="INSERT INTO caso VALUES(?,?)";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,c.getNumExpediente());
        ps.setString(2,c.getCliente().getDni());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");
        
    }
    
    public void Borrar(Caso c) throws Exception {

        String plantilla="DELETE FROM caso WHERE Expediente=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,c.getNumExpediente());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }  
    
    public void Modificar(Caso c) throws Exception {

        String plantilla="UPDATE caso dni=? WHERE Expediente=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(2,c.getNumExpediente());
        ps.setString(1,c.getCliente().getDni());
        
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }
    
    public Seleccionar(Caso c) throws Exception {

        base.Conectar();
        
        String plantilla = "Select * from caso where numexpediente = ?";
        PreparedStatement sentenciaPre = base.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,c.getNumExpediente());
      
        resultado = sentenciaPre.executeQuery();

        base.desconectar();  
        return c;
    }      
    
    public Caso crearCaso() throws Exception
    {
        Caso c = new Ccaso();
        
        c.setNumExpediente(resultado.getString("numexpediente"));
        c.setCliente(resultado.getObject("cliente")
       
        return c;
    }
    
    
}
