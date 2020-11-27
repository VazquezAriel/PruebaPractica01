/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Matrimonio {
    
    private int codigo;
    private LocalDate fecha;
    private String lugarDeCelebracion;
    private Persona contrayentes[];
    private Persona testigos[];

    public Matrimonio() {
    }

    public Matrimonio(int codigo, LocalDate fecha, String lugarDeCelebracion, Persona[] contrayentes, Persona[] testigos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.lugarDeCelebracion = lugarDeCelebracion;
        this.contrayentes = contrayentes;
        this.testigos = testigos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugarDeCelebracion() {
        return lugarDeCelebracion;
    }

    public void setLugarDeCelebracion(String lugarDeCelebracion) {
        this.lugarDeCelebracion = lugarDeCelebracion;
    }

    public Persona[] getContrayentes() {
        return contrayentes;
    }

    public void setContrayentes(Persona[] contrayentes) {
        this.contrayentes = contrayentes;
    }

    public Persona[] getTestigos() {
        return testigos;
    }

    public void setTestigos(Persona[] testigos) {
        this.testigos = testigos;
    }
     
}
