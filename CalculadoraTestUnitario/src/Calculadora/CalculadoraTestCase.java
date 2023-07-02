package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;


class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.sumar(2,3);
		Assert.assertEquals(5,resultado);
	}
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2,3);
		Assert.assertEquals(6,resultado);
	}
	

}
