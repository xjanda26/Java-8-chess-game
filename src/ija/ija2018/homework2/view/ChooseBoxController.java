package ija.ija2018.homework2.view;

import ija.ija2018.homework2.common.Field;
import ija.ija2018.homework2.common.Figure;
import ija.ija2018.homework2.game.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Adam Janda xjanda26@stud.fit.vutbr.cz
 * */

public class ChooseBoxController implements Initializable {
    @FXML  Button btnWRook;
    @FXML  Button btnWKnight;
    @FXML  Button btnWBishop;
    @FXML  Button btnWQueen;

    @FXML ImageView imageWRook;
    @FXML ImageView imageWKnight;
    @FXML ImageView imageWBishop;
    @FXML ImageView imageWQueen;

    @FXML  Button btnBRook;
    @FXML  Button btnBKnight;
    @FXML  Button btnBBishop;
    @FXML  Button btnBQueen;

    @FXML ImageView imageBRook;
    @FXML ImageView imageBKnight;
    @FXML ImageView imageBBishop;
    @FXML ImageView imageBQueen;

    @FXML  Button btnConfirm;

    private Board board;
    private Figure figure;
    private Stage stage;

    private int desCol;
    private int desRow;

    /**
     * Inicializuje obrázky pre tlačítka výberu nových figúrok.
     * @param location Lokacia
     * @param resources Zdroje
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imageWRook.setImage(new Image("file:lib/white-rook.png"));
        imageWKnight.setImage(new Image("file:lib/white-knight.png"));
        imageWBishop.setImage(new Image("file:lib/white-bishop.png"));
        imageWQueen.setImage(new Image("file:lib/white-queen.png"));


        imageBRook.setImage(new Image("file:lib/black-rook.png"));
        imageBKnight.setImage(new Image("file:lib/black-knight.png"));
        imageBBishop.setImage(new Image("file:lib/black-bishop.png"));
        imageBQueen.setImage(new Image("file:lib/black-queen.png"));
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky bielej veže.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionWRook (ActionEvent event){
        if (figure.getColor() == Field.Color.W) {
            Figure newFigure = new Rook(Field.Color.W);
            newFigure.setCoords(this.desCol, this.desRow);

            Field some = board.getField(this.desCol, this.desRow);
            some.setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky biele jazdca.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionWKnight (ActionEvent event){
        if (figure.getColor() == Field.Color.W) {
            Figure newFigure = new Knight(Field.Color.W);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }

    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky bieleho strelca.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionWBishop (ActionEvent event){
        if (figure.getColor() == Field.Color.W) {
            Figure newFigure = new Bishop(Field.Color.W);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky bielej kráľovnej.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionWQueen (ActionEvent event){
        if (figure.getColor() == Field.Color.W) {
            Figure newFigure = new Queen(Field.Color.W);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }

    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky čiernej veže.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionBRook (ActionEvent event){
        if (figure.getColor() == Field.Color.B) {
            Figure newFigure = new Rook(Field.Color.B);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky čierneho jazdca.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionBKnight (ActionEvent event){
        if (figure.getColor() == Field.Color.B) {
            Figure newFigure = new Knight(Field.Color.B);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky čierneho strelca.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionBBishop (ActionEvent event){
        if (figure.getColor() == Field.Color.B) {
            Figure newFigure = new Bishop(Field.Color.B);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Implementácia po slačení tlačítka pri výbere figúrky čiernej kráľovnej.
     * Po pridelení novej figúrky do hracej plochy, zatvorí okno výberu.
     * @param event Udalost
     */
    @FXML public void actionBQueen (ActionEvent event){
        if (figure.getColor() == Field.Color.B) {
            Figure newFigure = new Queen(Field.Color.B);
            newFigure.setCoords(this.desCol, this.desRow);

            board.getField(this.desCol, this.desRow).setFigure(newFigure);
            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Nastaví dáta hracej plochy, na ktorej zmena má byť vykonaná, figúrky na miesto ktorej má byť nastavená nová
     * a súradnice, na ktoré má byť nová figúrka postavená.
     * @param board Hracia doska
     * @param movingFigure Figurka, ktora je pohybovana
     * @param col Stlpec
     * @param row Riadok
     */
    public void setChangeFigure (Board board, Figure movingFigure, int col, int row){
        this.board = board;
        this.figure = movingFigure;
        this.desCol = col;
        this.desRow = row;
    }
}
