import java.util.Scanner;

public class Control {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SistemaDeRentas sdr = new SistemaDeRentas();
    Inventario catalogo = new Inventario();
    Cliente usuario = new Cliente("Juan Pérez", 2007, 100000);

    boolean salidaMenu = false;
    System.out.println("Hola, " + usuario.getNombre() + " , cuentas con $" + usuario.getSaldo());
    System.out.println("Bienvenido al servicio de renta de autos.");
    do{
    System.out.println("1. Mostrar inventario de autos.\n2. Rentar auto.\n3. Devolver auto.\n4. Mostrar auto rentado por cliente.\n5. Salir.");
    int seleccionMenu = sc.nextInt();
    switch (seleccionMenu) {
      case 1:
        System.out.println("Catálogo:");
        catalogo.mostrarAutos();
        System.out.println("\n");
        break;
      case 2:
        System.out.println("Autos en inventario:");
        catalogo.mostrarAutos();
        System.out.println("Ingrese número en lista de carro:");
        int numeroDeCarroEscogido = sc.nextInt();
        catalogo.rentarPorNumero(numeroDeCarroEscogido);
        sdr.añadirRenta(new Renta(usuario, catalogo.getCarros().get(numeroDeCarroEscogido - 1)));
        System.out.println("\n");
        break;
      case 3:
        sdr.removerRenta(sdr.getRentas().get(0));
        catalogo.devolverRenta(usuario); 
        break;

      case 4:
        
        sdr.mostrarRentaPorUsuario(usuario);
        sdr.mostrarRentas();
        break;    
      case 5:
        salidaMenu = true;
        System.out.println("Gracias por usar el sistema de renta de autos. ");
        break;
        
        
      }
    }while(!salidaMenu);   
  }
}