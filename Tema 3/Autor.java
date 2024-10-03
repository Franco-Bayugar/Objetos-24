/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

public class Autor {
    // V.I
    private String nombre;
    private String biografia;
    private String origen;

    // constructor lleno y vacio 
    public Autor(String nombre, String biografia, String origen) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }

    public Autor() {
    }
    
    // getters setters

    public String getNombre() {
        return nombre;
    }

    
    // to string

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", biografia=" + biografia + ", origen=" + origen + '}';
    }
    
}
