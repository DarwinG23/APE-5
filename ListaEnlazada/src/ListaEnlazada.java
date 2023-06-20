
public class ListaEnlazada {
    Nodo cabeza;
    int size;

    public ListaEnlazada(){
        this.cabeza = null;
        this.size = 0;
    }

    //Agregar un nodo al principio de la lista
    public void AgregarNodo(int dato){
        if(cabeza == null){
            cabeza = new Nodo(dato);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = temp;
            cabeza = nuevo;
        }
        size++;
    }
    //Insertar un nodo en una posición específica
    public void insertNodo(int dato, int index){
        if(index < 0 || index > size){
            System.out.println("No se puede insertar el nodo en la posición " + index);
        }else{
            if(index == 0){
                AgregarNodo(dato);
            }else{
                Nodo temp = cabeza;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.siguiente;
                }
                Nodo nuevo = new Nodo(dato);
                nuevo.siguiente = temp.siguiente;
                temp.siguiente = nuevo;
                size++;
            }
        }
    }

    //Eliminar un nodo especifico
    public void eliminarNodo(int index){
        if(index < 0 || index >= size){
            System.out.println("No se puede eliminar el nodo en la posición " + index);
        }else{
            if(index == 0){
                cabeza = cabeza.siguiente;
            }else{
                Nodo temp = cabeza;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.siguiente;
                }
                temp.siguiente = temp.siguiente.siguiente;
            }
            size--;
        }
    }

    //MostrarLista
    public void mostrarLista(){
        if(cabeza == null){
            System.out.println("La lista está vacía");
        }else{
            Nodo temp = cabeza;
            while(temp != null){
                System.out.print(temp.dato + " -> ");
                temp = temp.siguiente;
            }
            System.out.println("null");
        }
    }

}
