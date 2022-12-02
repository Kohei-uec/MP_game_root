import java.awt.*;

public class Chara {
    protected Vector2 head;
    protected Pose pose;
    protected Motion motion;
    protected Color color;

    public Chara(Vector2 v, Color c){
        head = new Vector2();
        head.x = v.x;
        head.y = v.y;
        motion = new M_neutral();
        pose = motion.getPose(0);
        color = c;
    }
    public Vector2 getHead(){
        return head;
    }
    public Pose getPose(){
        return pose;
    }
    public Motion getMotion(){
        return motion;
    }
    public Color getColor(){
        return color;
    }

    //あとでprivateにする
    public void move(Vector2 v){
        head.add(v);
    }
}
