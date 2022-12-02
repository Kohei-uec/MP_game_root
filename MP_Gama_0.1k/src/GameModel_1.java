import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GameModel_1 implements ActionListener{
    private ArrayList <Player> players;
    private GameView_1 view;
    private javax.swing.Timer timer;
    private int test = 0;
    private int fps = 20;

    public GameModel_1(){
        players = new ArrayList<Player>();
        timer = new javax.swing.Timer(1000/fps, this);
    }
    public void TimerStart(){
        System.out.println("timer start.");
        timer.start();
    }

    public void addPlayer(Chara ch, GameController gc){
        players.add(new Player(ch, gc));
    }
    public void addView(GameView_1 v){
        view = v;
    }

    public ArrayList <Player> getPlayers(){
        return players;
    }

    //毎フレームの更新処理
    public void actionPerformed(ActionEvent e){
        view.setLabel(Integer.toString(test++));
        for (Player pl : players) {
            pl.getController().getState().change_character(pl.getChara());
            pl.getChara().move(new Vector2(1,0));
        }

        view.update();
    }

}

class Player{
    private Chara c;
    private GameController g;
    Player(Chara ch, GameController ga){
        c = ch; g = ga;
    }
    public Chara getChara(){
        return c;
    }
    public GameController getController(){
        return g;
    }
}