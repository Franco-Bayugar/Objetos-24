/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.tema4Ej02;

/**
 *
 * @author kas
 */
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    // constructor
    public Empleado(String nombre, double sueldoBasico, int antiguedad) {
        this.setNombre(nombre);
        this.setSueldoBasico(sueldoBasico);
        this.setAntiguedad(antiguedad);
    }
    
    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    // metodos adicionales
    public abstract double calcularEfectividad();
    
    public double calcularSueldoACobrar(){
        return this.getSueldoBasico() + ((this.getSueldoBasico() * 0.1) * this.getAntiguedad());
    };  
    
    
    // to string

    @Override
    public String toString() {
        return "\n EMPLEADO" +
               "\n Nombre: " + this.getNombre() +
               "\n Sueldo a cobrar: " + this.calcularSueldoACobrar() +
               "\n Efectividad: " + this.calcularEfectividad();
    }
    
    
    
}
