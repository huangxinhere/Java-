import java.io.IOException;
import java.util.logging.Logger;

interface Power//不要在这加括号
{
    public void usePower();
}

public class superHero {
    public static void main(String[] args)
    {
        Batman b = new Batman();
        wonderWoman w = new wonderWoman();
        b.usePower();
        w.usePower();
        Logger.getGlobal().info("");
    }
}


class selfException extends IOException {
    public selfException() {
    }

    public selfException(String gripe) {
        super(gripe);
    }
}

abstract class Hero implements Power {
    public void usePower() {
    }

    ;
}

class Batman extends Hero {
    public void usePower()//"overridden method does not throw 'selfException'"重写的方法不引发‘selfException’
    {
        System.out.println("I am the Batman.I can fly!");
    }
}

class wonderWoman extends Hero {
    public void usePower() {
        System.out.println("I am the wonder woman.I will bit you.");
    }
}
