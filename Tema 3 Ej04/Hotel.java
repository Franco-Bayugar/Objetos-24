package tema3Ej04;


public class Hotel {
    private Habitacion [] vectorHabitaciones;
    private int N;

    // constructor para incializar hotel con N habitaciones dadas
    public Hotel(int N) {
        // ESTO INICIALIZA EL VECTOR, PERO NO CADA HABITACION PARTICULAR
        this.N = N; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        this.vectorHabitaciones = new Habitacion[N];
        
        // INICIALIZAR CADA POSICION DEL VECTOR
        for (int i=0; i<N; i++) {
            this.vectorHabitaciones[i] = new Habitacion();
        }
    }
    
    // geters y setters

    public Habitacion[] getVectorHabitaciones() {
        return vectorHabitaciones;
    }

    public void setVectorHabitaciones(Habitacion[] vectorHabitaciones) {
        this.vectorHabitaciones = vectorHabitaciones;
    }
    
    // metodos
    public void cargarVectorHabitaciones(Cliente unCliente, int habitacionElegida){
        this.vectorHabitaciones[habitacionElegida].cargarHabitacion(unCliente);
    }
    
    public void aumentarPrecio(double aumento){
        for (int i = 0; i < this.N; i++) {
            this.vectorHabitaciones[i].setCosto(this.vectorHabitaciones[i].getCosto() + aumento);
        }
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < N; i++) {
            aux += "\n Habitacion numero "+(i+1)+ this.vectorHabitaciones[i].toString();
        }
        return aux;
    }
    
    
    
    
    
    
}
