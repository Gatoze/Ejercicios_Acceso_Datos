package Prueba_Escribir_Fichero;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir_En_Lo_Escrito {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			File ficherito=new File("C:/Users/Santi/eclipse-workspace/Ejercicios_Acceso_Datos/src/Prueba_Escribir_Fichero/fichero.txt");
			if(!ficherito.exists()) {
				ficherito.createNewFile();
			}
			System.out.println("Que quieres escribir");
			String nuevo=sc.next();
			FileWriter escribidor =  new FileWriter(ficherito.getName(), true);
			BufferedWriter bw = new BufferedWriter(escribidor);
			
			bw.append(nuevo);
			bw.newLine();			
			bw.close();
			System.out.println("Hecho");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}