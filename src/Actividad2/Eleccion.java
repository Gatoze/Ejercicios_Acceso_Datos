package Actividad2;
import java.util.Scanner;
public class Eleccion {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int decision = sc.nextInt();
	        switch(decision) {
	        case 1:
	            actividad2main.main(args);
	        case 2:
	            Actividad2_1.main(args);
	        case 3:
	           actividad2_2.main(args);
	        default:
	            System.out.println("Numero no valido");
	    }
}
