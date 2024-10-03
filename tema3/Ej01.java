/*
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
 */
package tema3;

import PaqueteLectura.Lector;

public class Ej01 {

    public static void main(String[] args) {
        Triangulo unTriangulo; //referencia
        double a, b, c;
        String colorRelleno, colorLinea;
        
        
        System.out.print("Lado 1: ");
        a = Lector.leerDouble();
        System.out.print("Lado 2: ");
        b = Lector.leerDouble();
        System.out.print("Lado 3: ");
        c = Lector.leerDouble();
        System.out.print("Color Relleno: ");
        colorRelleno = Lector.leerString();
        System.out.print("Color Linea: ");
        colorLinea = Lector.leerString();
        
        // instanciacion con constructor
        unTriangulo = new Triangulo(a, b, c, colorRelleno, colorLinea);
        
        System.out.println("Perimetro: " + unTriangulo.calcularPerimetro());
        System.out.println("Area: " + unTriangulo.calcularArea());
    }
    
}
