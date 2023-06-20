package listas;

public class ListasCd {

        private Nodo cabeza;

        public ListasCd() {
            this.cabeza = null;
        }

        // Método para agregar un nodo al final de la lista
        public void agregarNodo(int valor) {
            Nodo nuevoNodo = new Nodo(valor);

            if (cabeza == null) {
                cabeza = nuevoNodo;
                nuevoNodo.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(nuevoNodo);
            } else {
                Nodo ultimo = cabeza.getAnterior();
                nuevoNodo.setSiguiente(cabeza);
                nuevoNodo.setAnterior(ultimo);
                cabeza.setAnterior(nuevoNodo);
                ultimo.setSiguiente(nuevoNodo);
            }
        }

        // Método para insertar un nodo en una posición específica
        public void insertarNodo(int valor, int posicion) {
            if (posicion < 1 || (posicion > 1 && cabeza == null)) {
                System.out.println("Posición inválida.");
                return;
            }

            Nodo nuevoNodo = new Nodo(valor);

            if (cabeza == null) {
                cabeza = nuevoNodo;
                nuevoNodo.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(nuevoNodo);
            } else if (posicion == 1) {
                Nodo ultimo = cabeza.getAnterior();
                nuevoNodo.setSiguiente(cabeza);
                nuevoNodo.setAnterior(ultimo);
                cabeza.setAnterior(nuevoNodo);
                ultimo.setSiguiente(nuevoNodo);
                cabeza = nuevoNodo;
            } else {
                Nodo actual = cabeza;
                int contador = 1;

                while (contador < posicion - 1 && actual.getSiguiente() != cabeza) {
                    actual = actual.getSiguiente();
                    contador++;
                }

                if (contador == posicion - 1) {
                    Nodo siguiente = actual.getSiguiente();
                    nuevoNodo.setSiguiente(siguiente);
                    nuevoNodo.setAnterior(actual);
                    actual.setSiguiente(nuevoNodo);
                    siguiente.setAnterior(nuevoNodo);
                } else {
                    System.out.println("Posición inválida.");
                }
            }
        }

        // Método para eliminar un nodo de una posición específica
        public void eliminarNodo(int posicion) {
            if (posicion < 1 || cabeza == null) {
                System.out.println("Posición inválida o lista vacía.");
                return;
            }

            if (posicion == 1) {
                if (cabeza.getSiguiente() == cabeza) {
                    cabeza = null;
                } else {
                    Nodo ultimo = cabeza.getAnterior();
                    Nodo siguiente = cabeza.getSiguiente();
                    siguiente.setAnterior(ultimo);
                    ultimo.setSiguiente(siguiente);
                    cabeza = siguiente;
                }
            } else {
                Nodo actual = cabeza;
                int contador = 1;

                while (contador < posicion && actual.getSiguiente() != cabeza) {
                    actual = actual.getSiguiente();
                    contador++;
                }

                if (contador == posicion) {
                    Nodo anterior = actual.getAnterior();
                    Nodo siguiente = actual.getSiguiente();
                    anterior.setSiguiente(siguiente);
                    siguiente.setAnterior(anterior);
                } else {
                    System.out.println("Posición inválida.");
                }
            }
        }

        // Método para imprimir la lista
        public void imprimirLista() {
            if (cabeza == null) {
                System.out.println("La lista está vacía.");
            } else {
                Nodo actual = cabeza;

                do {
                    System.out.print(actual.getValor() + " ");
                    actual = actual.getSiguiente();
                } while (actual != cabeza);

                System.out.println();
            }
        }
}




