/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;

/**
 *
 * @author kas
 */
public class DirectorEjecutivo extends Empleado{
    private double montoViaticos;

    public DirectorEjecutivo(String nombre, int dni, int añoIngreso, double sueldoBasico, double montoViaticos) {
        super(nombre, dni, añoIngreso, sueldoBasico);
        this.setMontoViaticos(montoViaticos);
    }

    public double getMontoViaticos() {
        return montoViaticos;
    }

    public void setMontoViaticos(double montoViaticos) {
        this.montoViaticos = montoViaticos;
    }
    
    // metodos

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + this.getMontoViaticos();
    }  
    
}
