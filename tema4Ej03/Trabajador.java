/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.tema4Ej03;

/**
 *
 * @author kas
 */
public class Trabajador extends Persona{
    private String tareaRealizada;

    
    // constructor
    public Trabajador(String unNombre, int unDNI, int unaEdad, String tareaRealizada) {
        super(unNombre, unDNI, unaEdad);
        this.setTareaRealizada(tareaRealizada);
    }
    
    
    // gets y sets
    
    public String getTareaRealizada() {
        return tareaRealizada;
    }

    public void setTareaRealizada(String tareaRealizada) {
        this.tareaRealizada = tareaRealizada;
    }
    
    
    // metodos adicinales

    @Override
    public String toString() {
        return super.toString() + "\n Tarea Realizada: " + this.getTareaRealizada();
    }

    

}
