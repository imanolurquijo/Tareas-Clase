/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Abogado;
import despachoabogados.DespachoAbogados;
import java.sql.*;

/**
 *
 * @author 1GDAW02
 */
public class AbogadoBD {
    

    private static ConexionBD base;
    private static ResultSet resultado;
    
    public AbogadoBD(){
        base = new ConexionBD();
    }
    
    public void Insertar(Abogado a) throws Exception {

      
        String plantilla="INSERT INTO abogados VALUES(?,?,?,?)";
        PreparedStatement ps=base.getCon().prepareStatement(plantilla);
        
        ps.setString(1,a.getDni());
        ps.setString(2,a.getNombre());
        ps.setString(3,a.getApellidos());
        ps.setString(4,a.getDireccion());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");
        
    }
    
    public void Borrar(Abogado a) throws Exception {

        String plantilla="DELETE FROM abogados WHERE dni=?";
        PreparedStatement ps=base.getCon().prepareStatement(plantilla);
        
        ps.setString(1,a.getDni());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }  
    
    public void Modificar(Abogado a) throws Exception {

        String plantilla="UPDATE abogados nombre=?, apellidos=?, direccion=? WHERE dni=?";
        PreparedStatement ps=base.getCon().prepareStatement(plantilla);
        
        ps.setString(4,a.getDni());
        ps.setString(1,a.getNombre());
        ps.setString(2,a.getApellidos());
        ps.setString(3,a.getDireccion());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }      
    
    public Seleccionar(Abogado a, boolean casos) throws Exception {

        base.Conectar();
        
        String plantilla = "Select * from abogado where dni = ?";
        PreparedStatement sentenciaPre = base.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,a.getDni());
      
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
            a = crearAbogado(casos);
        else
            a = null;
        
        base.desconectar();  
        return a;
    }      
    
    public Abogado crearAbogado(boolean casos) throws Exception
    {
        Abogado a = new Abogado();
        
        a.setDni(resultado.getString("dni"));
        a.setNombre(resultado.getString("nombre"));
        a.setApellidos(resultado.getString("apellidos"));
        a.setDireccion(resultado.getString("direccion"));
       
        if (casos)
             a.setCasosAsignados(resultado.getArray("casosAsignados"));
        return a;
    }
    
}
