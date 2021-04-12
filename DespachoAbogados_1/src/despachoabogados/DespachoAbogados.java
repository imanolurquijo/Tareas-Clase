/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despachoabogados;

import Modelo.*;
import ModeloBD.*;
import VistaPrincipal.VPrincipal;
import java.util.ArrayList;
import javax.swing.JFrame;
import Excepciones.AbogadoNoEncontrtado;

/**
 *
 * @author 1GDAW02
 */
public class DespachoAbogados {


    private static Abogado a;
    private static Caso c;
    private static Cliente cl;
    private static Juicio j;
    private static ArrayList <Abogado> listaAbogados;
    private static ArrayList <Cliente> listaClientes;
    private static ArrayList<Caso> listaCasos;
    private static ArrayList<Juicio> listaJuicios;
    
    
    private static ConexionBD base;
    private static AbogadoBD abogadoBD;
    private static CasoBD casoBD;
    private static ClienteBD clienteBD;
    private static JuicioBD juiciobd;
    
    private static VistaPrincipal.VPrincipal vp;
    
    private static VistaAbogados.VistaAlta vaa;
    private static VistaAbogados.VistaBorrar vab;
    private static VistaAbogados.VistaModificacion vam;
    private static VistaAbogados.VistaConsulta vac;
    
    private static VistaClientes.VistaAlta vca;
    private static VistaClientes.VistaBorrar vcb;
    private static VistaClientes.VistaModificar vcm;
    private static VistaClientes.VistaConsultar vcc;
    
    
    
    public static void main(String[] args) {
        try
       { 
            abogadoBD = new AbogadoBD();
            casoBD = new CasoBD();
            clienteBD = new ClienteBD();
                    
            vp = new VPrincipal();
            vp.setVisible(true);
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
    
    
    public static void volver(JFrame v)
    {
        v.dispose();
    }
    
     public static void terminar()
    {
        System.exit(0);
    }
    
    
    
    public static void vistaAltaAbogado(){
        vaa = new VistaAbogados.VistaAlta();
        vaa.setVisible(true);
    }
    
    public static void vistaBajaAbogado(){
        vab = new VistaAbogados.VistaBorrar();
        vab.setVisible(true);
    }
    
    public static void vistaModificarAbogado(){
        vam = new VistaAbogados.VistaModificacion();
        vam.setVisible(true);
    }
    
    public static void vistaConsultarAbogado(){
        vac = new VistaAbogados.VistaConsulta();
        vac.setVisible(true);
    }
    
    public static void vistaAltaCliente(){
        vca = new VistaClientes.VistaAlta();
        vca.setVisible(true);
    }
    
    public static void vistaBajaCliente(){
        vcb = new VistaClientes.VistaBorrar();
        vcb.setVisible(true);
    }
    
    public static void vistaModificarCliente(){
        vcm = new VistaClientes.VistaModificar();
        vcm.setVisible(true);
    }
    
    public static void vistaConsultarCliente(){
        vcc = new VistaClientes.VistaConsultar();
        vcc.setVisible(true);
    }
    
        
    public static void altaAbogado(String dni, String nombre,String apellidos,String dir) throws Exception
    {
            a = new Abogado(dni,nombre,apellidos,dir);
           
         // Envío a la base de datos
            abogadoBD.Insertar(a);
    }
    
    public static void consultarAbogado(String dni,boolean casos)throws Exception{
         
        a = new Abogado(dni);
        
        Abogado encontrado;
        encontrado = abogadoBD.Seleccionar(a,casos);
        // El orden importa. El último el de bdo
        if (encontrado == null)
            throw new AbogadoNoEncontrtado();
        a = encontrado;
        
    }
     
    public static String getDniAbogado(){
        return a.getDni();
    } 
    
    public static String getNombreAbogado(){
        return a.getNombre();
    }
    
    public static String getApellidosAbogado(){
        return a.getApellidos();
    }
    
    public static String getDireccionAbogado(){
        return a.getDireccion();
    }
    
    public static void bajaAbogado() throws Exception{
       abogadoBD.Borrar(a);
    }
    
    
    
}
