package frasemorse;

/**
 *
 * @author noefdo.solismay
 */
import java.util.Scanner;
public class Fmorse {
    public void traducirAMorse(){
        
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        System.out.println("Introduzca la frase a convertir en código Morse");
        mensaje=teclado.nextLine();
        //System.out.println(mensaje);
	String letras = "abcdefghijklmnopqrstuvwxyz0123456789";
	mensaje = mensaje.toLowerCase();
	String codigo[] = new String[60];
	String blanco = " ";
	String morse = " ";
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
	for  (int i = 0; i < mensaje.length() ; i++){ 
        	if (mensaje.charAt(i)==' ') morse = morse+blanco+' ';
		else {
                    for  (int j = 0; j < letras.length() ; j++) {
			if (mensaje.charAt(i) == letras.charAt(j))
                            morse = morse + codigo[j]+' ';	// Poner el if si no hay letras
                    }
		}
        }
        morse = morse.substring(1,morse.length());
        System.out.println(morse.toUpperCase()+"\n");
    }  
  }
