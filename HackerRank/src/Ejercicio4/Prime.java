package Ejercicio4;
import java.util.*;

public class Prime {
	
	public static boolean checkPrime(int a) {
		boolean b = false;
		if (a==2 || a==3) {
			b = true;
		}
		for (int i=2;i<=(a/2);i++) {
			if (a%i == 0) {
				b= false;
				i=a;
			} else {
				b= true;
			}
		}
		 return b;
		}
	
	public static String concatenarPrimos(int a,String b) {
		boolean aux=checkPrime(a);
		String aux1 = null;
		
		if (aux) {
			aux1 = b+" "+a;
		}
		return aux1;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = "";
		int[] numeros = new int[5];
		int aux3;
		System.out.println("Ingresa números:");
		
		for (int j =0;j<5;j++) {
			aux3 =a.nextInt();
			numeros[j]=aux3;
		}
				
		
		for(int i=0;i<5;i++) {
			String aux4 = null;
			if (checkPrime(numeros[i])) {
				aux4 = concatenarPrimos(numeros[i],b);
				b = aux4;
			}
			System.out.println(b);
		}
		a.close();
	}
	
}
