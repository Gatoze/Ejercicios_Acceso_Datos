package Actividad2;

import java.io.File;

public class Actividad2_1 {
	
	 public static void main(String[] args) {
	
	File ruta = new File("C:\\TMP\\DAM2\\AccesoDAtos\\Ficheros\\00-tmp");
	File fichero;
	File[] arraydeficheros=ruta.listFiles();
	
	for (int i=0;i<arraydeficheros.length;i++) {
		
		fichero=new File (arraydeficheros[i]+"\\info_temporal.txt");
		try {
			fichero.createNewFile();
		}catch (Exception e) {
			System.out.println("No va");
		}
	}
	
}
}

