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
public class Juicio extends Caso {
    
    private String id;
    private String estado;
    private String fechaIni;
    private String fechaFin;

    public Juicio() {
    }

    public Juicio(String id, String estado, String fechaIni, String fechaFin, String numExpediente, Cliente cliente) {
        super(numExpediente, cliente);
        this.id=id;
        this.estado = estado;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
    
}
