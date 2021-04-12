/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;


public class Cliente {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correoE;
    private ArrayList<Caso>ListaCasos;
    
    
    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correoE, ArrayList<Caso> ListaCasos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoE = correoE;
        this.ListaCasos = ListaCasos;
    }

    public ArrayList<Caso> getListaCasos() {
        return ListaCasos;
    }

    public void setListaCasos(ArrayList<Caso> ListaCasos) {
        this.ListaCasos = ListaCasos;
    }

    
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }
    
    
    
}
