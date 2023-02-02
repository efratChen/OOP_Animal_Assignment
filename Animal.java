/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//abstract class - common functionality, ensures that most of the code are written using abstract and higher level classes, it can leverage Inheritance and Polymorphism to support future changes.
abstract class Animal {

    private boolean mammals;
    private boolean carnivorous;
    // final = constant variable, cannot be changed once initialized
    public final int MOOD_HAPPY = 1;
    public final int MOOD_SCARE = -1;
    // protected - Other classes in the same package can access this variable
    protected int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        setMammals(mammals);
        setCarnivorous(carnivorous);
        this.mood = mood;
    }

    public void sayHello() {
    }

    /*
    abstract method - no implementation, sub class must implement these method.
    anyone who references the object by its abstract class type can use the method
     */
    // 
    public abstract void sayHello(int mood);

    public boolean isMammals() {
        return this.mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean isCarnivorous() {
        return this.carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
}
