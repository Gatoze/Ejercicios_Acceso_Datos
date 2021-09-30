package Prueba_leer_Fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prueba_Leer_Fichero {

	public static void main(String[] args) {
		
		Prueba_Leer_Fichero patata=new Prueba_Leer_Fichero();
		
		String patato;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe la ruta");
		
		patato=patata.ConString(sc.next());
	
	}
	
	public String ConString(String direct) {
		BufferedReader leer=null;
		String lineaactual="";
		String katch="Nanai";
		String devol="";
		try {
			
			leer = new BufferedReader(new FileReader(direct));
			
			while ((lineaactual = leer.readLine()) != null) {
				devol+=lineaactual; 			}
		}
			catch (IOException e) {

				   e.printStackTrace();
				   return katch;

		}finally {

			   try {
			    if (lineaactual != null)
			     leer.close();
			   } catch (IOException ex) {
			    ex.printStackTrace();
			   }
		}
		return devol;

	}
}

//BufferedReader leer=null;
//String lineaactual="";
//try {
//	
//	leer = new BufferedReader(new FileReader("C:/xampp/htdocs/aadd/recursos/infoinstitutodam2.json"));
//	
//	while ((lineaactual = leer.readLine()) != null) {
//	    System.out.println(lineaactual);
//	}
//}
//	catch (IOException e) {
//
//		   e.printStackTrace();
//
//}finally {
//
//	   try {
//	    if (lineaactual != null)
//	     leer.close();
//	   } catch (IOException ex) {
//	    ex.printStackTrace();
//	   }
//}