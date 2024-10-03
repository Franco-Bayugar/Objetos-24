/*
4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/ 2000
y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
B- Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.
NOTAS: Reúse la clase Persona. Para cada método solicitado piense a qué clase debe
delegar la responsabilidad de la operación.
 */
package tema3Ej04;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej04 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar(); // SE INICIA ACA O EN HABITACION?
        int N, edad, dni, habitacionDeseada;
        String nombre;
        Hotel unHotel;
        Cliente unCliente;
        
        
        System.out.println("Hotel de cuantas habitaciones: ");
        N = Lector.leerInt();

        unHotel = new Hotel(N);
        
        System.out.println("Carga de Cliente");
        System.out.print("Nombre:");
        nombre = Lector.leerString();
        System.out.print("Edad:");
        edad = Lector.leerInt();
        System.out.print("DNI:");
        dni = Lector.leerInt();
        System.out.println("Habitacion deseada: ");
        habitacionDeseada = Lector.leerInt();
        unCliente = new Cliente(nombre, dni, edad); //????????? esta bien? no me lo pide el enunciado, solo dice instanciar hotel

        unHotel.cargarVectorHabitaciones(unCliente, (habitacionDeseada-1)); //correccion

            
        
        System.out.println(unHotel.toString());
        
        
        System.out.println();
        unHotel.aumentarPrecio(1000);
        System.out.println();
        
        System.out.println(unHotel.toString());

        // ARREGLADO DIML !!!!!!!!!!!!!! NO SE SI ES DIML, PORQUE ELIGE EN DISTINTAS POSICIONES
        // CHEQUEAR BIEN PASO POR PASO, ANOTAR Y PREGUNTAR DUDAS!!!!
    }
    
}
