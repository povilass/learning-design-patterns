package module.sort;

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return this.name + " weighs " + this.weight;
    }


    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;
        return this.weight < otherDuck.weight?-1:(this.weight == otherDuck.weight?0:1);
    }
}