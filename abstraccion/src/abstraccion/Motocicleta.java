package abstraccion;

public class Motocicleta extends Vehiculo {
	
	//Las anotaciones @ son "indicaciones" que le damos a Java

	@Override
	public void acelerar() {
		System.out.println("La motocicleta está acelerando...");
		
	}
	
	//La subclase es quien decide cuándo y cómo se sobreescribe el método abstracto. Es decie, la subclase implementa el método.

	@Override
	public void frenar() {
		System.out.println("La motocicleta está frenando...");
		
	}

	
}