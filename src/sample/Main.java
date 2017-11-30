package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //launch(args);
        Árbol arbol = new Árbol();
        Nodo raiz = new Nodo(8);
        Nodo nodo1 = new Nodo(7);
        Nodo nodo2 = new Nodo(9);

        nodo1.setIzq(new Nodo(3));
        nodo1.setDer(new Nodo(5));

        nodo2.setDer(new Nodo(4));
        nodo2.setIzq(new Nodo(2));
        
    }
}
