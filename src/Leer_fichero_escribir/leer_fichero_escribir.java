package Leer_fichero_escribir;

import java.io.*;
import java.util.Scanner;

public class leer_fichero_escribir {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nuevo;
		try (BufferedReader buffr=new BufferedReader(new FileReader("C:/xampp/htdocs/aadd/recursos/alumnos-dam2-nuevos.txt"))){
			BufferedWriter buffw=new BufferedWriter(new FileWriter("InfoAlumnos.txt", true));
			BufferedReader buffre=new BufferedReader(new FileReader("InfoAlumnos.txt"));
			
			
			String primeralinea=buffre.readLine();
			String resto=buffr.readLine();
			if(primeralinea != null) {
				resto=buffr.readLine();
			}
			while(resto!=null) {
				buffw.write(resto.substring(4, resto.length()));
				buffw.newLine();
				resto=buffr.readLine();
			}
			buffw.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}