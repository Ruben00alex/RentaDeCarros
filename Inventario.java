import java.util.ArrayList;
//Clase que almacena todos los autos disponibles en un ArrayList de Carros , tiene métodos para cambiar el estado de los autos.
public class Inventario{



  ArrayList<Carro> carros = new ArrayList<>();
  public Inventario(){
    carros.add(new Carro( 40000, 2015, "Ford Focus ", true, 5 , 20000));


    carros.add(new Carro( 34000, 2012, "Nissan Sentra", true, 5 , 15000));

    carros.add(new Carro( 40000, 2015, "Toyota Corolla", true, 5 , 20000));

    carros.add(new Carro( 85000, 2015, "Rolls Royce", true, 6 , 20000));
  }



  public void mostrarAutos(){
    for(Carro carro : carros){
      //###Terminar de escribir lo que mostrara :
      System.out.println("Modelo: "+ carro.getModelo()+ ", Precio:"+ carro.getPrecio());


    }


  }




}