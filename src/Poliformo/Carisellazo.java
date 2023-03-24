package Poliformo;

import java.util.Scanner;

public class Carisellazo implements Juego {
    private String nombre;
    private int eleccion;
    private int lanzamiento;
    private String gana;
    
Scanner lectura= new Scanner(System.in);
    @Override
    public void iniciar() {

        System.out.println("Ingrese el nombre del jugador");
        nombre = lectura.nextLine();
         }

    @Override
    public void jugar() {
        lanzamiento=(int) (Math.random()*2+1);
        System.out.println(nombre+" seleccione 1. cara 2 sello");
        eleccion=lectura.nextInt();
         }

    @Override
    public void finalizar() {
        if(lanzamiento==1 && eleccion==1){
            System.out.println(nombre+" Ha salido cara,usted  selecciono cara usted gana");
            gana=lectura.nextLine();
        }
        else if (lanzamiento==2 && eleccion==2){
            System.out.println(nombre+" ha salido sello, usted escogio sello ha ganado");
            gana=lectura.nextLine();
                
            }
        
        else{
            System.out.println(" Ha perdido el juego ha finalizado");
        }
         }
        }
