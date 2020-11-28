/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;

/**
 *
 * @author ariel
 */
public class ControladorPersona extends ControladorGenerico<Persona>{
    
    private static ControladorPersona controladorPersona;

    private ControladorPersona() {
    }
    
    public static ControladorPersona getInstancia() {
        if (controladorPersona == null) {
            controladorPersona = new ControladorPersona();
        }
        return controladorPersona;
    }
    
}
