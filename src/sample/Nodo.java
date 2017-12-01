package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Nodo {
    private int raiz;
    private Nodo der, izq;

    public  Object valor;
    public Nodo(Object valor) {
        this.valor = valor;
    }
    public Nodo(int raiz){
        this.raiz = raiz;
    }

    public Nodo getDer(){
        return der;
    }

    public Nodo getIzq(){
        return izq;
    }

    public void setNodoDerecho(Nodo nodo){
        der = nodo;
    }
    public void setNodoIzquierdo(Nodo nodo){
        izq = nodo;
    }

    //Para obtener el dato
    public int getRaiz(){
        return raiz;
    }
}
