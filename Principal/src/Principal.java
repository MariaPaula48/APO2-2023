import java.util.Scanner;

//nombre del programa

public class Principal {
	
	//metodo principal
	public static void main(String[] args) {

		
		
		System.out.println("ingrese la palabra: ");
		//Clase que permite capturar datos por consola
		Scanner sc = new Scanner(System.in);
		
		String prueba = sc.next();
		System.out.println("la cantidad de letras que tiene la palabra es: "+ prueba.length());
	}
}
