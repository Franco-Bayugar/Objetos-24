/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). 

Un objeto partido sabe responder a los siguientes mensajes:

getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” X
setVisitante(X) modifica el nombre del equipo visitante al “String” X
setGolesLocal(X) modifica la cantidad de goles del equipo local al “int” X
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante al “int” X
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna
un String vacío).
hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate

Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:

- PPara cada partido, armar e informar una representación String del estilo:
{EQEUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Ccalcular e informar la cantidad de partidos que ganó River.
- Ccalcular e informar el total de goles que realizó Boca jugando de local
 */
package tema2;

import PaqueteLectura.Lector;
public class Ej05 {
    public static void main(String[] args) {
        int dimf = 3,
            diml = 0,
            partidosGanadosRiver = 0,
            golesBocaLocal = 0;
        
        
        Partido [] vectorPartidos = new Partido[dimf];
        Partido unPartido;
        
        // Lectura de primer partido
        unPartido = new Partido();
        System.out.println("Partido numero " +(diml+1));
        System.out.print("Equipo Local: ");
        unPartido.setLocal(Lector.leerString());
        System.out.print("Equipo Visitante: ");
        unPartido.setVisitante(Lector.leerString());
        if(!unPartido.getVisitante().equals("ZZZ")){
            System.out.print("Goles Local: ");
            unPartido.setGolesLocal(Lector.leerInt());
            System.out.print("Goles Visitante: ");
            unPartido.setGolesVisitante(Lector.leerInt());
            System.out.println("------------------");
        }
        
        while(!unPartido.getVisitante().equals("ZZZ") && diml < dimf){
            // Carga de vector
            vectorPartidos[diml] = unPartido;
            diml++;
            
            
            // Lectura de nuevo partido
            if(diml < dimf){ //chequeo interno para no leer uno mas al finalizar la carga
                unPartido = new Partido();
                System.out.println("Partido numero " + (diml+1));
                System.out.print("Equipo Local: ");
                unPartido.setLocal(Lector.leerString());
                System.out.print("Equipo Visitante: ");
                unPartido.setVisitante(Lector.leerString());
                if(!unPartido.getVisitante().equals("ZZZ")){
                    System.out.print("Goles Local: ");
                    unPartido.setGolesLocal(Lector.leerInt());
                    System.out.print("Goles Visitante: ");
                    unPartido.setGolesVisitante(Lector.leerInt());
                    System.out.println("------------------");
                }
            }
        }
        
        for (int i = 0; i < diml; i++) {
            
            //{EQEUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
            System.out.println("{"+ vectorPartidos[i].getLocal().toUpperCase() +" "+
                                    vectorPartidos[i].getGolesLocal() +" VS "+
                                    vectorPartidos[i].getVisitante().toUpperCase() +" "+
                                    vectorPartidos[i].getGolesVisitante()+"}"
                                 );
            
            // Cantidad de partidos que gano river
            if(vectorPartidos[i].hayGanador()){
                if(vectorPartidos[i].getGanador().equals("River")){
                    partidosGanadosRiver++;
                }
            }
            
            // Cantidad de goles de boca de local
            if(vectorPartidos[i].getLocal().equals("Boca")){
                golesBocaLocal += vectorPartidos[i].getGolesLocal();
            }
        }
        
        System.out.println("Cantidad de partidos que gano River: " + partidosGanadosRiver);
        System.out.println("Cantidad de goles de Boca siendo local: " + golesBocaLocal);
        
    }
    
}
