package module.adapter.version1.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.rand = new Random();
    }

    public void gobble() {
        this.duck.quack();
    }

    public void fly() {
        if(this.rand.nextInt(5) == 0) {
            this.duck.fly();
        }

    }
}