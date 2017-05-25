package com.alex.fac;

/**
 * Created by Alexandru on 5/26/2017.
 */
public class PetFactory {
    public PetFactory() {}


    public Pet getPet (String name, PetEnum petEnum) {
        switch (petEnum) {
            case DOG:
                return new Dog(name);
            case CAT:
                return new Cat(name);
            case FISH:
                return new Fish(name);
            default:
                throw new IllegalArgumentException("You don't have a pet like this");
        }
    }
}
