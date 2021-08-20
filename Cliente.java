//Clase que modela el cliente.

import java.util.Scanner;

public class Cliente {
    //atributos
    private String nombre;
    private int id;
    private double saldo;
    
    //constructor
    public Cliente(String nombre, int id, double saldo){
        this.nombre=nombre;
        this.id=id;
        this.saldo=saldo;
    }
    //sets y gets
    public String setNombre(){
      return nombre;
    }
    public void getNombre(String nombre){
      this.nombre=nombre;
    }
    public int setId(){
      return id;
    }
    public void getId(int id){
      this.id=id;
    }
    public double setSaldo(){
      return saldo;
    }
    public void getSaldo(double saldo){
      this.saldo=saldo;
    }
    //Métodos
    public void darAlta(){
      Scanner entrada = new Scanner(System.in);

      System.out.println("Nombre:");
      nombre = entrada.nextLine();
      System.out.println("ID:");
      id = entrada.nextInt();
      System.out.println("Edad: ");
      edad = entrada.nextInt();
    }
    public double pagar(double precio, double ganancia){
      if(saldo>=precio){
        ganancia=saldo-precio;
        return ganancia;
      }
      else{ 
        System.out.println("Saldo no suficiente");
        return ganancia=0.0;
        }
    }

}