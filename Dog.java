/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Dog extends Animal implements Land {

    private int numberOfLegs;

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("bark loudly");
                break;
            case MOOD_SCARE:
                System.out.println("whooping");
                break;
            default:
                System.out.println("wagging their tais");
                break;
        }
    }

    @Override
    public void sayHello(int mood) {
        this.mood = mood;
        this.sayHello();
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

}
