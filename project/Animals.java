package project;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Animals {
    private static long animalId;
    protected long id;
    protected String subclass;
    protected String animalName;
    protected String birthday;
    protected ArrayList<String> availableCommands = new ArrayList<>();
    protected int age;

    static {
        animalId = 1L;
    }

    protected Animals (String subclass, String name, String birthday) {
        this.id = animalId++;
        this.subclass = subclass;
        this.animalName = name;
        this.birthday = birthday;
        this.age = getDiffYears();
    }

    public void train(String command) {
        this.availableCommands.add(command);
    }

    private int getDiffYears() {
        return Period.between(LocalDate.parse(this.birthday), LocalDate.now()).getYears();
}
}
