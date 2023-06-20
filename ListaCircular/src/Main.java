import org.Nodo.model.ListaCircular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Insertar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del nodo a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregarNodo(valorAgregar);
                    System.out.println("Nodo agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el valor del nodo a insertar: ");
                    int valorInsertar = scanner.nextInt();
                    System.out.print("Ingrese la posición donde desea insertar el nodo: ");
                    int posicionInsertar = scanner.nextInt();
                    lista.insertarNodo(valorInsertar, posicionInsertar);
                    System.out.println("Nodo insertado correctamente.");
                    break;
                case 3:
                    System.out.print("Ingrese la posición del nodo a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    lista.eliminarNodo(posicionEliminar);
                    System.out.println("Nodo eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("Lista actual:");
                    lista.imprimirLista();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
    }
}
