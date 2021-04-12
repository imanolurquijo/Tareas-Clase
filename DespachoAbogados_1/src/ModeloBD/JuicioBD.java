/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Juicio;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW02
 */
public class JuicioBD {
    
    private Connection con;
    
    public void Insertar(Juicio j) throws Exception {

      
        String plantilla="INSERT INTO juicio VALUES(?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,j.getId());
        ps.setString(2,j.getEstado());
        ps.setString(3,j.getFechaIni());
        ps.setString(4,j.getFechaFin());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");
        
    }
    
    public void Borrar(Juicio j) throws Exception {

        String plantilla="DELETE FROM juicio WHERE ID=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(1,j.getId());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }  
    
    public void Modificar(Juicio j) throws Exception {

        String plantilla=("UPDATE juicio ESTADO=?, FECHAINICIO=?,"
                                + " FECHAFIN=? WHERE ID=?");
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        ps.setString(4,j.getId());
        ps.setString(1,j.getEstado());
        ps.setString(2,j.getFechaIni());
        ps.setString(3,j.getFechaFin());
        
        
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Se actualiza mas de una fila");

    }
    
}
