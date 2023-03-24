package Poliformo;

public class Cuadrado  extends Figura{
 private float lado; //atributo encapsulado
 //metodos accesores get y set
 public float getLado(){
    return lado;
 }
 public void setLado(float lado){
    this.lado =lado;

 }
 // sobre escritura metodo calcular area
    @Override
    public void CalcularArea() {
        // area del cuadrado
        float area= lado*lado;
        System.out.println("El lado del cuadrado es "+lado+"el area es "+area );
    }
    
}