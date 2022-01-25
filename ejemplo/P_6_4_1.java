import java.util.Scanner;
import java.io.*;
public class P_6_4_1 {
	public static void main(String[]args) throws IOException {
		Scanner datos=new Scanner(System.in);
		int l,a;
		
		
		
		l=(int)((Math.random()*9+1)*100000);
		String O=Integer.toString(l);
		System.out.println(l);
	
		a=(int )(Math.random()*0+9);
		O=O.replaceAll(a,"");
		System.out.println(O);
	}
}