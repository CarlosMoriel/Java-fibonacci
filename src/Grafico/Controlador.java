/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import EstructuraLogica.Arbol;

/**
 *
 * @author Carlollos
 */
public class Controlador {
    private Lienzo objLienzo;
    private Arbol objArbol;

    public Controlador(Lienzo objLienzo, Arbol objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    
    public void Iniciar(){
        objLienzo.setObjArbol(objArbol);
    }
}
