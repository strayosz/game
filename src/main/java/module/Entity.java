package module;

public class Entity {
    protected String name;
    protected int corX;
    protected int corY;
    protected int steps = 0;

    public Entity() {}

    public Entity(String name, int corX, int corY) {
        this.name = name;
        this.corX = corX;
        this.corY = corY;
    }

    public String getName() {
        return name;
    }

    public int getCorX() {
        return corX;
    }

    public int getCorY() {
        return corY;
    }

    public int getSteps() {
        return steps;
    }
    public void move() {}
}
