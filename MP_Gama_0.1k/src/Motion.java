public class Motion {
    protected int time;
    protected Pose[] poses;
    protected Vector2[] head;

    public Motion(int time){
        poses = new Pose[time];
        head = new Vector2[time];
        this.time = 0;
    }

    //getter
    public Pose getPose(int t){
        return poses[t];
    }
    public Vector2 getMoveVector(){
        return head[time];
    }
    public int getTime(){
        return time;
    }

    public void update(){
        time++;
        if(time>=poses.length){time=0;}
    }
}

class M_neutral extends Motion{
    M_neutral(){
        super(1);
        poses[0] = new Pose();
    }
}
