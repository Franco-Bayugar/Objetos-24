
package tema3Ej04;


public class Cliente {
    private String nombre;
    private int DNI;
    private int edad; 
    
    // constructor pedido
    public Cliente(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }

    // getters y setters
    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    // to string
    @Override
    public String toString() {
        return "\n {DATOS CLIENTE}" +
               "\n NOMBRE: " + this.nombre +
               "\n DNI: " + this.DNI +
               "\n Edad: " + this.edad;
    }
    

    }
    
    
    
    

 
