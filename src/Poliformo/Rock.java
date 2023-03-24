package Poliformo;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class Rock implements Juego{
    private String nombre;
    private int eleccion;
    private int lanzamiento;
    private String gana;
    Scanner lectura =new Scanner(System.in);

    @Override
    public void iniciar() {
       System.out.println("ingrese el nombre  del jugador");
      nombre = lectura.nextLine();  }

    @Override
    public void jugar() {
        lanzamiento=(int)(Math.random()*3+2+1);
       System.out.println(nombre+"seleccione 1. piedra 2. papel 3.tijera");
       eleccion=lectura.nextInt();
    }

    @Override
    public void finalizar() {
 if (lanzamiento==2 && eleccion==2){
System.out.println(nombre+"ha salido piedra, usted selecciono piedra usted gana");
 gana= lectura.nextLine();
}
else if (lanzamiento==1 && eleccion==1){
System.out.println(nombre+" ha salido piedra, usted escogio piedra usted gana");
gana=lectura.nextLine();
 }
 else if(lanzamiento==3 && eleccion==3){
    System.out.println(nombre+" ha salido tijera, usted escogio tijera usted gana");
    gana=lectura.nextLine();}
 
  else{
    System.out.println("Ha perdido el  juego ha finalizado ");
 }
 
    
 
         }
        }