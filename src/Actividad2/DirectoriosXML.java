package Actividad2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DirectoriosXML {
	

	public static void main(String[] args) {
		
		String enfado;
		
		File archiv = new File("C:\\Users\\Santi\\eclipse-workspace\\Ejercicios_Acceso_Datos\\src\\Actividad2\\actividad.xml");
		
		try {
			DocumentBuilderFactory configur = DocumentBuilderFactory.newInstance();
			DocumentBuilder constructor = configur.newDocumentBuilder();
			Document doc = constructor.parse(archiv);
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("rutas");
			
			for(int temp = 0; temp < nList.getLength(); temp++) {
				  Node nNode = nList.item(temp);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    org.w3c.dom.Element eElement = (Element) nNode;
				    
				   
				    Path archivos = Paths.get(eElement.getAttribute("ruta1"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta2"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta3"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta4"));
				    Files.createDirectories(archivos);
				     archivos = Paths.get(eElement.getAttribute("ruta5"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta6"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta7"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(eElement.getAttribute("ruta8"));
				    Files.createDirectories(archivos);
				    
				    
				    
				  }
				  
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
