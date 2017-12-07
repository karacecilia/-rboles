package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("arbolito.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        /*Arbol arbol = new Arbol();
        Nodo raiz = new Nodo(8);
        Nodo nodo2 = new Nodo(7);
        Nodo nodo3 = new Nodo(9);

        nodo2.setNodoDerecho(new Nodo(3));
        nodo2.setNodoIzquierdo(new Nodo(5));

        nodo3.setNodoDerecho(new Nodo(4));
        nodo3.setNodoDerecho(new Nodo(2));

        raiz.setNodoIzquierdo(nodo2);
        raiz.setNodoDerecho(nodo3);

        System.out.println("PreOrden");
        arbol.preOrden(raiz);
        System.out.print("|");
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("InOrden: ");
        arbol.InOrden(raiz);
        System.out.print("|");
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("PostOrden: ");
        arbol.PostOrden(raiz);
        System.out.print("|");
        System.out.println("-------------------------");*/
    }
        
}