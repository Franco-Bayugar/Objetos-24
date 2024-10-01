/*
3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.
*/
package tema2;

import PaqueteLectura.Lector;

public class Ej03 {

    public static void main(String[] args) {
        // definicion de variables
        int diasTotales = 2,
                turnosTotales = 2,
                dia = 0,
                turno = 0,
                i,
                j,
                cupoTotal = 4,
                cupoParcial = 0;
        
        
        Persona [][] matrizTurnos = new Persona[diasTotales][turnosTotales];
        
        
        // lectura de datos
        Persona persona; // referencia al blueprint
        persona = new Persona(); // instanciación
        System.out.print("Nombre: ");
        persona.setNombre(Lector.leerString());
        if(!persona.getNombre().equals("ZZZ")){
            System.out.print("DNI: ");
            persona.setDNI(Lector.leerInt());
            System.out.print("Edad: ");
            persona.setEdad(Lector.leerInt());
        }
        
        
        // carga matriz
        while(dia < diasTotales){
            while(!persona.getNombre().equals("ZZZ") && turno < turnosTotales){
                matrizTurnos[dia][turno] = persona;
                System.out.println("Turno agregado en el dia "+(dia+1)+ " en turno "+(turno+1) +"\n");
                System.out.println("----");
                turno++;
                cupoParcial++;
                
                if(cupoParcial != cupoTotal){
                    persona = new Persona();
                    System.out.print("Nombre: ");
                    persona.setNombre(Lector.leerString());
                    if(!persona.getNombre().equals("ZZZ")){
                        System.out.print("DNI: ");
                        persona.setDNI(Lector.leerInt());
                        System.out.print("Edad: ");
                        persona.setEdad(Lector.leerInt());
                    }
                }
                
                }
                dia++;
                turno = 0;
            }
            
  

        for(i = 0; i < diasTotales; i++){
            for (j = 0; j < turnosTotales; j++) {
                if(matrizTurnos[i][j] != null) 
                    System.out.println("DIA "+(i+1)+" TURNO "+(j+1)+": "+ matrizTurnos[i][j].toString());
            }
        }
    } 
}
