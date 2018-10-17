
package frasemorse;

/**
 *
 * @author noefdo.solismay
 */
import java.util.Scanner;
public class Mfrase {
    public void  traducirFrase(){
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        System.out.println("Introduzca el código Morse a convertir en Frasec:");
        mensaje=teclado.nextLine();
        String letras = "abcdefghijklmnopqrstuvwxyz0123456789 ";
        String codigo[] = new String[60];
        String morse = "";
	codigo[0] = ".-"; 		//a
	codigo[1] = "-...";		//b
	codigo[2] = "-.-.";		//c
	codigo[3] = "-..";		//d
	codigo[4] = ".";		//e
	codigo[5] = "..-.";		//f
	codigo[6] = "--.";		//g
	codigo[7] = "....";		//h
	codigo[8] = "..";		//i
	codigo[9] = ".---";		//j
	codigo[10] = "-.-";		//k
	codigo[11] = ".-..";            //l
	codigo[12] = "--";		//m
	codigo[13] = "-.";		//n
	codigo[14] = "---";		//o
	codigo[15] = ".--.";            //p
	codigo[16] = "--.-";            //q
	codigo[17] = ".-.";		//r
	codigo[18] = "...";		//s
	codigo[19] = "-";		//t
	codigo[20] = "..-";		//u
	codigo[21] = "...-";            //v
	codigo[22] = ".--";		//w
	codigo[23] = "-..-";            //x
	codigo[24] = "-.--";            //y
	codigo[25] = "--..";            //z
	codigo[26] = "-----";           //0
	codigo[27] = ".----";           //1
	codigo[28] = "..---";           //2
	codigo[29] = "...--";           //3
	codigo[30] = "....-";           //4
	codigo[31] = ".....";           //5
	codigo[32] = "-....";           //6
	codigo[33] = "--...";           //7
	codigo[34] = "---..";           //8
	codigo[35] = "----.";           //9
        codigo[36] = "";               // blanco
        String oracion[] = mensaje.split(" ");
        int max = oracion.length;
        int b=0;
        for  (int i = 0; i < max; i++){
           	for (int j = 0; j < 60; j++){
                    if (oracion[i].equals(codigo[j])) {         //Localiza el código Morse
                        if (j!=36){                             // Valida que no sea blanco
                            morse = morse+letras.charAt(j);     // Forma palabra
                        }else{                                  //Elimina los blancos de más
                            b++;
                            if (b==2){
                                morse=morse+" ";
                                b=0;
                            }
                           }
                        break;
                    }
                   
                }
        }
        System.out.println(morse.toUpperCase()+"\n");          //Imprime código Morse 
	}

}

    

