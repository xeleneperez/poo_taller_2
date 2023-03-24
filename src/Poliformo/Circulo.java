package Poliformo;
import java.util.Scanner;
public class Circulo extends Figura {
   Scanner lectura =new Scanner(System.in);
   private float radio;

    public float getradio(){
        return radio;
    }
    public void setradio(float radio){
        System.out.println("ingresa el radio");
         radio =lectura.nextFloat();
        this.radio=radio;
    }
    
    @Override
    public void CalcularArea() {
        double area = Math.PI * Math.pow(radio,2 );
       System.out.println(" el tamaño del radio es de"+radio+"y su area es de"+area);
    }
    
}