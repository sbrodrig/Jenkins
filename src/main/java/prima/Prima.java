package prima;

/**
 * Clase en la cual están creadas las funciones necesarias para calcular el valor prima
 * @author RODRIGUEZ
 *
 */
public class Prima {
	
	/**
	 * Funcion para determinar el factor dependiendo de la edad
	 * @param edad Es un entero
	 * @return El factor por el que se multiplicará el valor base
	 */
	double calcular_factor_edad(int edad) {
		if(edad<25) {
			return 2.8;
		}else if(edad>=25 && edad<35) {
			return 1.8;
		}else if(edad>=35 && edad<45) {
			return 1.0;
		}else if(edad>=45 && edad<65) {
			return 0.8;
		}else {
			return 1.5;
		}
	}
	
	/**
	 * Funcion para determinar el descuento dependiendo de los puntos de licencia
	 * @param edad Es un entero
	 * @param puntos Es un entero
	 * @return El descuento para el valor prima
	 */
	double calcular_reduccion_conductor_seguro(int edad, int puntos) {
		if(edad<25 && puntos>=29) {
			return 50;
		}else if(edad>=25 && edad<35 && puntos>=27) {
			return 50;
		}else if(edad>=35 && edad<45 && puntos>=25) {
			return 100;
		}else if(edad>=45 && edad<65 && puntos>=23) {
			return 150;
		}else if(edad>=65 && puntos>=25) {
			return 200;
		}else {
			return 0;
		}
	}
	
	/**
	 * Función para calcular el valor prima a pagar
	 * @param edad Es un entero 
	 * @param puntos Es un entero 
	 * @return El valor prima a pagar con los respectivos descuentos aplicados
	 */
	public double calcular_prima(int edad, int puntos) {
		if(edad>=18 && edad<=90) {
			if(puntos>=1 && puntos<=30) {
				int tarifa_basica = 500;
				double factor_edad = calcular_factor_edad(edad);
				double reduccion = calcular_reduccion_conductor_seguro(edad, puntos);
				double prima = tarifa_basica*factor_edad-reduccion;
				return prima;
			}else { 
				throw new IllegalArgumentException("Puntos deben ser entre 1 y 30");
			}
		}else {
			throw new IllegalArgumentException("Edad debe ser mayor o igual que 18");
		}
	}
	
}
