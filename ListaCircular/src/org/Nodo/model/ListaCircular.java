package org.Nodo.model;

public class ListaCircular {
    private Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    // Agregar un nodo al principio de la lista
    public void agregarNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            ultimo.siguiente = cabeza;
        }
    }

    // Insertar un nodo en una posición específica
    public void insertarNodo(int valor, int posicion) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            int contador = 1;
            while (contador < posicion - 1 && actual.siguiente != cabeza) {
                actual = actual.siguiente;
                contador++;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    // Eliminar un nodo de una posición específica
    public void eliminarNodo(int posicion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;
        int contador = 1;

        while (contador < posicion && actual.siguiente != cabeza) {
            anterior = actual;
            actual = actual.siguiente;
            contador++;
        }

        if (contador == 1 && actual.siguiente == cabeza) {
            cabeza = null;
        } else if (contador == 1) {
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            cabeza = cabeza.siguiente;
            ultimo.siguiente = cabeza;
        } else {
            anterior.siguiente = actual.siguiente;
        }
    }

    // Método para imprimir la lista circular
    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println();
    }
}
