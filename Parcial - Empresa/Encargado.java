/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;

/**
 *
 * @author kas
 */
public class Encargado extends Empleado{
    private int cantidadEmpleadosACargo;

    public Encargado(String nombre, int dni, int añoIngreso, double sueldoBasico, int cantidadEmpleadosACargo) {
        super(nombre, dni, añoIngreso, sueldoBasico);
        this.setCantidadEmpleadosACargo(cantidadEmpleadosACargo);
    }

    public int getCantidadEmpleadosACargo() {
        return cantidadEmpleadosACargo;
    }

    public void setCantidadEmpleadosACargo(int cantidadEmpleadosACargo) {
        this.cantidadEmpleadosACargo = cantidadEmpleadosACargo;
    }
    
    // metodos adicionales

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (this.getCantidadEmpleadosACargo() * 1000);
    }  
}
