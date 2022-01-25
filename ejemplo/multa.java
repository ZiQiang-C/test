import java.util.Scanner;
import java.io.*;
public class multa {
	public static void main(String[]args) throws IOException {
		double distancia,maxvelo,seg,velocidad,maxvelo20;
		Scanner datos=new Scanner(System.in);
		do{
			System.out.println("dime distancia , velocidad maxma y tiempo");
			distancia=datos.nextDouble();
			
			
			maxvelo=datos.nextDouble();
			
			
			seg=datos.nextDouble();
			
			if(distancia<0 || maxvelo<0 || seg<0){
				System.out.println("error");
			}else{
			
				velocidad=(distancia/seg)*((double)3600/1000);
				if(velocidad>maxvelo){
						maxvelo20=maxvelo*1.2;
					if(velocidad>=maxvelo20){
						System.out.println("PUNTO"+velocidad+" maxvelo20"+maxvelo20);
					}else{
						System.out.println("MULTA" +velocidad+" maxvelo20"+maxvelo20);
					}
				}else{
					if(distancia!=0){
					System.out.println("ok");
					}
				}
			}
		}while((distancia!=0)&&(maxvelo!=0)&&(seg!=0));
		
	}
}