package TheStaticFactoryMethod;

//可以减少对外暴露的属性
public class example2 {
}

class Player{
    public static int TYPE_RUNNER = 0;
    public static int TYPE_SWIMMER = 1;
    public static int TYPE_JUMPER = 2;
    protected int type;

    private Player(int type){
        this.type = type;
    }

    public Player newRunner(int type){
        return new Player(TYPE_RUNNER);
    }

    public Player newSwimmer(int type){
        return new Player(TYPE_SWIMMER);
    }

    public Player newJumper(int type){
        return new Player(TYPE_JUMPER);
    }
}
