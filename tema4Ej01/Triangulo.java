package tema4.tema4Ej01;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    
    //constructor
    public Triangulo(double lado1, double lado2, double lado3, String colorRelleno, String colorLinea) {
        super(colorRelleno, colorLinea);
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }
    
    
    //getters y setters
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // metodos adicinales
    @Override
    public double calcularArea(){
        double semiperimetro = (this.calcularPerimetro() / 2);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }
    
    
    @Override
    public double calcularPerimetro(){
        return this.getLado1() + this.getLado2() + this.getLado3();
    }
    
    
    // to string

    @Override
    public String toString() {
        return "\n Lado 1: " + this.getLado1() + 
                "\n Lado 2: " + this.getLado2() + 
                "\n Lado 3: " + this.getLado3() + 
                super.toString();
     }
    
    
    
}
