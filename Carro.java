//Clase que modela los atributos del carro.
public class Carro{
  //atributos
  private double precio;
  private int año;
  private String modelo;
  private boolean estado;
  private int capacidad;
  private int kilometraje;
  
  public Carro(double precio, int año, String modelo, boolean estado, int capacidad, int kilometraje){
    this.precio=precio;
    this.año=año;
    this.modelo=modelo;
    this.estado=estado;
    this.capacidad=capacidad;
    this.kilometraje=kilometraje;
  }
  
}