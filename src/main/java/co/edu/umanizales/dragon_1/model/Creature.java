package co.edu.umanizales.dragon_1.model;

public abstract class Creature {
    protected String name;
    protected String element;
    protected int powerBase;

    public Creature(String name, String element, int powerBase) {
        this.name = name;
        this.element = element;
        this.powerBase = powerBase;
    }

    public String getName() {
        return name;
    }

    public abstract String usePower();
}
