/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;

public class Ej01 {
    public static void main(String[] args) {
        Persona hombre = new Persona("Franco", 404040, 26);
        
        System.out.println("Nombre actual: " + hombre.getNombre());
        hombre.setNombre("Mariano");
        System.out.println("Nombre actualizado: " + hombre.getNombre());
        
        System.out.println(hombre.toString());
    }    
}
