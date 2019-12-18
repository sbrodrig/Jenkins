package test;

import static org.junit.Assert.*;

import org.junit.Test;

import prima.Prima;

/**
 * Clase que contiene los test para la clase Prima.java
 * @author RODRIGUEZ
 *
 */
public class PrimaTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		System.out.println("Edad: 17, Puntos: 30");
		int edad = 17;
		int puntos = 30;
		Prima prima = new Prima();
		double esperado = 1350;
		double obtenido = prima.calcular_prima(edad, puntos);
	}
	
	@Test
	public void test2() {
		System.out.println("Edad: 20, Puntos: 30");
		int edad = 20;
		int puntos = 30;
		Prima prima = new Prima();
		double esperado = 1350;
		double obtenido = prima.calcular_prima(edad, puntos);
		assertEquals(esperado, obtenido, 0.0);
		System.out.println("Prima: "+obtenido);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test3() {
		System.out.println("Edad: 35, Puntos: -1");
		int edad = 35;
		int puntos = -1;
		Prima prima = new Prima();
		double esperado = 400;
		double obtenido = prima.calcular_prima(edad, puntos);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test4() {
		System.out.println("Edad: 25, Puntos: 40");
		int edad = 25;
		int puntos = 40;
		Prima prima = new Prima();
		double esperado = 850;
		double obtenido = prima.calcular_prima(edad, puntos);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test5() {
		System.out.println("Edad: 40, Puntos: 0");
		int edad = 40;
		int puntos = 0;
		Prima prima = new Prima();
		double esperado = 400;
		double obtenido = prima.calcular_prima(edad, puntos);
	}
	
	@Test
	public void test6() {
		System.out.println("Edad: 70, Puntos: 23");
		int edad = 70;
		int puntos = 23;
		Prima prima = new Prima();
		double esperado = 750.0;
		double obtenido = prima.calcular_prima(edad, puntos);
		assertEquals(esperado, obtenido, 0.0);
		System.out.println("Prima: "+obtenido);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test7() {
		System.out.println("Edad: 95, Puntos: 0");
		int edad = 95;
		int puntos = 0;
		Prima prima = new Prima();
		double esperado = 0;
		double obtenido = prima.calcular_prima(edad, puntos);
	}

}
