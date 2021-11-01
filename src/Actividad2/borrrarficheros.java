package Actividad2;

import java.io.File;

public class borrrarficheros {

	public static void main(String[] args) {
		
		File carpeta = new File("C:\\TMP\\DAM2\\AccesoDAtos\\Ficheros\\00-tmp");
		
		funciones(carpeta);
	}

	public static void funciones(File patata) {
		
		if(patata.exists()) {
			if(patata.isFile()) {
				patata.delete();
			}else {
				File[] arrayfiles = patata.listFiles();
				
				for (int i=0; i<arrayfiles.length;i++) {
					funciones(arrayfiles[i]);
				}
				
				patata.delete();
			}
		}
	}
}
