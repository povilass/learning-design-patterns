package module.barista;

public abstract class CaffeineBeverageWithHook {
    public CaffeineBeverageWithHook() {
    }

    void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if(this.customerWantsCondiments()) {
            this.addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}