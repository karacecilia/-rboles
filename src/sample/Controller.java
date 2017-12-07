package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public int size=0;
    Arbol arbol;
    Nodo raiz;
    @FXML
    TextField ingresarTxt;
    @FXML
    Button ingresarBtn;
    @FXML
    VBox arbolVBX;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ingresarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                arbolVBX.setAlignment(Pos.TOP_CENTER);
                arbolVBX.getChildren().clear();
                if (raiz == null) {
                    raiz = new Nodo(ingresarTxt.getText());
                }else {
                    Nodo nodo = new Nodo(ingresarTxt.getText());
                    insertar(nodo,raiz);
                }
                arbolVBX.getChildren().add(CreateThree(raiz));
            }
        });
    }
    public VBox CreateThree(Nodo temp){
        VBox caja1 = new VBox();
        Label hoja = new Label(temp.getValorInt()+"");
        HBox caja2 = new HBox();
        caja1.setSpacing(10);
        caja1.setAlignment(Pos.TOP_CENTER);
        caja2.setSpacing(10);
        caja2.setAlignment(Pos.TOP_CENTER);
        boolean ifHoja = false;
        if (temp.getIzquierda() != null){
            caja2.getChildren().add(CreateThree(temp.getIzquierda()));
            ifHoja = true;
        }
        if (temp.getDerecha() != null){
            caja2.getChildren().add(CreateThree(temp.getDerecha()));
            ifHoja = true;
        }
        caja1.getChildren().add(hoja);
        if (ifHoja) {
            caja1.getChildren().add(caja2);
        }
        return caja1;
    }
    public void insertar(Nodo valor, Nodo temp){
        System.out.println(raiz.getValor().toString());
        if (valor.getValorInt() <= temp.getValorInt()){
            if (temp.getIzquierda() == null){
                temp.setIzquierda(valor);
            }else{
                insertar(valor,temp.getIzquierda());
            }
        }else{
            if (temp.getDerecha() == null){
                temp.setDerecha(valor);
            }else{
                insertar(valor,temp.getDerecha());
            }
        }
    }
}