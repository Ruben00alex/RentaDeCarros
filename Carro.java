//Clase que modela los atributos del carro.

import java.util.Scanner;

public class Carro {
  // atributos
  private double precio;
  private int año;
  private String modelo;
  private boolean disponible;
  private int capacidad;
  private int kilometraje;

  public Carro(double precio, int año, String modelo, boolean estado, int capacidad, int kilometraje) {
    this.precio = precio;
    this.año = año;
    this.modelo = modelo;
    // this.estado=estado;
    this.capacidad = capacidad;
    this.kilometraje = kilometraje;
    this.disponible = estado;
  }

  // sets y gets
  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getAño() {
    return año;
  }

  public void setAño(int año) {
    this.año = año;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public boolean getDisponible() {
    return disponible;
  }

  public void setDisponible(boolean estado) {
    this.disponible = estado;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  // Métodos
  public void darAltaCarro() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Precio: ");
    precio = entrada.nextInt();
    System.out.println("Año");
    año = entrada.nextInt();
    System.out.println("Modelo");
    modelo = entrada.nextLine();
    System.out.println("Capacidad");
    capacidad = entrada.nextInt();
    System.out.println("Kilometraje");
    kilometraje = entrada.nextInt();
  }
  
   public void cambiarEstado(){ disponible = !disponible; // if
   //(estaDisponible == true) // estaDisponible = false; 
   // else 
   // estado = true;
   }
   
}