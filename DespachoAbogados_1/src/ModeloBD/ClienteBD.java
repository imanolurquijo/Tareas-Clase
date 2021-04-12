/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;


import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 1GDAW02
 */
public class ClienteBD {
    
    private static ConexionBD base;
    private static ResultSet resultado;
    
    public ClienteBD(){
        base = new ConexionBD();
    }
    
    public void Insertar(Cliente c) throws Exception {

      
        String plantilla="INSERT INTO cliente VALUES(?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,c.getDni());
        ps.setString(2,c.getNombre());
        ps.setString(3,c.getApellidos());
        ps.setString(4,c.getDireccion());
        ps.setString(5,c.getTelefono());
        ps.setString(4,c.getCorreoE());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");
        
    }
    
    public void Borrar(Cliente c) throws Exception {

        String plantilla="DELETE FROM cliente WHERE dni=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,c.getDni());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }  
    
    public void Modificar(Cliente c) throws Exception {

        String plantilla="UPDATE cliente nombre=?, apellidos=?, direccion=?, telefono=?, correo=? WHERE dni=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(6,c.getDni());
        ps.setString(1,c.getNombre());
        ps.setString(2,c.getApellidos());
        ps.setString(3,c.getDireccion());
        ps.setString(4,c.getTelefono());
        ps.setString(5,c.getCorreoE());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }
    
    public Seleccionar(Cliente c, boolean casos) throws Exception {

        base.Conectar();
        
        String plantilla = "Select * from cliente where dni = ?";
        PreparedStatement sentenciaPre = base.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,c.getDni());
      
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
            c = crearCliente(casos);
        else
            c = null;
        
        base.desconectar();  
        return c;
    }      
    
    public Cliente crearCliente(boolean casos) throws Exception
    {
        Cliente c = new Cliente();
        
        c.setDni(resultado.getString("dni"));
        c.setNombre(resultado.getString("nombre"));
        c.setApellidos(resultado.getString("apellidos"));
        c.setDireccion(resultado.getString("direccion"));
        c.setTelefono(resultado.getString("telefono"));
        c.setCorreoE(resultado.getString("correo"));
       
        if (casos)
             c.setListaCasos(resultado.getArray("listacasos"));
        return c;
    }
    
}
