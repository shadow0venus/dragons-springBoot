package co.edu.umanizales.dragon_1.model;

public class Dragon extends Creature {
    private int fireLevel;

    public Dragon(String name, String element, int powerBase, int fireLevel) {
        super(name, element, powerBase);
        this.fireLevel = fireLevel;
    }

    @Override
    public String usePower() {
        return name + " unleashes a fire attack with level " + fireLevel + "!";
    }
}
