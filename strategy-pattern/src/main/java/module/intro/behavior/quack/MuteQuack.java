package module.intro.behavior.quack;

/**
 * Created by Povilas on 2015.06.25.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
