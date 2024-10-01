/*
4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de
casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.
 */
package tema2;


import PaqueteLectura.Lector;

public class Ej04 {
    public static void main(String[] args) {
// definicion de variables
        int diasTotales = 3,
                turnosTotales = 3,
                diaElegido = 0,
                turno = 0,
                i,
                j,
                cupoTotal = 4,
                cupoParcial = 0;
        
        int [] vectorContador = new int[diasTotales];
        Persona [][] matrizTurnos = new Persona[diasTotales][turnosTotales];
        Persona persona;
        
  
        
        
        // carga matriz
        while(cupoParcial < cupoTotal){
            // lectura de datos
            persona = new Persona(); // instanciación
            System.out.print("Nombre: ");
            persona.setNombre(Lector.leerString());
            if(!persona.getNombre().equals("ZZZ")){
                System.out.print("DNI: ");
                persona.setDNI(Lector.leerInt());
                System.out.print("Edad: ");
                persona.setEdad(Lector.leerInt());
                System.out.println("Dia en que queres ser inscripto: ");
                diaElegido = Lector.leerInt();
            }
            
            turno = 0; //reinicio de turno por cada persona
            
            while(matrizTurnos[diaElegido-1][turno] != null && turno <= turnosTotales) {
                turno++;
            }
            
            if(turno < turnosTotales) {
                matrizTurnos[diaElegido-1][turno] = persona;
                cupoParcial++;
                System.out.println("valor de turno: " +turno);
            } else {
                System.out.println("DIA LLENO");
            }                    
        }
  
        
        //inicializar vector contador en 0
        for (i = 0; i<diasTotales; i++) {
            vectorContador[i] = 0;
        }
                
                
        //cargar vector contador con cantidades   
        for(i = 0; i < diasTotales; i++){
            for (j = 0; j < turnosTotales; j++) {
                if(matrizTurnos[i][j] != null) 
                    vectorContador[i]++;
            }
        }
        
        //informar cantidad de inscriptos por dia
        for (i = 0; i < diasTotales; i++) {
            System.out.println("Cantidad de inscriptos en el dia "+(i+1)+": " + vectorContador[i]);
            //nombre de cada persona en turno asignado
            for (j= 0; j < turnosTotales; j++) {
                if(matrizTurnos[i][j] != null){
                    System.out.println("Turno numero "+(j+1)+": "+matrizTurnos[i][j].getNombre());
                }
            }
        }
        
        
        

    }
    
}
