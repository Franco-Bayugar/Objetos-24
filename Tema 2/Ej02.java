/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ej02 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dimf = 15,
            i= 0,
            contadorMayores = 0, 
            posicionDniMenorActual = 0,
            dniMenorActual = 99999;
        
        
        Persona [] vectorPersonas = new Persona[dimf];
        
        Persona humano; // me traigo el print persona alocado en la variable humano
        
        humano = new Persona(GeneradorAleatorio.generarString(5), //nombre 
                                     GeneradorAleatorio.generarInt(99999), //dni
                                     GeneradorAleatorio.generarInt(100)); //edad 
        
        while(humano.getEdad() != 0 && i < dimf) {
            vectorPersonas[i] = humano;
            
            if(humano.getEdad() > 65)
                contadorMayores++;
            
            if(humano.getDNI() < dniMenorActual){
                posicionDniMenorActual = i;
                dniMenorActual = humano.getDNI();
            }
                
            
            humano = new Persona (GeneradorAleatorio.generarString(5), //nombre 
                                  GeneradorAleatorio.generarInt(99999), //dni
                                  GeneradorAleatorio.generarInt(100)); //edad 

            i++;
        }
        
        
        for (int j = 0; j < dimf; j++) {
            System.out.println(vectorPersonas[j].toString());
            System.out.println("---");
        }
        
        System.out.println("===============");
        System.out.println("Mayores de 65: " + contadorMayores);
        System.out.println("Persona con el menor DNI: \n"  + vectorPersonas[posicionDniMenorActual].toString());
        
        
        
    }
    
}
