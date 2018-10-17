
package frasemorse;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author noefdo.solismay
 */
public class FraseMorse {

    
    public static void main(String[] args) {
        Fmorse fmorse=new Fmorse();
        Mfrase mfrase=new Mfrase();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("           ==== OPCIONES ====           ");
            System.out.println("1. Convierte del Alfabeto a Clave Morse");
            System.out.println("2. Convierte de Clave Morse a Alfabeto");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado convertir de Alfabeto a Clave Morse");
                        fmorse.traducirAMorse();
                        break;
                    case 2:
                        System.out.println("Has seleccionado convertir de Clave Morse a Alfabeto");
                        mfrase.traducirFrase();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número [1..3] ");
                sn.next();
            }
        }
        
        
        
        
    }
    
}
