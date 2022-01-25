import java.util.Scanner;
public class e95 {
public static void main(String[] args) {
 int fila, n,cuantos;

 Scanner dato = new Scanner(System.in);
 do{
 System.out.print("%c CUANTAS FILAS QUIERES ?");
 cuantos = dato.nextInt();
 }while(cuantos >24 || cuantos < 1);

 for(fila=1;fila<=cuantos;fila++) {
 System.out.print("fila"+fila+"\n");
 for (n=fila;n>1;n-=1){
 System.out.print(n);
 };
 System.out.println("\n");
 };
 dato.close();
}
}