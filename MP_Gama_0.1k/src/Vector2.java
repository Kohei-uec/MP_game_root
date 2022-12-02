public class Vector2{
    protected int x;
    protected int y;

    public Vector2(){
        this(0,0);
    }
    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void add(Vector2 v){
        this.x += v.x;
        this.y += v.y;
    }
    public void mul(Vector2 v){
        this.x *= v.x;
        this.y *= v.y;
    }
    public boolean equals(Vector2 other){
        return (this.x == other.x && this.y == other.y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}