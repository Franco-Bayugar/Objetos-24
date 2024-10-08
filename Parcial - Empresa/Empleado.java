package Parcial1;
public class Empleado {
    private String nombre;
    private int dni;
    private int añoIngreso;
    private double sueldoBasico;

    public Empleado(String nombre, int dni, int añoIngreso, double sueldoBasico) {
        this.setNombre(nombre);
        this.setDni(dni);
        this.setAñoIngreso(añoIngreso);
        this.setSueldoBasico(sueldoBasico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    // metodos
  
    
    
    public double calcularSueldo(){
        double sueldoTotal = this.getSueldoBasico();
        if (2024 - this.getAñoIngreso() > 20)
            sueldoTotal = this.getSueldoBasico() + (this.getSueldoBasico() * 0.1);
        return sueldoTotal;
        
     
     // to String
     
     
    }

    @Override
    public String toString() {
        return "\n Empleado: " +
                "\n Nombre: " + this.getNombre() +
                "\n DNI: " + this.getDni() +
                "\n Sueldo a Cobrar: " + this.calcularSueldo();
    }
}
