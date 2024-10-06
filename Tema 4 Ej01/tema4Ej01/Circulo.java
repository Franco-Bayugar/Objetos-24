package tema4.tema4Ej01;

public class Circulo extends Figura{
    private double Radio;

    
    // Constructor
    public Circulo(double Radio, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        setRadio(Radio);
    }
    
    // Getters y Setters

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    // metodos adicionales
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(Radio, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    // toString

    @Override
    public String toString() {
        return "\n Valor del Radio: " + this.getRadio() + super.toString();
    }
    
    
    
    
    
    
    
    
    
}
