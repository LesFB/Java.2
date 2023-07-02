package abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {

		//Instancia de la clase automóvil
		Automovil myTroquita = new Automovil();
		
		//Instancia de la clase motocicleta
		Motocicleta ninja = new Motocicleta();
		
		//Llamamos a los métodos de cada instancia
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		
	}

}