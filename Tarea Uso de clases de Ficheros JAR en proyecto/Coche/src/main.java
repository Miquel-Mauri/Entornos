import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int opcion = 0;
		int velocidad = 0;
		String nuevo ="";
		
		Coche c = new Coche("Fiat", "Panda", "Amarillo");
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Elige una opción:");
		System.out.println("0: Salir");
		System.out.println("1: Imprimir datos del coche");
		System.out.println("2: Dibujar coche");
		System.out.println("3: Establecer Marca");
		System.out.println("4: Establecer Modelo");
		System.out.println("5: Establecer color");
		System.out.println("6: Acelerar");
		System.out.println("7: Frenar");
		System.out.println("8: Parar");
		
		while(!sc.hasNextInt()) {
			System.out.println("Por favor, introduce un número");
			sc.nextLine();
		}
		opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
		case 0:
			System.out.println("Hasta la proxima :)");
			break;
		case 1:
			c.imprime();
			break;
		case 2:
			c.pinta();
			break;
		case 3:
			System.out.println("Introduce la nueva marca");
			nuevo = sc.nextLine();
			c.setMarca(nuevo);
			break;
		case 4:
			System.out.println("Introduce el nueva Modelo");
			nuevo = sc.nextLine();
			c.setModelo(nuevo);
			break;
		case 5:
			System.out.println("Introduce el nueva color");
			nuevo = sc.nextLine();
			c.setColor(nuevo);
			break;
		case 6:
			System.out.println("Cuanto vas a acelerar?");
			while(!sc.hasNextInt()) {
				System.out.println("Por favor, inserta un valor númerico");
				sc.nextLine();
			}
			velocidad = sc.nextInt();
			c.acelera(velocidad);
			break;
		case 7:
			System.out.println("Cuanto vas a frenar?");
			while(!sc.hasNextInt()) {
				System.out.println("Por favor, inserta un valor númerico");
				sc.nextLine();
			}
			velocidad = sc.nextInt();
			c.frena(velocidad);
			break;
		case 8:
			System.out.println("El coche se ha parado");
			c.para();
			break;
			default:
				System.out.println("Esa no es una opción");
		}
		if(opcion != 0) {
			System.out.println("Pulsa intro para volver al menú");
			sc.nextLine();
			
		}
		}while (opcion != 0);
	}

}
