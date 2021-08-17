//Clase que modela el cliente.

public class Cliente {
    //atributos
    private String nombre;
    private int id;
    private float saldo;
    
    //constructor
    public Cliente(String nombre, int id, float saldo){
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
    public float setSaldo(){
      return saldo;
    }
    public void getSaldo(float saldo){
      this.saldo=saldo;
    }
    //Métodos
    public float pagar(float precio, float ganancia){
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