/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import PaqueteLectura.Lector;

public class Ej03C {

    public static void main(String[] args) {
        
        int N;
        
        System.out.println("Cantidad de estantes deseados: ");
        N = Lector.leerInt();
        EstanteC estante = new EstanteC(N); // el constructor me instancia el objeto con 20 de dimf, se lo asigna
        Libro L;
        Autor A;
        
        //libro 1
        A = new Autor("Franco", "asddsa", "Argentina");
        L = new Libro(); 
        
        L.setTitulo("Java: A Beginner's Guide");
        L.setEditorial("Mcgraw-Hill");
        L.setAñoEdicion(2014);
        L.setPrimerAutor(A);
        L.setISBN("978-0071809252");
        L.setPrecio(21.72);
        System.out.println(L.toString());
        estante.agregarLibro(L);
        
        
        // libro 2
        A = new Autor("German", "asddsa", "Chile");
        L = new Libro(); 
        
        L.setTitulo("Java: A Beginner's Guide");
        L.setEditorial("Mcgraw-Hill");
        L.setAñoEdicion(2014);
        L.setPrimerAutor(A);
        L.setISBN("978-0071809252");
        L.setPrecio(21.72);
        System.out.println(L.toString());
        estante.agregarLibro(L);
        
        // libro 3
        A = new Autor("Diba", "asddsa", "Peru");
        L = new Libro(); 
        
        L.setTitulo("Mujercitas");
        L.setEditorial("Mcgraw-Hill");
        L.setAñoEdicion(2014);
        L.setPrimerAutor(A);
        L.setISBN("978-0071809252");
        L.setPrecio(21.72);
        System.out.println(L.toString());
        estante.agregarLibro(L);
        
        // libro 4
        A = new Autor("Fito", "asddsa", "Uruguay");
        L = new Libro(); 
        
        L.setTitulo("Java: A Beginner's Guide");
        L.setEditorial("Mcgraw-Hill");
        L.setAñoEdicion(2014);
        L.setPrimerAutor(A);
        L.setISBN("978-0071809252");
        L.setPrecio(21.72);
        System.out.println(L.toString());
        estante.agregarLibro(L);
        
        
        // buscar e informar el autor del libro "Mujercitas" en el estante
        System.out.println(estante.devolverLibro("Mujercitas").getPrimerAutor().getNombre());
    }
    
}
