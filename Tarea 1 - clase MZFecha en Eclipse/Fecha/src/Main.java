import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		int dia = 0;
		int mes = 0;
		int anyo = 0;
		int diferencia = 0;
		
		MZFecha f = new MZFecha(1, 1, 2012);
		MZFecha f1 = new MZFecha(1, 1, 2015);
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Elije una opci�n:");
		System.out.println("0: Salir");
		System.out.println("1: Establecer fecha");
		System.out.println("2: imprimir fecha");
		System.out.println("3: Diferencia entre 2 fechas");
		
		while (!sc.hasNextInt()) {
			System.out.println("Por favor ejije una opcion valida");
			sc.nextLine();
		}
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 0:
			System.out.println("Hasta la proxima");
			break;
		case 1:
			
			System.out.println("Nuevo dia: ");
			while (!sc.hasNextInt()) {
				System.out.println("Por favor introduce un n�mero");
			}
			dia = sc.nextInt();
			
			System.out.println("Nuevo mes: ");
			while (!sc.hasNextInt()) {
				System.out.println("Por favor introduce un n�mero");
			}
			mes = sc.nextInt();
			
			System.out.println("Nuevo a�o: ");
			while (!sc.hasNextInt()) {
				System.out.println("Por favor introduce un n�mero");
			}
			anyo = sc.nextInt();
			
			f.setFecha(dia, mes, anyo);
			break;
		case 2:
			f.imprime();
			break;
		case 3:
			diferencia = f.diferenciaDias(f1);
			System.out.println(diferencia);
			break;
		default:
			System.out.println("Esa no es una opci�n");
			break;
		}
		if (opcion != 0) {
		System.out.println("Pulsa intro para volver al men�");
		sc.nextLine();
		sc.nextLine();
		}
	}
		while (opcion != 0);
	}

}
