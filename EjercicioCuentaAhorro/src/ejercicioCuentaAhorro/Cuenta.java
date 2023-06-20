package ejercicioCuentaAhorro;

public class Cuenta {
	String titular;
	float cantidad;
	
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public void imprimirDatos(){
		System.out.println("Titular: "+ titular);
		System.out.println("Cantidad: "+ cantidad);
	}
	
}
