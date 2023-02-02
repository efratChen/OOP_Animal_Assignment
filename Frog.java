/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Frog extends Animal implements Water, Land {

    private int numberOfLegs;

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello(int mood) {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("quack quack quack");
                break;
            case MOOD_SCARE:
                System.out.println("plop into the water");
                break;
            default:
                break;
        }
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

}
