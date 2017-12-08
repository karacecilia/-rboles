package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Nodo {
<<<<<<< HEAD
=======
    public Nodo raiz = null;
    public Nodo derecha, izquierda;
    public  Object valor;

    public Nodo(Object valor) {
        this.valor = valor;
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo raiz){
        this.raiz=raiz;

    }

    public Nodo getDerecha(){
        return derecha;
    }

    public Nodo getIzquierda(){
        return izquierda;
    }

    public Object getValor(){
        return valor;
    }

    public void setValor(Object valor){
        this.valor=valor;
    }

    public  int getValorInt(){
        return Integer.parseInt(valor.toString());
    }

    public  void setDerecha(Nodo derecha){
        this.derecha =derecha;

    }

    public void setIzquierda(Nodo izquierdo){
        this.izquierda =izquierdo;
    }
>>>>>>> origin/Rama-Antonio


}
