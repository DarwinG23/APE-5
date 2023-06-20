import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion = 0;
        int dato = 0;
        int index = 0;
        do{
            System.out.println("**********Menú**********");
            System.out.println("1. Agregar un nodo al principio de la lista");
            System.out.println("2. Insertar un nodo en una posición específica");
            System.out.println("3. Eliminar un nodo especifico");
            System.out.println("4. Mostrar la lista");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el dato que contendrá el nodo: ");
                    dato = sc.nextInt();
                    lista.AgregarNodo(dato);
                    break;
                case 2:
                    System.out.println("Ingresa el dato que contendrá el nodo: ");
                    dato = sc.nextInt();
                    System.out.println("Ingresa la posición en la que se insertará el nodo: ");
                    index = sc.nextInt();
                    lista.insertNodo(dato, index);
                    break;
                case 3:
                    System.out.println("Ingresa la posición del nodo que deseas eliminar: ");
                    index = sc.nextInt();
                    lista.eliminarNodo(index);
                    break;
                case 4:
                    lista.mostrarLista();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion != 5);
    }
}