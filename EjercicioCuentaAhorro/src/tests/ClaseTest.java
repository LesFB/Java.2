package tests;
import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 100.0f);

		PlazoFijo instancia2 = new PlazoFijo("Leslie Flores", 2500.0f, 12, 5.0);
		
		instancia1.imprimirDatos();
		System.out.println();
		instancia2.mostrarInformacion();
	}
	
	

}
