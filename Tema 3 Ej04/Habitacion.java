package tema3Ej04;
import PaqueteLectura.GeneradorAleatorio;

public class Habitacion {
     private double costo = GeneradorAleatorio.generarInt(8000 - 2000 + 1) + 2000;
     private boolean ocupada = false;
     Cliente unCliente;

    public Habitacion() {
    }
     
     // getters y setters

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // metodos
    public void cargarHabitacion(Cliente unCliente){
        this.ocupada = true;
        this.unCliente = unCliente;
    }

    @Override
    public String toString() {
        String aux = "";
        
        if(this.ocupada){
            aux+= "\n Costo: " + this.costo +
                  "\n Ocupada=" + this.ocupada + this.unCliente.toString();
        } else {
            aux+= "\n Costo: " + this.costo + 
                  "\n Ocupada=" + this.ocupada +   " [---SIN CLIENTE---]";
        }
        return aux;
    }
     
     
}
