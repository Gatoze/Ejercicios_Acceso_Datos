package Actividad2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


public class actividad2main {

	public static void main(String[] args) {
	

		Properties claves = new Properties();
		InputStream stream = null;
		
		Path nuevoarchivo;
		
		try {
			stream= new FileInputStream("C:\\Users\\Santi\\eclipse-workspace\\Ejercicios_Acceso_Datos\\src\\Actividad2\\actividad.properties");
			claves.load(stream);
			nuevoarchivo = Paths.get(claves.getProperty("ruta1"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta2"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta3"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta4"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta5"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta6"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta7"));
			Files.createDirectories(nuevoarchivo);
			nuevoarchivo = Paths.get(claves.getProperty("ruta8"));
			Files.createDirectories(nuevoarchivo);	
			
		}catch (Exception e) {
			System.out.println("No func");
		}
	}

}
