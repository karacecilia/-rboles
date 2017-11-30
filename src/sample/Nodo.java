package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Nodo {
    private Nodo raiz, der, izq;

    public  Object valor;
    public Nodo(Object valor) {
        this.valor = valor;
    }
    public Nodo getRaiz(){
        return raiz;
    }

    public Nodo getDer(){
        return der;
    }

    public Nodo getIzq(){
        return izq;
    }

    public Object getValor(){
        return valor;
    }


    public  int getValorInt(){
        return Integer.parseInt(valor.toString());
    }

    public void setRaiz(Nodo raiz){
        this.raiz=raiz;

    }


    public  void setDer(Nodo derecha){
        this.der=derecha;

    }

    public void setIzq(Nodo izquierdo){
        this.izq=izquierdo;
    }
    public void setValor(Object valor){
        this.valor=valor;
    }

    public Nodo getBrother(){
        return raiz.getRaiz().getDer();
    }
}
