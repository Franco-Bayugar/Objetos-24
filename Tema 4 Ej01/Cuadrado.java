package tema4.tema4Ej01;

public class Cuadrado extends Figura {
    private double lado1;
    
    
    // Constructor
    public Cuadrado(int lado1, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.setLado1(lado1);
    }

    // getters y setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    
    // metodos adicionales
    
    @Override
    public double calcularArea(){
        return this.getLado1() * this.getLado1();
    };
    
    @Override
    public double calcularPerimetro(){
        return this.getLado1() * 4;
    }
    
    //to String

    @Override
    public String toString() {
        return "\n Valor del lado: "+ this.getLado1() + super.toString();
    }
    
    
}
