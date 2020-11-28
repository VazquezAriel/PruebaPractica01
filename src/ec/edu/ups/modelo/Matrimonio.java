/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Matrimonio implements Serializable{
    
    private int codigo;
    private LocalDate fecha;
    private String lugarDeCelebracion;
    private Persona contrayente1;
    private Persona contrayente2;
    private Persona testigo1;
    private Persona testigo2;
    private Juez juez;

    public Matrimonio() {
    }

    public Matrimonio(int codigo, LocalDate fecha, String lugarDeCelebracion, Persona contrayente1, Persona contrayente2, Persona testigo1, Persona testigo2, Juez juez) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.lugarDeCelebracion = lugarDeCelebracion;
        this.contrayente1 = contrayente1;
        this.contrayente2 = contrayente2;
        this.testigo1 = testigo1;
        this.testigo2 = testigo2;
        this.juez = juez;
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

    public Persona getContrayente1() {
        return contrayente1;
    }

    public void setContrayente1(Persona contrayente1) {
        this.contrayente1 = contrayente1;
    }

    public Persona getContrayente2() {
        return contrayente2;
    }

    public void setContrayente2(Persona contrayente2) {
        this.contrayente2 = contrayente2;
    }

    public Persona getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(Persona testigo1) {
        this.testigo1 = testigo1;
    }

    public Persona getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Persona testigo2) {
        this.testigo2 = testigo2;
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matrimonio other = (Matrimonio) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrimonio{" + "codigo=" + codigo + ", fecha=" + fecha + ", lugarDeCelebracion=" + lugarDeCelebracion + ", contrayente1=" + contrayente1 + ", contrayente2=" + contrayente2 + ", testigo1=" + testigo1 + ", testigo2=" + testigo2 + ", juez=" + juez + '}';
    }

}
