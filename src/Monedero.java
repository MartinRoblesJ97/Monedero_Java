/*Defina una clase Monedero que permita gestionar la cantidad de dinero que una persona dispone en un momento dado. La clase deberá tener un constructor 
que permitirá crear un monedero con una cantidad de dinero inicial y deberá definir un método para meter dinero en el monedero, otro para sacarlo y 
finalmente, otro para consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero a través de este último método. 
Por supuesto, no se podrá sacar más dinero del que haya en un momento dado en el monedero*/

import java.util.Scanner;

public class Monedero {

	// SCANNER
	Scanner dato = new Scanner(System.in);

	// ATRIBUTOS
	public String nombre;
	public String apellido;
	public double dineroDisponible;
	public double nuevoBalance = 0;

	// CONSTRUCTOR
	public Monedero(String nombre, String apellido, double dineroDisponible) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dineroDisponible = dineroDisponible;
	}

	// METODO
	public void menuSystem() {

		int opciones;

		do {
			System.out.println("Elige una opción:");
			System.out.println("1.- Depositar");
			System.out.println("2.- Retirar");
			System.out.println("3.- Balance");
			System.out.println("4.- Salir");
			opciones = dato.nextInt();
			if (opciones == 1) {
				sumar();
			}else if (opciones == 2) {
				restar();
			} else if (opciones == 3) {
				verificarBalance();
			} else if (opciones == 4) {
				salir();
			}
			else 
			{System.out.println("Opción no válida" + "\n");}
			
		} while (opciones!=4);

	}
	
	public void sumar() {
		double dinero = this.dineroDisponible;
		System.out.println("El dinero que quieres depositar:");
		double dineroIngresado = dato.nextDouble();
		double nuevoBalance = dinero + dineroIngresado;
		System.out.println("\n");
	}

	public void restar() {
		double dinero = this.dineroDisponible;
		System.out.println("El dinero que quieres retirar:");
		double dineroTomado = dato.nextDouble();
		if (dineroTomado <= dinero) {
			double nuevoBalance = dinero - dineroTomado;
			System.out.println("\n");
		} else if (dineroTomado > dinero) {
			System.out.println("No puedes retitar esa cantidad de dinero, es mayor a tus fondos" + "\n");
		}
	}

	public void verificarBalance() {
		if (nuevoBalance==0) {
			System.out.println("Tu dinero disponible es: " + this.dineroDisponible + "\n");			
		} else if (nuevoBalance!=0) {
			System.out.println("Tu dinero disponible es: " + nuevoBalance + "\n");
		}
				
	}
	
	public void salir() {
		System.out.println("Hasta pronto :)");
	}

	@Override
	public String toString() {
		return "Monedero [dato=" + dato + ", nombre=" + nombre + ", apellido=" + apellido + ", dineroDisponible=" + dineroDisponible
				+ "]";
	}

}// class