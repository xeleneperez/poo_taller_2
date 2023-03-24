package Poliformo;
import java.util.Scanner;
public class Rectangulo extends Figura{
    Scanner lectura =new Scanner(System.in);
     private float largo;
     private float ancho;

    public float getlargo(){
        return largo;
    }
    public void setlargo(float largo){
        System.out.println("ingrese el largo ");
        largo =lectura.nextFloat();
        this.largo=largo;
    }
    public float getancho(){
        return ancho;

    }
    public void setancho(float ancho){
        System.out.println("ingrese el ancho");
        ancho  =lectura.nextFloat();
        this.ancho=ancho;
    }
     
    @Override
    public void CalcularArea() {
        float area=largo*ancho;
       System.out.println("el largo de su rectangulo es de "+largo+ "y el ancho es de "+ancho+" el area es de "+area);
    }
    
}