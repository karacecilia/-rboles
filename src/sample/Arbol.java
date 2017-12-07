package sample;

/**
 * Created by Akado on 29/11/2017.
 */
public class Arbol {
    public Nodo nodo;

    public static void preOrden(Nodo raiz) {
        if(raiz != null) {
            System.out.print("| "+raiz.getRaiz()+" ");
            preOrden(raiz.getIzquierda());
            preOrden(raiz.getDerecha());
        }
    }

    public static void InOrden(Nodo raiz) {
        if (raiz != null) {
            InOrden(raiz.getIzquierda());
            System.out.print("| " +raiz.getRaiz()+" ");
            InOrden(raiz.getDerecha());
        }
    }

    public static void PostOrden(Nodo raiz) {
        if (raiz != null) {
            PostOrden(raiz.getIzquierda());
            PostOrden(raiz.getDerecha());
            System.out.print("| "+raiz.getRaiz()+" ");
        }
    }
}