package Inicio;
import java.util.Scanner;
public class Persona {

  public String tipodoc ;
  public int documento;
  public String nombre;
  public String apellido;
  public Double peso;
  public Double estatura;
  public int edad;
  public String sexo;

  Scanner lectura =new Scanner(System.in);
  public static void main(String[] args) {
    
  }   
  public void  pedirDatos(){
      System.out.println("ingrese su tipo de documento");
      tipodoc=lectura.nextLine();
      System.out.println("ingrese su numero de documento");
      documento=lectura.nextInt();
      System.out.println("ingrese su nombre");
      nombre=lectura.nextLine();
      System.out.println("ingrese su apellido");
      apellido=lectura.nextLine();
      System.out.println("ingrese su peso en kg");
      peso=lectura.nextDouble();
      System.out.println("ingrese su estatura en m");
      estatura =lectura.nextDouble();
      System.out.println("ingrese su edad");
      edad=lectura.nextInt();
      System.out.println("ingrese su sexo");
      sexo= lectura.nextLine();

  }
  public void mostrarPersonal(){
      System.out.println("su tipo de doc  y numero es "+tipodoc+documento+" con el nombre y apellido de "+nombre+apellido+" pesa "+peso+" estatura "+estatura+"su edad y genero son"+edad+sexo);
  }
  public void  calcularlmc(){
     double pesoActual,iMC;
      pesoActual=(peso/estatura);
      iMC= Math.pow(pesoActual,2);

      if(pesoActual>20){
          System.out.println("el peso esta por debajo de lo ideal");
      }
    else if (iMC<=20 && iMC>=25){
  System.out.println(" el peso es ideal");
    }
    else{
      System.out.println("tiene sobre peso");
    }



if(edad>=18){
  System.out.println("eres mayor de edad");

}
else{
  System.out.println("no eres mayor de edad");
}

  }
  }

