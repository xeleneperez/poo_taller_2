package clase1;
import java.util.Scanner;
public class prueba{
    public static void main(String[] args) {
        Movie titanic=new Movie();
        Animal guacamayo=  new Animal();
        System.out.println("ingrese el nombre del animal");
        string nombre=lectura.nextLine();
        System.out.println("ingrese la edad del animal");
        int edad=lectura.nextLine();

        guacamayo.registrarAnimal(nombre,edad);//invocar o llamar un metodo
        guacamayo.mostrarAnimal();
    

    }
}