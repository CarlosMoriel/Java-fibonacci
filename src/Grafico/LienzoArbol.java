/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import EstructuraLogica.Arbol;
import javax.swing.JFrame;

/**
 *
 * @author Carlollos
 */
public class LienzoArbol {
    
    
    public static void main(String[] args) {
        FribonaciRecursivo f = new FribonaciRecursivo();
        f.setVisible(true);
        
         Arbol objArbol = new Arbol();
        Lienzo objLienzo = new Lienzo();
        Controlador objControlador = new Controlador(objLienzo, objArbol);
        
        
        
        
        
    }
}
