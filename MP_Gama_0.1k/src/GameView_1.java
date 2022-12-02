import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GameView_1 extends JFrame{
    protected GameModel_1 model;
    protected GameViewPanel_1 panel;
    JLabel label;

    public GameView_1(GameModel_1 m){
        model = m;
        panel = new GameViewPanel_1();
        this.add(panel,BorderLayout.CENTER);
    }

    class GameViewPanel_1 extends JPanel{
        public GameViewPanel_1(){
            label = new JLabel("Hello!");
            this.add(label);
            this.setFocusable(true);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            this.drawHuman(g);
        }
        public void drawHuman(Graphics g){
            for(Player player: model.getPlayers()){
                Chara c = player.getChara();
                int v_x = c.getHead().getX();
                int v_y = c.getHead().getY();
                Pose p = c.getPose();
                g.setColor(c.color);
                g.drawOval(v_x-20,v_y-20,40,40);
                g.drawLine(p.getNeck().getX()+v_x,p.getNeck().getY()+v_y,p.getHip().getX()+v_x,p.getHip().getY()+v_y);
                g.drawLine(p.getNeck().getX()+v_x,p.getNeck().getY()+v_y,p.getArmR0().getX()+v_x,p.getArmR0().getY()+v_y);
                g.drawLine(p.getArmR0().getX()+v_x,p.getArmR0().getY()+v_y,p.getArmR1().getX()+v_x,p.getArmR1().getY()+v_y);
                g.drawLine(p.getNeck().getX()+v_x,p.getNeck().getY()+v_y,p.getArmL0().getX()+v_x,p.getArmL0().getY()+v_y);
                g.drawLine(p.getArmL0().getX()+v_x,p.getArmL0().getY()+v_y,p.getArmL1().getX()+v_x,p.getArmL1().getY()+v_y);
                g.drawLine(p.getHip().getX()+v_x,p.getHip().getY()+v_y,p.getLegR0().getX()+v_x,p.getLegR0().getY()+v_y);
                g.drawLine(p.getLegR0().getX()+v_x,p.getLegR0().getY()+v_y,p.getLegR1().getX()+v_x,p.getLegR1().getY()+v_y);
                g.drawLine(p.getHip().getX()+v_x,p.getHip().getY()+v_y,p.getLegL0().getX()+v_x,p.getLegL0().getY()+v_y);
                g.drawLine(p.getLegL0().getX()+v_x,p.getLegL0().getY()+v_y,p.getLegL1().getX()+v_x,p.getLegL1().getY()+v_y);
            }
        } 
    }
    public void setLabel(String s){
        label.setText(s);
    }
    public void update(){
        panel.repaint();
    }
    public JPanel getPanel(){
        return panel;
    }
}

