package project;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Animal {
    private static long animalId;
    protected long id;
    protected String name;
    protected String birthday;
    protected ArrayList<Commands> availableCommands = new ArrayList<>();
    protected int age;

    static {
        animalId = 1L;
    }

    protected Animal(String name, String birthday) {
        this.id = animalId++;
        this.name = name;
        this.birthday = birthday;
        this.age = getDiffYears();
    }

    public void train(Commands command) {
        this.availableCommands.add(command);
    }

    private int getDiffYears() {
        return Period.between(LocalDate.parse(this.birthday), LocalDate.now()).getYears();
    }

    protected void printAvailableCommands () {
        System.out.print(this.availableCommands);
    }

    protected Long getId() {
        return this.id;
    }

    protected String getName() {
        return this.name;
    }

    protected int getAge() {
        return this.age;
    }
}

enum Commands {Atack, Back, Lie, Sit, Stay}
