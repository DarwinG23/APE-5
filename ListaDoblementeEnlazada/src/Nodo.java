public class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;

    //Constructor para cuando hay nodos
    public Nodo(int dato, Nodo siguiente, Nodo anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    //Constructor para cuando no hay nodos
    public Nodo(int dato){
        this(dato, null, null);
    }
}
