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
    @FXML Rectangle f1;
    @FXML Rectangle f2;
    @FXML Rectangle f3;
    @FXML Rectangle f4;
    @FXML Rectangle f5;
    @FXML Rectangle f6;
    @FXML Rectangle f7;
    @FXML Rectangle f8;
    @FXML Rectangle f9;
    @FXML Rectangle f10;
    @FXML Rectangle f11;
    @FXML Rectangle f12;
    @FXML Rectangle f13;
    @FXML Rectangle f14;
    @FXML Rectangle f15;
    @FXML Rectangle f16;
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
    @FXML Circle h1;
    @FXML Circle h2;
    @FXML Circle h3;
    @FXML Circle h4;
    @FXML Circle h5;
    @FXML Circle h6;
    @FXML Circle h7;
    @FXML Circle h8;
    @FXML Circle h9;
    @FXML Circle h10;
    @FXML Circle h11;
    @FXML Circle h12;
    @FXML Circle h13;
    @FXML Circle h14;
    @FXML Circle h15;
    @FXML Circle h16;

    @FXML Group homeGroup;
    @FXML Group rectGroup;
    @FXML Group circGroup;
    @FXML MenuItem players2Button;
    @FXML MenuItem players3Button;
    @FXML MenuItem players4Button;

    private Board board;
    private Move move;
    private List<Rectangle> rectangles = new ArrayList<>();
//    private List<List<Rectangle>> finishes = new ArrayList<>();
//    private List<List<Circle>> homes = new ArrayList<>();
//    private List<List<Circle>> circles = new ArrayList<>();
    private ArrayList<ArrayList<Rectangle>> finishes = new ArrayList<>(4);
    private ArrayList<ArrayList<Circle>> homes = new ArrayList<>(4);
    private ArrayList<ArrayList<Circle>> circles = new ArrayList<>(4);

    private int playerIterator;
    private int numberOfPlayers;


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

        for(int i = 0; i < 4; i++) {
            homes.add(new ArrayList<>());
            finishes.add(new ArrayList<>());
            circles.add(new ArrayList<>());
        }
        homes.get(0).add(h1);
        homes.get(0).add(h2);
        homes.get(0).add(h3);
        homes.get(0).add(h4);
        homes.get(1).add(h5);
        homes.get(1).add(h6);
        homes.get(1).add(h7);
        homes.get(1).add(h8);
        homes.get(2).add(h9);
        homes.get(2).add(h10);
        homes.get(2).add(h11);
        homes.get(2).add(h12);
        homes.get(3).add(h13);
        homes.get(3).add(h14);
        homes.get(3).add(h15);
        homes.get(3).add(h16);
        circles.get(0).add(c1);
        circles.get(0).add(c2);
        circles.get(0).add(c3);
        circles.get(0).add(c4);
        circles.get(1).add(c5);
        circles.get(1).add(c6);
        circles.get(1).add(c7);
        circles.get(1).add(c8);
        circles.get(2).add(c9);
        circles.get(2).add(c10);
        circles.get(2).add(c11);
        circles.get(3).add(c12);
        circles.get(3).add(c13);
        circles.get(3).add(c14);
        circles.get(3).add(c15);
        circles.get(3).add(c16);
        finishes.get(0).add(f1);
        finishes.get(0).add(f2);
        finishes.get(0).add(f3);
        finishes.get(0).add(f4);
        finishes.get(1).add(f5);
        finishes.get(1).add(f6);
        finishes.get(1).add(f7);
        finishes.get(1).add(f8);
        finishes.get(2).add(f9);
        finishes.get(2).add(f10);
        finishes.get(2).add(f11);
        finishes.get(2).add(f12);
        finishes.get(3).add(f13);
        finishes.get(3).add(f14);
        finishes.get(3).add(f15);
        finishes.get(3).add(f16);

        System.out.println(rectangles.size());

    }

    public void throwDice(ActionEvent event) {
        int randomNumber = 0;
        int tura = 0;

        if(playerIterator == numberOfPlayers) {
            playerIterator = 0;
        }
        String x = String.valueOf(playerIterator + 1);
        while(randomNumber < 6 || tura < 3) {
            randomNumber = move.roll();
            label1.setText("Gracz " + x + ". wylosował: " + randomNumber);
//            move();
            if(randomNumber < 6) {
                playerIterator++;
                break;
            } else {
                tura++;
            }
        }
    }

    public void setGamePlayers(ActionEvent event) {
        MenuItem button = (MenuItem) event.getSource();

        if(button.getId().equals("players2Button")) {
            board = new Board(2);
            numberOfPlayers = 2;
        } else if(button.getId().equals("players3Button")) {
            board = new Board(3);
            numberOfPlayers = 3;
        } else if(button.getId().equals("players4Button")) {
            board = new Board(4);
            numberOfPlayers = 4;
        }
        move = new Move(board);
    }

    private void setPawnToHome(int from, int to) {
        circles.get(from).setLayoutX(homes.get(to).getLayoutX()+15);
        circles.get(from).setLayoutY(homes.get(to).getLayoutY()+15);
    }

    private void setPawnToField(int from, int to) {
        circles.get(from).setLayoutX(rectangles.get(to).getLayoutX()+15);
        circles.get(from).setLayoutY(rectangles.get(to).getLayoutY()+15);
    }

    private void setPawnToFinish(int from, int to) {
        circles.get(from).setLayoutX(finishes.get(to).getLayoutX()+15);
        circles.get(from).setLayoutY(finishes.get(to).getLayoutY()+15);
    }

    private void update() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    circles.get(i).get(j).setFill("");
                } else if (i == 1) {
                    circles.get(i).get(j).setFill("");
                } else if (i == 2) {
                    circles.get(i).get(j).setFill("");
                } else if (i == 3) {
                    circles.get(i).get(j).setFill("");
                }
            }
        }
    }

    private void move(int from, int to) {
        if(playerIterator == 0) {

        }
    }
}
