public class ListaDoblementeEnlazada{
    private Nodo inicio;
    private Nodo fin;

    //constructor
    public ListaDoblementeEnlazada(){
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //Metodo para agregar nodos al final
    public void agregarNodo(int dato){
        if(!estaVacia()){
            fin = new Nodo(dato, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new Nodo(dato);
        }
    }
    //Metodo para insertar un nodo en cualquier posicion
    public void insertarNodo(int dato, int pos){
        if(!estaVacia()){
            if(pos <= contarNodos() + 1){
                if(pos == 1){
                    inicio = new Nodo(dato, inicio, null);
                    inicio.siguiente.anterior = inicio;
                }else if(pos == contarNodos() + 1){
                    fin = new Nodo(dato, null, fin);
                    fin.anterior.siguiente = fin;
                }else{
                    Nodo aux = inicio;
                    int cont = 1;
                    while(cont < pos - 1){
                        aux = aux.siguiente;
                        cont++;
                    }
                    Nodo nuevo = new Nodo(dato);
                    nuevo.siguiente = aux.siguiente;
                    aux.siguiente.anterior = nuevo;
                    aux.siguiente = nuevo;
                    nuevo.anterior = aux;
                }
            }else{
                System.out.println("La posicion excede el numero de nodos");
            }
        }else{
            inicio = fin = new Nodo(dato);
        }
    }



    //Metodo para eliminar un nodo en cualquier posicion
    public void eliminarNodo(int pos){
        if(!estaVacia()){
            if(pos <= contarNodos()){
                if(pos == 1){
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                }else{
                    Nodo aux = inicio;
                    int cont = 1;
                    while(cont < pos - 1){
                        aux = aux.siguiente;
                        cont++;
                    }
                    aux.siguiente = aux.siguiente.siguiente;
                    aux.siguiente.anterior = aux;
                }
            }else{
                System.out.println("La posicion excede el numero de nodos");
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }

    //Metodo para mostrar la lista
    public void mostrarLista(){
        if(!estaVacia()){
            Nodo aux = inicio;
            int i = 1;
            while(aux != null){
                System.out.println("Nodo " + i + ": " + aux.dato);
                aux = aux.siguiente;
                i++;
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    //Metodo para contar los nodos de la lista
    public int contarNodos(){
        if(!estaVacia()){
            Nodo aux = inicio;
            int cont = 0;
            while(aux != null){
                aux = aux.siguiente;
                cont++;
            }
            return cont;
        }else{
            return 0;
        }
    }

}
