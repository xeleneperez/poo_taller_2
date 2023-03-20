package Clase1;
import java.util.Scanner;
public class Animal {
    //atributos
    private String nombre;
    public int edad;
 Scanner lectura=new Scanner(System.in);
    //metodos u operaciones
    public void registrarAnimal(String n, int e){
        System.out.println("ingrese el nombre del animal");
        nombre=lectura.nextLine();
        System.out.println("ingrese la edad del animal");
        edad=lectura.nextInt();

    }
    public void mostrarAnimal(){
        System.out.println("el nombre del animal ingresado"+nombre+"y tiene una edad de "+ edad);
    }
}