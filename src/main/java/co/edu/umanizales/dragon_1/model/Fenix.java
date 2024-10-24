package co.edu.umanizales.dragon_1.model;

public class Fenix extends Creature {
    private int rebirthCount;

    public Fenix(String name, String element, int powerBase, int rebirthCount) {
        super(name, element, powerBase);
        this.rebirthCount = rebirthCount;
    }

    @Override
    public String usePower() {
        return name + " rises from the ashes, reborn " + rebirthCount + " times!";
    }
}

