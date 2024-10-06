package tema4.tema4Ej01;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // constructor
    public Rectangulo(double base, double altura, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.setBase(base);
        this.setAltura(altura);
    }

    
    // getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    // metodos adicinales
    @Override
    public double calcularArea(){
        return this.getAltura() * this.getBase();
    }
    
    @Override
    public double calcularPerimetro(){
        return (this.base * this.altura) * 2;
    }
    
    
    // to string

    @Override
    public String toString() {
        return "\n Base: " + this.getBase() +
               "\n Altura: " + this.getAltura() + 
                super.toString();
    }
    
}
