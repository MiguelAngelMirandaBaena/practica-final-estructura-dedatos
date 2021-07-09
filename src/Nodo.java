package lcse;


public class Nodo {

    private int dato;
    private Nodo siguiente;

    //metodo constructor
    public void Nodo(){
        this.setDato(0);
        this.setSiguiente(null);

    }


    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

