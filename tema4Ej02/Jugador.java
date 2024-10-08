/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.tema4Ej02;

/**
 *
 * @author kas
 */
public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;

    // constructor
    public Jugador(int partidosJugados, int golesAnotados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setPartidosJugados(partidosJugados);
        this.setGolesAnotados(golesAnotados);
    }

    
    // getters y setters
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    // metodos adicionales
    
    @Override
    public double calcularEfectividad(){
        return (double) this.golesAnotados / this.partidosJugados;
    }
    
    @Override
    public double calcularSueldoACobrar(){
        double total;
        if(this.calcularEfectividad() > 0.5){
            total = super.calcularSueldoACobrar() * 2;
        } else {
            total = super.calcularSueldoACobrar();
        }
        
        return total;
    }
}
