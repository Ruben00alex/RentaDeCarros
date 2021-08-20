
public class Control{
  public static void main(String[] args){
    SistemaDeRentas sdr = new SistemaDeRentas();
    sdr.mostrarAlgo();
    Inventario catalogo = new Inventario();
    Cliente yomero = new Cliente("Alex Ramos", 2007, 100000);

    System.out.println("Hola, " + yomero.getNombre()+" , cuentas con $" + yomero.getSaldo());

    


    catalogo.mostrarAutos();    
    

  }



}