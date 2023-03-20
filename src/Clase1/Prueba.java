package Clase1;
import Clase1.Animal;
import java.util.Scanner;
public class Prueba{
    static Scanner lectura= new Scanner(System.in);
    public static void main(String[] args) {
        Movie titanic=new Movie();
        Animal guacamayo=  new Animal();
        System.out.println("ingrese el nombre del animal");
        String nombre=lectura.nextLine();
        System.out.println("ingrese la edad del animal");
        int edad =lectura.nextInt();

        guacamayo.registrarAnimal(nombre,edad);//invocar o llamar un metodo
        guacamayo.mostrarAnimal();
     
   
    }
     
}
