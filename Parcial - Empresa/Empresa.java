package Parcial1;


public class Empresa {
    private String nombre;
    private String direccion;
    private DirectorEjecutivo unDirector;
    private Encargado unEncargado;
    private Encargado [] vectorSucursales;
    private int N;

    public Empresa(String nombre, String direccion, DirectorEjecutivo unDirector, int N) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setUnDirector(unDirector);
        this.setN(N);
        
        // SI HAY UN VECTOR O MATRIZ, INSTANCIARLA!!!!!!
        this.vectorSucursales = new Encargado[N];
        
        // Iniciar sucursales sin ningun encargado; ingreso no-secuencial
        for(int i = 0; i < this.getN(); i++){
            this.vectorSucursales[i] = null;
        }
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DirectorEjecutivo getUnDirector() {
        return unDirector;
    }

    public void setUnDirector(DirectorEjecutivo unDirector) {
        this.unDirector = unDirector;
    }

    public Encargado[] getVectorSucursales() {
        return vectorSucursales;
    }

    // metodos

    private void setUnEncargadoEnPosicion(Encargado unEncargado, int pos){
        this.vectorSucursales[pos] = unEncargado;
    }
    
    public void agregarEncargadoASucursal(Encargado encargado, int pos){
        if(this.getVectorSucursales()[pos] == null){
            this.setUnEncargadoEnPosicion(encargado, pos);
        }
    }
    
    private String toStringSucursales(){
        String aux = "";
            for (int i = 0; i < this.getN(); i++) {
                if(this.getVectorSucursales()[i] != null) {
                    aux += "\n Sucursal" + (i+1) + this.getVectorSucursales()[i].toString();
                } else {
                    aux += "\n Sucursal" + (i+1) + " sin encargado";
                }
            }
        return aux;
    }
    //to String

    @Override
    public String toString() {        
        return "\n Empresa: " +
                "\n Nombre empresa:" + this.getNombre() +
                "\n Direccion: " + this.getDireccion() +
                "\n " + this.getUnDirector() + 
                "\n" + this.toStringSucursales();
    }
    
}
