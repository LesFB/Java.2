package Ejercicio3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SolucionEj3 {

	
	public static boolean validar(int x, int restAbajo,int restArriba) {
		if (x<restAbajo || x>restArriba) {
			System.out.println("Ese número no es válido");
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean validarTipo(String input) {
		try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
        	System.out.println("La entrada no es válida");
            return false;
        }
	}
	
	
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Scanner cadena = new Scanner(System.in);
		
		boolean aux = false, aux1,aux3 = false;
		int numArreglo = 0;
				
		do {
			System.out.println("Ingresa el tamaño de tu arreglo");
			String input1= num.nextLine();
			aux1 = validarTipo(input1);
			if (aux1) {
				numArreglo = Integer.parseInt(input1);
				aux = validar(numArreglo,0,101);
				};
		}while(!aux);
		
		int[]secuencia = null;
		
		do {
			System.out.println("Ingresa la secuencia");
			String secuenciaString = cadena.nextLine();
			String[] a = secuenciaString.split(" ");
			int[] arregloNum = new int[numArreglo];
						
			if(a.length!=numArreglo) {
				System.out.println("Ingresa una secuencia de tamaño adecuado");
				continue;
			}
			for (int i=0;i<numArreglo;i++) {
				if (!validarTipo(a[i])) {
					System.out.println("Deben ser solo números");
					aux3 =false;
					i=numArreglo;
				}else {
					arregloNum[i]=Integer.parseInt(a[i]); 
				}
			}
			aux3 = (arregloNum.length==numArreglo)?true:false;
			
			secuencia =arregloNum;
		}while(!aux3);
		
		
		int contadorPositivo = 0,contadorNegativo= 0,contadorCeros= 0;
		for (int j=0;j<numArreglo;j++) {
			
			if (secuencia[j] > 0) {
				contadorPositivo=contadorPositivo+1;
		    } else if (secuencia[j] < 0) {
				contadorNegativo=contadorNegativo+1;
		    } else {
				contadorCeros=contadorCeros+1;
		    }
		}
		double a =(double)contadorPositivo/numArreglo;
		double b =(double)contadorNegativo/numArreglo;
		double c =(double)contadorCeros/numArreglo;
		
		DecimalFormat df = new DecimalFormat("#.######");
		String aFormateado = df.format(a);
		String bFormateado = df.format(b);
		String cFormateado = df.format(c);
		
		System.out.println(a);
		System.out.println("El ratio de números positivos es: "+ aFormateado);
		System.out.println("El ratio de números negativos es: "+ bFormateado);
		System.out.println("El ratio de ceros es: "+ cFormateado);
		num.close();
		cadena.close();
	}
	
}
