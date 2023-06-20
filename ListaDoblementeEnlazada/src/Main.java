

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        Scanner Leer = new Scanner(System.in);
        int opcion = 0;
        int dato = 0;
        int pos = 0;
        do {
            System.out.println("**********Menú**********");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Eliminar nodo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Agregar nodo al final");
            System.out.println("5. Salir");
            opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dato del nodo");
                    dato = Leer.nextInt();
                    System.out.println("Ingrese la posicion del nodo");
                    pos = Leer.nextInt();
                    lista.insertarNodo(dato, pos);
                    break;
                case 2:
                    System.out.println("Ingrese la posicion del nodo a eliminar");
                    pos = Leer.nextInt();
                    lista.eliminarNodo(pos);
                    break;
                case 3:
                    lista.mostrarLista();
                    break;
                case 4:
                    System.out.println("Ingrese el dato del nodo");
                    dato = Leer.nextInt();
                    lista.agregarNodo(dato);
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);
    }
}