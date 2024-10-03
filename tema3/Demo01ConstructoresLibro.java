/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor unAutor;
        
        Libro libro1= new Libro("Java: A Beginner's Guide",   
                                "Ed. Pinguino",
                                2014,
                                unAutor = new Autor("Franco", "asddsa", "Argentina"),
                                "978-0071809252", 21.72);
        
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               unAutor = new Autor("Mario", "dfggfd", "Brazil"),
                                "978-1512108347");
        
        System.out.print("Representacion del autor \n" + libro1.getPrimerAutor()); 
    }
    
}
