
public class Control {
  public static void main(String[] args) {
    SistemaDeRentas sdr = new SistemaDeRentas();
    
    Inventario catalogo = new Inventario();
    Cliente yomero = new Cliente("Alex Ramos", 2007, 100000);

    System.out.println("Hola, " + yomero.getNombre() + " , cuentas con $" + yomero.getSaldo());

    catalogo.mostrarAutos();
    catalogo.rentarPorNumero(2);// dentro del parentesis va el numero en la lista del menu, sera pedido con un Scanner, debe ser un int

    sdr.añadirRenta(new Renta(yomero, catalogo.getCarros().get(2 - 1)));
    System.out.println("Ingrese número en lista de carro: \n");
    catalogo.mostrarAutos();
    System.out.println("\nAutos rentados:");
    sdr.mostrarRentas();
  }

}