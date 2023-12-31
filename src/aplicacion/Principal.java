/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import modelos.Modelo;

/**
 *
 * @author mariano
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        modelo.aprenderModelo();
        System.out.println("El clasificador con Random Forest obtiene: " + modelo.aplicarModelo());
        if(modelo.aplicarModelo() == "1"){
            System.out.println("\nEs decir, el algoritmo detecta phishing en la página web");
        }else{
            System.out.println("\nEs decir, el algoritmo no detecta phishing en la página web");
        }
    }

}
