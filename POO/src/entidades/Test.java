package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado EvilFelipe = new Empleado ("Evil Felipe",31,"mmm@gmail.com","56987412","ABC123","346464641","Bell Boy");
		
		EvilFelipe.mostrarInformacion();
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("instancia de un cliente");
		Clientes Jesus = new Clientes("jesus","abcd1234",1555.00f,"1234");
		Jesus.mostrarInfoCliente();
		
		Jesus.setNombre("Evil Jesus");
		
		System.out.println();
		System.out.println();
		Jesus.mostrarInfoCliente();		
	}
	
	

}
