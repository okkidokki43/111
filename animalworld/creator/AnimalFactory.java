package animalworld.creator;

import animalworld.basic.Animal;
import animalworld.forflight.Duck;
import animalworld.pet.Cat;
import animalworld.pet.Dog;
import animalworld.data.AnimalData;

public class AnimalFactory {
    public Animal create(AnimalData animalData) {
        switch (animalData) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case NEW_ANIMAL:
                return (Animal) new Object();
            default:
                return new Duck();
        }

    }
}