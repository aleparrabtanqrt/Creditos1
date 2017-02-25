/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.prueba;

/**
 *
 * @author 1061772807
 */
public class Pelicula {
    
    
     //atributos
    private String titulo;
    private int anio;
    private String director;
// constructores
    //constructor1 por defecto no le paso ningun parametro

    public Pelicula() {

    }

    // constructor con todos los parametros
    // construir objetos de esa clase ejemplo pelicula
    public Pelicula(String t, int a, String d) {
        this.titulo = t;
        this.anio = a;
        this.director = d;
    }

    public Pelicula(String t) {
        this.titulo = t;
        this.anio = 1;
        this.director = "Desconocido";
    }

    // Metodos 
    //mostrar datos sirve para acceder a los atributos de la clase

    public String MostrarDatos() {
        return " Titulo -> " + titulo +"\n"+ " Año -> " + anio +"\n"+ " Director -> " + director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }


    
}
