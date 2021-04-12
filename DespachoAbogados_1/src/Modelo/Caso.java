/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW02
 */
public class Caso {
    
    private String numExpediente;
    private Cliente cliente;
    private ArrayList<Abogado> listaAbogados;

    
    public Caso() {
    }

    public Caso(String numExpediente, Cliente cliente) {
        this.numExpediente = numExpediente;
        this.cliente = cliente;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
