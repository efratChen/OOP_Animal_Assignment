/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal[] animals = {
            new Cat(true, true, 0),
            new Dog(true, true, 1),
            new Frog(false, false, -1)
        };
        for (Animal animal : animals) {
            System.out.print(animal.getClass().getName() + " ");
            animal.sayHello();
            animal.sayHello(-1);
            System.out.print("isMammals: " + animal.isMammals());
            System.out.print(", isCarnivorous: " + animal.isCarnivorous());
            animal.setMammals(false);
            animal.setCarnivorous(false);
            System.out.print(", isMammals: " + animal.isMammals());
            System.out.print(", isCarnivorous: " + animal.isCarnivorous() + ", ");
            // check if an object is of a given type, it helps avoid a ClassCastException
            if (animal instanceof Land) {
                Land l = (Land) animal;
                System.out.print(animal.getClass().getName());
                System.out.println(" legs: " + l.getNumberOfLegs());
            }
            if (animal instanceof Water) {
                Water w = (Water) animal;
                System.out.print(animal.getClass().getName());
                System.out.print(" hasGills: " + w.hasGills());
                System.out.println(", hasLaysEggs: " + w.hasLaysEggs());
            }
        }
    }
}
