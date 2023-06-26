package entidades;

public class Clientes {
	
	private String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	public Clientes(String nombre, String cuentaBancaria, float saldo, String nip) {
		super();
		this.setNombre(nombre);
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
		this.nip = nip;
	}
	
	public void mostrarInfoCliente() {
		System.out.printf("El nombre es: %s %nLa cuenta bancaria es: %s %nEl saldo es %f %nEl nip es %s",nombre,cuentaBancaria,saldo,nip);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
