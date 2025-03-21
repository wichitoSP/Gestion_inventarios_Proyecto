
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double Iva = 0.12;
        ArrayList<String> nombreProductos = new ArrayList<>();
        ArrayList<Integer>cantidadesProductos = new ArrayList<>();
        ArrayList<Double> precioProductos = new ArrayList<>();

        while (true){

            System.out.println("/n***************Menú Inventario******************");
            System.out.println("1.Agregar Producto");
            System.out.println("2.Mostar Producto");
            System.out.println("3.Actualizar cantidad de un producto");
            System.out.println("4.Elimnar Producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción del menu: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){

                case 1 :
                    System.out.print("Ingrese el nombre del producto:");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto:");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double percio = scanner.nextDouble();
                    scanner.nextLine();

                    nombreProductos.add(nombre);
                    cantidadesProductos.add(cantidad);
                    precioProductos.add(percio);

                    System.out.println("Producto agregado de manera correcta.");

                    break;

                case 2 :
                    if (nombreProductos.isEmpty()){
                        System.out.println("No hay productos en el inventario");
                    }else {
                        System.out.println("/n ***Lista de Productos***");
                        for (int i = 0; i <nombreProductos.size();i++){
                            System.out.println("Producto: " + nombreProductos.get(i) +
                                    ", Cantidad: " + cantidadesProductos.get(i) +
                                    ", Precio: $" + precioProductos.get(i) +
                                    ", Precio con IVA: Q" + (precioProductos.get(i) * (1 + Iva)));
                        }
                    }

            }







        }

    }
}