import java.util.Scanner;
import java.io.*;
public class P_6_4_6 {
	public static void main(String[]args) throws IOException {
		int aux=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("dime un plabra");
		String frase=sc.nextLine();
		
		int longitudFrase = frase.length();
		System.out.println(+longitudFrase);
		
		int posInicial = (int) (Math.random()*longitudFrase);
		System.out.println(posInicial);
		
		int posFinal =(int)(Math.random()*longitudFrase);
		System.out.println(posFinal);
		
		if(posInicial>posFinal){
			aux=posInicial;
			posInicial=posFinal;
			posFinal=aux;
		}
		String subCadena=frase.substring(posInicial,posFinal);
		
		System.out.println(subCadena);
	}
}