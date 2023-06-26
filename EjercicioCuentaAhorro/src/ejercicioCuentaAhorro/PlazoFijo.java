package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	public int plazo;
	public double interes;
	
	
	
	public PlazoFijo(String titular,float cantidad, int plazo, double interes){	
		super(titular,cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	//metodo obtener importe de interes
	public double obtenerImporteInteres() {
		return cantidad*(interes/100);
	}
	
	//metodo para mostrar info
	public void mostrarInformacion() {
		System.out.println("Informacion de la cuenta Plazo Fijo");
		imprimirDatos();
		System.out.println("Plazo: "+plazo);
		System.out.println("Interes: "+interes);
		System.out.println("Total de Interes: "+obtenerImporteInteres());
	}
	
	
}
