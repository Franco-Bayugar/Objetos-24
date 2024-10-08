
package tema4.tema4Ej02;

public class Entrenador extends Empleado {
    private int campeonatosGanados;

    // constructor
    public Entrenador(int campeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setCampeonatosGanados(campeonatosGanados);
    }

    
    // getters y setters
    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    
    // metodos adicionales
    
    /* La efectividad
        del entrenador es el promedio de campeonatos ganados por año de antigüedad */
    @Override
    public double calcularEfectividad(){
        return this.getCampeonatosGanados() / this.getAntiguedad();  
    }
    
    @Override
    public double calcularSueldoACobrar(){
        double total;
        if(this.getCampeonatosGanados() >= 1 && this.getCampeonatosGanados() <= 4){
            total = super.calcularSueldoACobrar() + 5000;
        } else {
            if(this.getCampeonatosGanados() >= 5 && this.getCampeonatosGanados() <= 10){
                total = super.calcularSueldoACobrar() + 30000;
            } else {
                if(this.getCampeonatosGanados() > 10){
                    total = super.calcularSueldoACobrar() + 50000;
                } else {
                    total = super.calcularSueldoACobrar();
                }
            }
        }
        return total;
    }
}
