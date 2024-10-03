
package tema3.tema3Ej05;
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;

    // Constructor que recibe todos los datos necesarios para crear el objeto
    public Circulo(double radio, String colorRelleno, String colorLinea) {
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }
    
    // Enunciado pide sets y gets para modificar TODAS las variables de instancia

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

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
    
    
    // metodos
    
    public double calcularPerimetro(){
        double perimetro = (2 * this.radio * Math.PI);
        return perimetro;
    }
    
    public double calcularArea(){
        double area = (Math.PI * Math.pow(this.radio, 2));
        return area;
    }
}
