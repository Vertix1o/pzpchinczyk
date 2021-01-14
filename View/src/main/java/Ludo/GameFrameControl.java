package Ludo;

import com.sun.jdi.Value;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import model.*;


import java.util.ArrayList;
import java.util.List;

public class GameFrameControl {

    @FXML VBox vbox;

    @FXML Pane paneBoard; // contains circle and rectangle

    @FXML Circle circle;

    @FXML Button losuj1;
    @FXML Label label1;

    @FXML Rectangle p1;
    @FXML Rectangle p2;
    @FXML Rectangle p3;
    @FXML Rectangle p4;
    @FXML Rectangle p5;
    @FXML Rectangle p6;
    @FXML Rectangle p7;
    @FXML Rectangle p8;
    @FXML Rectangle p9;
    @FXML Rectangle p10;
    @FXML Rectangle p11;
    @FXML Rectangle p12;
    @FXML Rectangle p13;
    @FXML Rectangle p14;
    @FXML Rectangle p15;
    @FXML Rectangle p16;
    @FXML Rectangle p17;
    @FXML Rectangle p18;
    @FXML Rectangle p19;
    @FXML Rectangle p20;
    @FXML Rectangle p21;
    @FXML Rectangle p22;
    @FXML Rectangle p23;
    @FXML Rectangle p24;
    @FXML Rectangle p25;
    @FXML Rectangle p26;
    @FXML Rectangle p27;
    @FXML Rectangle p28;
    @FXML Rectangle p29;
    @FXML Rectangle p30;
    @FXML Rectangle p31;
    @FXML Rectangle p32;
    @FXML Rectangle p33;
    @FXML Rectangle p34;
    @FXML Rectangle p35;
    @FXML Rectangle p36;
    @FXML Rectangle p37;
    @FXML Rectangle p38;
    @FXML Rectangle p39;
    @FXML Rectangle p40;
    @FXML Rectangle h1;
    @FXML Rectangle h2;
    @FXML Rectangle h3;
    @FXML Rectangle h4;
    @FXML Rectangle h5;
    @FXML Rectangle h6;
    @FXML Rectangle h7;
    @FXML Rectangle h8;
    @FXML Rectangle h9;
    @FXML Rectangle h10;
    @FXML Rectangle h11;
    @FXML Rectangle h12;
    @FXML Rectangle h13;
    @FXML Rectangle h14;
    @FXML Rectangle h15;
    @FXML Rectangle h16;
    @FXML Circle c1;
    @FXML Circle c2;
    @FXML Circle c3;
    @FXML Circle c4;
    @FXML Circle c5;
    @FXML Circle c6;
    @FXML Circle c7;
    @FXML Circle c8;
    @FXML Circle c9;
    @FXML Circle c10;
    @FXML Circle c11;
    @FXML Circle c12;
    @FXML Circle c13;
    @FXML Circle c14;
    @FXML Circle c15;
    @FXML Circle c16;


    @FXML Group homeGroup;
    @FXML Group rectGroup;
    @FXML Group circGroup;
    @FXML MenuItem players2Button;
    @FXML MenuItem players3Button;
    @FXML MenuItem players4Button;


    private Board board;
    private Move move;
    private List<Rectangle> rectangles = new ArrayList<>();
    private List<Rectangle> homes = new ArrayList<>();
    private List<Circle> circles = new ArrayList<>();
    private List<Field> fields;

    public GameFrameControl() {

    }

    @FXML
    public void initialize() {
        rectangles.add(p1);
        rectangles.add(p2);
        rectangles.add(p3);
        rectangles.add(p4);
        rectangles.add(p5);
        rectangles.add(p6);
        rectangles.add(p7);
        rectangles.add(p8);
        rectangles.add(p9);
        rectangles.add(p10);
        rectangles.add(p11);
        rectangles.add(p12);
        rectangles.add(p13);
        rectangles.add(p14);
        rectangles.add(p15);
        rectangles.add(p16);
        rectangles.add(p17);
        rectangles.add(p18);
        rectangles.add(p19);
        rectangles.add(p20);
        rectangles.add(p21);
        rectangles.add(p22);
        rectangles.add(p23);
        rectangles.add(p24);
        rectangles.add(p25);
        rectangles.add(p26);
        rectangles.add(p27);
        rectangles.add(p28);
        rectangles.add(p29);
        rectangles.add(p30);
        rectangles.add(p31);
        rectangles.add(p32);
        rectangles.add(p33);
        rectangles.add(p34);
        rectangles.add(p35);
        rectangles.add(p36);
        rectangles.add(p37);
        rectangles.add(p38);
        rectangles.add(p39);
        rectangles.add(p40);
        homes.add(h1);
        homes.add(h2);
        homes.add(h3);
        homes.add(h4);
        homes.add(h5);
        homes.add(h6);
        homes.add(h7);
        homes.add(h8);
        homes.add(h9);
        homes.add(h10);
        homes.add(h11);
        homes.add(h12);
        homes.add(h13);
        homes.add(h14);
        homes.add(h15);
        homes.add(h16);
        circles.add(c1);
        circles.add(c2);
        circles.add(c3);
        circles.add(c4);
        circles.add(c5);
        circles.add(c6);
        circles.add(c7);
        circles.add(c8);
        circles.add(c9);
        circles.add(c10);
        circles.add(c11);
        circles.add(c12);
        circles.add(c13);
        circles.add(c14);
        circles.add(c15);
        circles.add(c16);


        System.out.println(rectangles.size());

//        paneBoard.addEventFilter(MouseEvent.MOUSE_EXITED, this::leaveBoard);
//        paneBoard.addEventFilter(MouseEvent.MOUSE_RELEASED, this::checkReleaseOutOfBoard);
    }

    public void throwDice(ActionEvent event) {

//        label1.setText("Gracz 1. wylosował: " + );

    }

    public void setGamePlayers(ActionEvent event) {
        MenuItem button = (MenuItem) event.getSource();

        if(button.getId().equals("players2Button")) {
            board = new Board(2);
        } else if(button.getId().equals("players3Button")) {
            board = new Board(3);
        } else if(button.getId().equals("players4Button")) {
            board = new Board(4);
        }
    }

    private void setPawn(int from, int to) {
        circles.get(from).setLayoutX(homes.get(to).getLayoutX());
        circles.get(from).setLayoutY(homes.get(to).getLayoutY());
    }

    private void movePiece() {

    }
}
