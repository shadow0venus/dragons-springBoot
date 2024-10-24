package co.edu.umanizales.dragon_1.model;

public class Chimera extends Creature {
    private int numberOfHeads;

    public Chimera(String name, String element, int powerBase, int numberOfHeads) {
        super(name, element, powerBase);
        this.numberOfHeads = numberOfHeads;
    }

    @Override
    public String usePower() {
        return name + " attacks with " + numberOfHeads + " heads!";
    }
}
