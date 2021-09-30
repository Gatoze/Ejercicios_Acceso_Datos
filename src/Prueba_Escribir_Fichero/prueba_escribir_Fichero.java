package Prueba_Escribir_Fichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class prueba_escribir_Fichero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			File fichero=new File("C:/Users/Santi/eclipse-workspace/Ejercicios_Acceso_Datos/src/Prueba_Escribir_Fichero/fichero.txt");
			
			if (fichero.createNewFile()) {
		        System.out.println("Fichero creado: " + fichero.getName());
		      } else {
		        System.out.println("Ya existia");
		      }
		
		}catch (Exception e) {
				System.out.println("Salio mal");
				e.printStackTrace();
		}
		try {
		      FileWriter picaletra = new FileWriter("C:/Users/santi/eclipse-workspace/Ejercicio_Acceso_Datos/src/Prueba_Escribir_Fichero/fichero.txt");
		      
		      for(int i=0; i<3; i++) {
		    	  System.out.println("Escribe");
					picaletra.write(sc.next());  
		      }
				System.out.println("Escribe");
				picaletra.write(sc.next());
			    
			
				picaletra.close();
				System.out.println("Escrito");
		    } catch (IOException e) {
		    	System.out.println(" error.");
		    	e.printStackTrace();
		    }
		
	}

}