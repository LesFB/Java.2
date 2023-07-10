package Ejercicio2;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	

	public static boolean validar(int x, int restAbajo,int restArriba) {
		if (x<restAbajo || x>restArriba) {
			System.out.println("Ese número no es válido");
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean validarAbajo(int x, int restAbajo) {
		if (x<restAbajo) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean validarArriba(int x, int restArriba) {
		if (x>restArriba) {
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
	
	public static String formula(int a,int b,int n) {
		int[] arreglos = new int[n];
		arreglos[0]=a+b;
		for (int i = 1;i<n;i++) {
			arreglos[i]=(int) (arreglos[i-1]+Math.pow(2, i)*b);
			
		}
		String cadenaArreglos = Arrays.toString(arreglos);
		
		return cadenaArreglos;
	}
	
	
	public static void main(String[] args) {
		
	     Scanner var1 = new Scanner(System.in);
	     Scanner var2 = new Scanner(System.in);
	     
	     boolean auxGeneral = false;
	     int num1 = 0;
	     String tipoNum = "";
	     
	     //Este código es para validar que la primera entrada sea un número y bajo 0<q<500
	     
	     while (auxGeneral == false) {
	    	 System.out.println("Ingresa número de consultas: ");
	    	 tipoNum = var1.nextLine();
	    	 if (validarTipo(tipoNum)== false) {
	    		 auxGeneral = false;
	    	 }else {
	    		 num1 = Integer.parseInt(tipoNum);
		    	 boolean aux = validar(num1,0,500);
		    	 auxGeneral = (aux==true)? true: false;
	    	 }   	 
	    	 
	     }
	    
	     
	     
	     //Este código es para hacer las formulas	
	     int[] arregloNumeros = null;
	     boolean aux2 = false;
	     
	     
	     String cadenaGeneral = " ";
	     for (int i=1; i<=num1;i++) {
	    	 do {
	    		 System.out.println("Ingresa números para fórmula: ");
		    	 String stringNumeros = var2.nextLine();
			     String[] a = stringNumeros.split(" ");
			    
			     arregloNumeros = new int[a.length];
			     for (int j=0;j<=a.length-1;j++) {
			    	 arregloNumeros[j]= Integer.parseInt(a[j]);
			     } 
			     
			     if (!validarAbajo(arregloNumeros[0],0)) {
					 System.out.println("El primer número debe ser mayor a 0");
					 aux2 = true;
				 }else if (!validarArriba(arregloNumeros[1],50)){
					 System.out.println("El segundo número debe ser menor a 50");
					 aux2 = true;
				 }else if (!validar(arregloNumeros[2],1,15)) {
					 System.out.println("El tercer número debe ser mayor a 0 y menor a 16");
					 aux2 = true;
				 }else {
					 aux2 = false;
				 }
	    		 
			     String cadena = formula(arregloNumeros[0],arregloNumeros[1],arregloNumeros[2]);
			     
			     cadenaGeneral=cadenaGeneral + "\n" + cadena;
			     
	    	 }while(aux2);
	    	 
	    	 
	    	 
	     }
	     
		 System.out.println(cadenaGeneral);

	     var1.close();
	     var2.close();
	}
}

