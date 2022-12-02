import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GameMain_1 {
    public static void main(String argv[]){
        GameModel_1 model = new GameModel_1();
        GameView_1 view = new GameView_1(model);
        model.addView(view);
        Chara character4 = new Chara(new Vector2(500,300), Color.pink);
        GameController controller4 = new GameController(model, view, 'w','a','s','d');
        model.addPlayer(character4, controller4);
        view.setBounds(0,0,1280,720);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
        model.TimerStart();
    }
}
