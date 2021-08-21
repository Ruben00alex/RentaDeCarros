




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

  public void mostrarRentas(){
    for(Renta renta : rentas){
      System.out.println("Modelo: " + renta.getCarro().getModelo() + ", Precio: " + renta.getCarro().getPrecio() + ". Rentado por: "+renta.getCliente().getNombre());



    }


  }


  public void mostrarAlgo(){
    System.out.println("ALGOOO");

  }


}




