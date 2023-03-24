package Poliformo;
import java.util.Scanner;

public class Ejecucion{
    
   public static void main(String[] args) {
    int opcion;
    Scanner lectura =new Scanner(System.in);
    System.out.println("seleccione la opcion de la figura que desea calcular 1 triangulo 2 rectangulo 3circulo");
    opcion =lectura.nextInt();
   if (opcion==1){
    Triangulo cal1= new Triangulo();
    cal1.setbase(0);
    cal1.setlado(0);
    cal1.CalcularArea();

   }
   else if(opcion==2){
    Rectangulo cal2= new Rectangulo();
    cal2.setancho(0);
    cal2.setlargo(0);
    cal2.CalcularArea();
   }
   else if (opcion==3){
    Circulo cal3= new Circulo();
    cal3.setradio(0);
    cal3.CalcularArea();
   }
   
   }
}