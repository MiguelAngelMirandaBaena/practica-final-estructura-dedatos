package lcse;

import javax.swing.*;

public class ListaCircularSimplementeEnlazada {
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    //metodo constructor
    public ListaCircularSimplementeEnlazada(){
        primero = null;
        ultimo = null;
        tamaño = 0;

    }
    //metodo esta vacio
    public boolean estaVacia(){
        return primero == null;
    }
    //Consulta cuantos elementos (nodos) tiene la lista.
    public int getTamaño(){
        return tamaño;
    }

    //*metodo insertar
    public void insertarFinal(int dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (estaVacia()){
            primero = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(primero);
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }
        tamaño++;
    }
    //metodo eliminar
    public void eliminarFinal(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamaño){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                primero = primero.getSiguiente();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                ultimo.setSiguiente(primero);
            }
            // En caso que el nodo a eliminar este por el medio
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = primero;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(primero);
                    ultimo = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSiguiente();
                    // Enlaza el nodo anterior al de eliminar con el
                    // sguiente despues de el.
                    aux.setSiguiente(siguiente.getSiguiente());
                    // Actualizamos el puntero del ultimo nodo
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamaño--;
        }
    }

    //metodo de mostrar
    public void mostrar(){
        if (!estaVacia()) {
            Nodo aux = primero;
            int i = 0;
            System.out.print(" -> ");
            do{
                System.out.print( i + ".[ " + aux.getDato() + " ]" + "  " + "->"+ "  " );
                aux = aux.getSiguiente();
                i++;
            }while(aux != primero);

            System.out.println();

        }
    }
    //metodo de mostrar circular


}

