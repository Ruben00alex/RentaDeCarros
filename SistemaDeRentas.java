




import java.util.ArrayList;
//Clase que se encarga de llevar control de las rentas, usando una clase Renta por persona y almacenándolas en un ArrayList
public class SistemaDeRentas {
  //Atributos:
  ArrayList<Renta> rentas = new ArrayList<Renta>();

  public SistemaDeRentas(){
 
  }

  public void añadirRenta(Renta renta){
    rentas.add(renta);
  }

  public void removerRenta(Renta renta){
    for(int i = 0; i < rentas.size() ; i++){
      if(rentas.get(i)== renta){
        rentas.remove(i);
      }

    }
  }

  public void mostrarRentaPorUsuario(Cliente cliente){
    for(Renta renta :rentas){
      if(renta.getCliente() == cliente){
        System.out.println("\nAutos rentados:");
        System.out.println("\nCuentas con el auto :" + renta.getCarro().getModelo());

      }
    }
  }


  public void mostrarRentas(){
    
    for(Renta renta : rentas){
      System.out.println("Modelo: " + renta.getCarro().getModelo() + ", Precio: " + renta.getCarro().getPrecio() + ". Rentado por: "+renta.getCliente().getNombre()+"\n");
    }
  }

  public ArrayList<Renta> getRentas(){
    return rentas;
  }

  public void mostrarAlgo(){
    System.out.println("ALGOOO");
  }
}




