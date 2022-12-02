class Controller_state{
	public void change_character(Chara c){}
}
class C_Neutral extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change N");
    }
}
class C_Right extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change R");
    }
}
class C_Left extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change L");
    }
}
class C_Up extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change U");
    }
}
class C_Down extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change D");
    }
}
class C_Attack_Neutral extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change AN");
    }
}
class C_Attack_Right extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change AR");
    }
}
class C_Attack_Left extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change AL");
    }
}
class C_Attack_Up extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change AU");
    }
}
class C_Attack_Down extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change AD");
    }
}
class C_Guard extends Controller_state{
    public void change_character(Chara c){
        System.out.println("change G");
    }
}
