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
    public String getNombre(){
      return nombre;
    }
    public void setNombre(String nombre){
      this.nombre=nombre;
    }
    public int getId(){
      return id;
    }
    public void setId(int id){
      this.id=id;
    }
    public double getSaldo(){
      return saldo;
    }
    public void setSaldo(double saldo){
      this.saldo=saldo;
    }
    //Métodos
    public void darAlta(){
      Scanner entrada = new Scanner(System.in);

      System.out.println("Nombre:");
      nombre = entrada.nextLine();
      System.out.println("ID:");
      id = entrada.nextInt();
      System.out.println("Saldo: ");
      saldo = entrada.nextInt();

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