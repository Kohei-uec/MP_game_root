public class Pose{
    protected Vector2 armR0,armR1,armL0,armL1,legR0,legR1,legL0,legL1,neck,hip;

    public Pose(){
        armR0 = new Vector2(-20, 40);
        armR1 = new Vector2(-20, 60);
        armL0 = new Vector2(10, 40);
        armL1 = new Vector2(20, 60);
        legR0 = new Vector2(-20, 80);
        legR1 = new Vector2(-20, 100);
        legL0 = new Vector2(10, 80);
        legL1 = new Vector2(20, 100);
        neck = new Vector2(0, 20);
        hip = new Vector2(0, 60);
    }
    public Pose(Vector2 armR0, Vector2 armR1, Vector2 armL0, Vector2 armL1, Vector2 legR0, Vector2 legR1, Vector2 legL0, Vector2 legL1, Vector2 neck, Vector2 hip){
        this.armR0 = armR0;
        this.armR1 = armR1;
        this.armL0 = armL0;
        this.armL1 = armL1;
        this.legR0 = legR0;
        this.legR1 = legR1;
        this.legL0 = legL0;
        this.legL1 = legL1;
        this.neck = neck;
        this.hip = hip;
    }
    public Vector2 getArmR0(){
        return armR0;
    }
    public Vector2 getArmR1(){
        return armR1;
    }
    public Vector2 getArmL0(){
        return armL0;
    }
    public Vector2 getArmL1(){
        return armL1;
    }
    public Vector2 getLegR0(){
        return legR0;
    }
    public Vector2 getLegR1(){
        return legR1;
    }
    public Vector2 getLegL0(){
        return legL0;
    }
    public Vector2 getLegL1(){
        return legL1;
    }
    public Vector2 getNeck(){
        return neck;
    }
    public Vector2 getHip(){
        return hip;
    }
}