
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
            }







        }

    }
}