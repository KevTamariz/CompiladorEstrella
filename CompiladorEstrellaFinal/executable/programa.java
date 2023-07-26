import java.util.Scanner;
public class programa{
public static void main(String[] args){
try{
Scanner scan = new Scanner(System.in);
int numero1;
numero1=10;
int numero2;
numero2=2;
int numero3;
numero3=5;
int resultado;
resultado=numero1*numero2;
System.out.print(resultado);
} catch(Throwable e){
System.out.println("Se ha generado un error en tiempo de ejecucion");
System.out.println("Causa: Posiblemente estas intentando introducir un valor invalido");
}
}
}
