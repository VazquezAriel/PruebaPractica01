/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Juez;

/**
 *
 * @author ariel
 */
public class ControladorJuez extends ControladorGenerico<Juez>{
    
    private static ControladorJuez controladorJuez;
    private Juez juezLogeado;

    private ControladorJuez() {
    }

    public Juez getJuezLogeado() {
        return juezLogeado;
    }
    
    public static ControladorJuez getInstancia() {
        if (controladorJuez == null) {
            controladorJuez = new ControladorJuez();
        }
        return controladorJuez;
    }
    
    public boolean validar(String usuario, String contraseña) {
        for (Juez juez : getListado()) {
            if (juez.getUsuario().equals(usuario) && juez.getContraseña().equals(contraseña)) {
                juezLogeado = juez;
                return true;
            }
        }
        return false;
    }
    
}
