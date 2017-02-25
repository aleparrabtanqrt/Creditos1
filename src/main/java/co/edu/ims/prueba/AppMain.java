/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.prueba;

import co.edu.ims.prueba.Pelicula;

/**
 *
 * @author 1061772807
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR UN OBJETO
        Pelicula conjuro=  new Pelicula("conjuro", 2016, "James Wan");
        Pelicula guerramundialz= new Pelicula("Guerra Mundial Z");
        
        String resultado=conjuro.MostrarDatos();
        System.out.println(resultado);
         System.out.println("");
        String resultado1=guerramundialz.MostrarDatos();
        System.out.println(resultado1);
    }
    }
    

