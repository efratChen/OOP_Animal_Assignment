/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Cat extends Animal implements Land {

    private int numberOfLegs;

    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        switch (mood) {
            case MOOD_HAPPY:
                System.out.println("purr, purr");
                break;
            case MOOD_SCARE:
                System.out.println("hiss");
                break;
            default:
                System.out.println("meow~");
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
