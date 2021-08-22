import java.util.ArrayList;

//Clase que almacena todos los autos disponibles en un ArrayList de Carros , tiene métodos para cambiar el estado de los autos.
public class Inventario {

  ArrayList<Carro> carros = new ArrayList<>();

  public Inventario() {
    carros.add(new Carro(400, 2015, "Ford Focus ", true, 5, 20000));

    carros.add(new Carro(340, 2012, "Nissan Sentra", true, 5, 15000));

    carros.add(new Carro(400, 2015, "Toyota Corolla", true, 5, 20000));

    carros.add(new Carro(850, 2019, "Rolls Royce", true, 6, 20000));
  }

  public void mostrarAutos() {
    String estado;

    int cont = 0;
    for (Carro carro : carros) {
      estado = "";
      if (carro.getDisponible()) {
        estado = "Disponible";
      } else {
        estado = "Rentado";
      }
      cont++;
      // ###Terminar de escribir lo que mostrara :
      System.out.println(
          cont + ". " + "Modelo: " + carro.getModelo() +" "+carro.getAño()+ " , Precio: " + carro.getPrecio() + "$/día. Estado: " + estado);

    }

  }

  public boolean rentarPorNumero(int numeroEnLista) {
    if (carros.get(numeroEnLista - 1).getDisponible()) {
      carros.get(numeroEnLista - 1).cambiarEstado();
      return true;

    }
    return false;

  }

  public void devolverRenta(Cliente clienteQueRenta){
      for(Carro carro : carros){
        if(!carro.getDisponible()){
          carro.cambiarEstado();
        }


      }


  }


  public ArrayList<Carro> getCarros() {
    return carros;

  }

}