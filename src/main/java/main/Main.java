package main;

import java.util.Scanner;

import prima.Prima;

/**
 * Clase principal del programa
 * @author RODRIGUEZ
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner leer;
		leer = new Scanner(System.in);
		String salir = "si";
		Prima prima = new Prima();
		do{
			String edad_t;
			int edad_int;
			System.out.print("Ingrese la edad: ");
			edad_t = leer.next();
			try {
				edad_int = Integer.parseInt(edad_t);
				if(edad_int>=18 && edad_int<=90) {
					String puntos_t;
					int puntos_lic;
					System.out.print("Ingrese los puntos de licencia: ");
					puntos_t = leer.next();
					try {
						puntos_lic = Integer.parseInt(puntos_t);
						if(puntos_lic>=1 && puntos_lic<=30) {
							double prima_t = prima.calcular_prima(edad_int, puntos_lic);
							System.out.println("PRIMA: "+prima_t+"\n");
						}else{
							System.out.println("No se puede asegurar el carro\n");
						}
					}catch (NumberFormatException e) {
						System.out.println("Licencia invalida\n");
					}
				}else {
					System.out.println("No se puede asegurar el carro\n");
				}
			}catch(NumberFormatException e) {
				 System.out.println("Edad invalida\n");
			}
			System.out.print("¿Desea hacer más pruebas? si o no: ");
			salir = leer.next();
		}while(!salir.equals("no"));
		leer.close();
		System.out.println("Cambio para probar jenkins");
	}

}
