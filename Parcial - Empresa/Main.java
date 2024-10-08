
package Parcial1;
import PaqueteLectura.Lector;

public class Main {

    public static void main(String[] args) {
        DirectorEjecutivo unDirector = new DirectorEjecutivo("Placido", 14212, 1990, 1000, 0); 
        Empresa unaEmpresa = new Empresa("Banco Nacion", "Av. 7", unDirector, 5);
        
        Encargado unEncargado = new Encargado("Mariano", 35212, 2006, 0, 5);
        System.out.println("Posicion a cargar el encargado: ");
        int pos = Lector.leerInt();
        
        unaEmpresa.agregarEncargadoASucursal(unEncargado, (pos-1));
        
        
        Encargado unEncargado2 = new Encargado("Franco", 432, 200, 5000, 10);
        System.out.println("Posicion a cargar el encargado: ");
        int pos2 = Lector.leerInt();
        unaEmpresa.agregarEncargadoASucursal(unEncargado2, (pos2-1));
        
        System.out.println(unaEmpresa.toString());
    }
    
}
