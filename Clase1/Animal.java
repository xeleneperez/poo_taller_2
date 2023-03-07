import java.util.Scanner;
public class Animal {
    //atributos
    private string nombre;
    public in edad;
 Scanner lectura=new scanner(System.in);
    //metodos u operaciones
    public void registrarAnimal(string n,init e){
        System.out.println("ingrese el nombre del animal");
        nombre=lectura.nextLine();
        System.out.println("ingrese la edad del animal");
        edad=lectura.nextLine();

    }
    public void mostrarAnimal(){
        System.out.println("el nombre del animal ingresado"+nombre+"y tiene una edad de "+ edad);
    }
}
