package com.alex;

/**
 * Created by Alexandru on 5/26/2017.
 */
import com.alex.cmd.CommandManager;
import com.alex.fac.Pet;
import com.alex.fac.PetEnum;
import com.alex.fac.PetEnum;
import com.alex.fac.PetFactory;


public class main {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        commandManager.executeCommands();

        PetFactory petFactory = new PetFactory();
        Pet dog = petFactory.getPet("Rex", PetEnum.DOG);
        Pet cat = petFactory.getPet("Ana", PetEnum.CAT);
        Pet fish = petFactory.getPet("Golden", PetEnum.FISH);

        dog.doSomething();
        cat.doSomething();
        fish.doSomething();
    }
}