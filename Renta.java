public class Renta{
  Cliente cliente;
  Carro carroEnRenta;
  

  public Renta(Cliente cliente, Carro carro){
    this.cliente = cliente;
    carroEnRenta = carro;
  }


  //métodos:
  public Carro getCarro(){
    return carroEnRenta;
  }

  public Cliente getCliente(){
    return cliente;
  }


}