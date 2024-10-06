
package tema4.tema4Ej01;


public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;

    // constructor
    public Figura(String colorRelleno, String colorLinea) {
        setColorRelleno(colorRelleno);
        setColorLinea(colorLinea);
    }
    
    // getters y setters
    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    // metodos adicinales
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
    public void Despintar(){
        this.setColorLinea("Negro");
        this.setColorRelleno("Blanco");
    }
    
    //toString

    @Override
    public String toString() {
        return "\n Color de Relleno: " + this.getColorRelleno() +
               "\n Color Linea: " + this.getColorLinea() +
               "\n Area: " + this.calcularArea() +
               "\n Perimetro: " + this.calcularPerimetro(); // Esto lo pongo aca porque sino
               // estaria repitiendo ese codigo en todas las figuras
    }
    
    
    
    
}
