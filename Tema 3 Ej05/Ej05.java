/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.tema3Ej05;

import PaqueteLectura.Lector;

public class Ej05 {

    public static void main(String[] args) {
        Circulo unCirculo;
        
        System.out.println("Radio: ");
        double R = Lector.leerDouble();
        System.out.println("Color Relleno: ");
        String CR = Lector.leerString();
        System.out.println("Color Linea: ");
        String CL = Lector.leerString();
        
        unCirculo = new Circulo(R, CR, CL);
        
        System.out.print("Perimetro del circulo: ");
        System.out.println(unCirculo.calcularPerimetro());
        
        System.out.print("Area del circulo: ");
        System.out.println(unCirculo.calcularArea());
    }
    
}
