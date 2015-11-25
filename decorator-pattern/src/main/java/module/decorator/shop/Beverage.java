package module.decorator.shop;

/**
 * Created by Povilas on 2015.07.29.
 */
public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI}

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
