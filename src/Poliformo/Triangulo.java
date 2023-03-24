package Poliformo;
import java.util.Scanner;
import Poliformo.Figura;
public class Triangulo  extends Figura{
    Scanner lectura =new Scanner(System.in);
    private float lado ;
    private float base ;

    public float getLado (){
        return lado;
    }
     
    public void setlado(float lado){
        System.out.println("ingrese el lado");
        lado = lectura.nextFloat();
        this.lado=lado;
    }
    public float getbase (){
        return base;
    }
    public void setbase(float base){
        System.out.println("ingrese la base");
         base= lectura.nextFloat();
        this.base=base;
    }
  
    @Override
    public void CalcularArea (){
        float area= base*lado;
  System.out.println("la base del cuadrado es "+base+" y su lado es de "+lado+" su area es de "+area);
    }
}