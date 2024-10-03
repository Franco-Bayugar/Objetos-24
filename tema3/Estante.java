/*
 */
package tema3;

public class Estante {
    // "tengo un estante (vector), tiene 20 lugares y 0 libros: eso tienen todos mis estantes"
    private Libro[] vectorLibros; //PREGUNTAR ESTA BIEN QUE ESTE SUBRAYADO???
    private int dimf = 20; // por consistencia y encapsulamiento
    private int cantLibros = 0;

    // constructor vacio que me inicialice correctamente un estante sin libros
    public Estante(){
        vectorLibros = new Libro[dimf];
    }

    // getter cant libros
    public int getCantLibros() {
        return cantLibros;
    }
    
    
    // devolver si el estante esta lleno
    private boolean estanteLleno(){
      //return this.getCantLibros() == dimf; PREGUNTAR LO DE LA INTERFAZ
        return this.cantLibros == dimf;
    }
    
    // agregar un libro al estante
    public void agregarLibro(Libro L){
        if(!this.estanteLleno()){
            this.vectorLibros[cantLibros] = L;
            this.cantLibros++;
        }
    }
    
    // devolver el libro con un titulo particular que se recibe
    // PREGUNTAR: SI DICE DEVOLVER "LIBRO", ES EL OBJETO O LA REP. TO STRING?
    public Libro devolverLibro(String titulo){
        for (int i=0; i < dimf; i++) {
            if(this.vectorLibros[i].getTitulo().equals(titulo)){
                return vectorLibros[i];
            }
        }
        return null;
    }
    
}
    
    

    
    


