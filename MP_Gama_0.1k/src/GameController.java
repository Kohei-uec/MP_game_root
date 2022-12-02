import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameController implements KeyListener{
    private GameModel_1 model;
    private GameView_1 view;
    private Controller_state state;
    private char w,a,s,d;
    
    public GameController(GameModel_1 m, GameView_1 v){
        this(m, v,'w','a','s','d');
    }
    public GameController(GameModel_1 m, GameView_1 v, char w, char a, char s, char d){
        model = m;
        view = v;
        this.w = w;
        this.a = a;
        this.s = s;
        this.d = d;
        v.getPanel().addKeyListener(this);
        state = new C_Neutral();
    }
    public Controller_state getState(){
        return state;
    }

    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        char c = e.getKeyChar();
        if(c == w ||c == a ||c == s ||c == d ){
            state = new C_Neutral();
        }
    }
    public void keyPressed(KeyEvent e){
        char c = e.getKeyChar();
        if(c == w){
            state = new C_Up();
        }else if(c == a){
            state = new C_Left();
        }else if(c == s){
            state = new C_Down();
        }else if(c == d){
            state = new C_Right();
        }
    }
}
