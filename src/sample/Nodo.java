package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Nodo {
<<<<<<< HEAD
    private Nodo raiz, der, izq;
    public int zise;

=======
    private int raiz;
    private Nodo der, izq;
>>>>>>> origin/uriel

    public  Object valor;
    public Nodo(Object valor) {
        this.valor = valor;
    }
<<<<<<< HEAD
    public int size getzise(){
        return zise;
    }

    public Nodo getRaiz(){
        return raiz;
=======
    public Nodo(int raiz){
        this.raiz = raiz;
>>>>>>> origin/uriel
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
