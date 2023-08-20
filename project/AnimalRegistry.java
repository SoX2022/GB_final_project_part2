package project;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalRegistry {
    public static void main(String[] args) {
        String menu = "Main menu";
        String userMenuChoise;
        String animalName = null;
        String animalBirthday = null;
        String animalClass = null;
        int animalToTrain;
        String commandToTrain;
        int tempCount = 1;

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Sam", "2020-01-01"));
        animals.add(new Cat("Marry", "2020-01-01"));
        animals.add(new Camel("Tom", "2020-01-01"));

        while (menu != "Quit") {
            System.out.println("\n\u001B[33m\u001B[1m" + "Animal Registry" + "\u001B[0m\n");
            System.out.println("\u001B[34m" + menu + "\u001B[0m\n");
            switch (menu) {
                case "Main menu":
                    System.out.println("\u001B[31m" + "1." + "\u001B[0m" + "Animal list");
                    System.out.println("\u001B[31m" + "2." + "\u001B[0m" + "Add new animal");
                    System.out.println("\u001B[31m" + "3." + "\u001B[0m" + "Train the animal");
                    System.out.println("\u001B[31m" + "4." + "\u001B[0m" + "Animal`s commands");
                    System.out.println("\u001B[31m" + "5." + "\u001B[0m" + "Quit\n");
                    System.out.print("Choose one using your numpad: ");
                    break;
                case "Animal list":
                    System.out.println("\u001B[31m" + "1." + "\u001B[0m" + " All animals");
                    System.out.println("\u001B[31m" + "2." + "\u001B[0m" + " Pet animals");
                    System.out.println("\u001B[31m" + "3." + "\u001B[0m" + " Pack animals");
                    System.out.println("\u001B[31m" + "4." + "\u001B[0m" + " Back\n");
                    break;
                case "Add new animal":
                    System.out.println("Which animal do you want to add?\n");
                    System.out.println("\u001B[32m" + "Pet animals:" + "\u001B[0m");
                    System.out.println("\u001B[31m" + "1." + "\u001B[0m" + " Dog");
                    System.out.println("\u001B[31m" + "2." + "\u001B[0m" + " Cat");
                    System.out.println("\u001B[31m" + "3." + "\u001B[0m" + " Hamster");
                    System.out.println("\u001B[35m" + "Pack animals:" + "\u001B[0m");
                    System.out.println("\u001B[31m" + "4." + "\u001B[0m" + " Horse");
                    System.out.println("\u001B[31m" + "5." + "\u001B[0m" + " Camel");
                    System.out.println("\u001B[31m" + "6." + "\u001B[0m" + " Donkey");
                    System.out.println("\u001B[31m" + "7. Back\n" + "\u001B[0m");
                    break;
                case "Train the animal":
                    System.out.println("Which animal do you want to train?");
                    System.out.println("Enter '\u001B[31m" + "0" + "\u001B[0m' to go to main menu.\n");
                    System.out.println("\n\u001B[35m" + "№  Id    Name      Age");
                    tempCount = 1;
                    for (Animal animal : animals) {
                        System.out.print(tempCount++ + ". ");
                        getAnimalInfo(animal, Dog.class);
                        getAnimalInfo(animal, Cat.class);
                        getAnimalInfo(animal, Hamster.class);
                        getAnimalInfo(animal, Horse.class);
                        getAnimalInfo(animal, Camel.class);
                        getAnimalInfo(animal, Donkey.class);
                    }
                    System.out.print("\u001B[0m");
                    break;
                case "Animal`s commands":
                    System.out.println("Which animal do you want to check?");
                    System.out.println("Enter '\u001B[31m" + "0" + "\u001B[0m' to go to main menu.\n");
                    System.out.println("\n\u001B[35m" + "№  Id    Name      Age");
                    tempCount = 1;
                    for (Animal animal : animals) {
                        System.out.print(tempCount++ + ". ");
                        getAnimalInfo(animal, Dog.class);
                        getAnimalInfo(animal, Cat.class);
                        getAnimalInfo(animal, Hamster.class);
                        getAnimalInfo(animal, Horse.class);
                        getAnimalInfo(animal, Camel.class);
                        getAnimalInfo(animal, Donkey.class);
                    }
                    System.out.print("\n\u001B[0m");
                    break;
                case "Pet animals list":
                    System.out.println("\u001B[31m" + "1." + "\u001B[1m" + " All.");
                    System.out.println("\u001B[31m" + "2." + "\u001B[1m" + " Dogs.");
                    System.out.println("\u001B[31m" + "3." + "\u001B[1m" + " Cats.");
                    System.out.println("\u001B[31m" + "4." + "\u001B[1m" + " Hammers.");
                    System.out.println("\u001B[31m" + "5." + "\u001B[1m" + " Back.\n");
                    break;
                case "Pack animals list":
                    System.out.println("\u001B[31m" + "1." + "\u001B[1m" + " All.");
                    System.out.println("\u001B[31m" + "2." + "\u001B[1m" + " Horses.");
                    System.out.println("\u001B[31m" + "3." + "\u001B[1m" + " Camels.");
                    System.out.println("\u001B[31m" + "4." + "\u001B[1m" + " Donkeys.");
                    System.out.println("\u001B[31m" + "5." + "\u001B[1m" + " Back.\n");
                    break;
                default:
                    System.out.println("Unavailable command. Try again.\n");
                    break;
            }

            userMenuChoise = getUserData("Choose one using your numpad: ");

            if (menu == "Main menu") {
                switch (userMenuChoise) {
                    case "1":
                        menu = "Animal list";
                        break;
                    case "2":
                        menu = "Add new animal";
                        break;
                    case "3":
                        menu = "Train the animal";
                        break;
                    case "4":
                        menu = "Animal`s commands";
                        break;
                    case "5":
                        menu = "Quit";
                        break;
                    default:
                        System.out.println("Unavailable command. Try again.\n");
                        break;
                }
            } else if (menu == "Animal list") {
                switch (userMenuChoise) {
                    case "1":
                        System.out.println("\n\u001B[35m" + "Id    Name      Age");
                        for (Animal animal : animals) {
                            getAnimalInfo(animal, Dog.class);
                            getAnimalInfo(animal, Cat.class);
                            getAnimalInfo(animal, Hamster.class);
                            getAnimalInfo(animal, Horse.class);
                            getAnimalInfo(animal, Camel.class);
                            getAnimalInfo(animal, Donkey.class);
                        }
                        System.out.print("\u001B[0m");
                        break;
                    case "2":
                        menu = "Pet animals list";
                        break;
                    case "3":
                        menu = "Pack animals list";
                        break;
                    case "4":
                        menu = "Main menu";
                        break;
                    default:
                        System.out.println("Unavailable command. Try again.\n");
                        break;
                }
            } else if (menu == "Pet animals list") {
                Class _class = Animal.class;
                switch (userMenuChoise) {
                    case "1":
                        _class = PetAnimal.class;
                        break;
                    case "2":
                        _class = Dog.class;
                        break;
                    case "3":
                        _class = Cat.class;
                        break;
                    case "4":
                        _class = Hamster.class;
                        break;
                    case "5":
                        menu = "Animal list";
                        break;
                    default:
                        System.out.println("Unavailable command. Try again.\n");
                        break;
                }

                if (userMenuChoise.equals("2") || userMenuChoise.equals("3") || userMenuChoise.equals("4")) {
                    System.out.println("\n\u001B[35m" + "Id    Name      Age");
                    for (Animal animal : animals) {
                        getAnimalInfo(animal, _class);
                    }
                    System.out.print("\u001B[0m");
                } else if (userMenuChoise.equals("1")) {
                    System.out.println("\n\u001B[35m" + "Id    Name      Age");
                    for (Animal animal : animals) {
                        getAnimalInfo(animal, Dog.class);
                        getAnimalInfo(animal, Cat.class);
                        getAnimalInfo(animal, Hamster.class);
                    }
                    System.out.print("\u001B[0m");
                }

            } else if (menu == "Pack animals list") {
                Class _class = Animal.class;
                switch (userMenuChoise) {
                    case "1":
                        _class = PackAnimal.class;
                        break;
                    case "2":
                        _class = Horse.class;
                        break;
                    case "3":
                        _class = Camel.class;
                        break;
                    case "4":
                        _class = Donkey.class;
                        break;
                    case "5":
                        menu = "Animal list";
                        break;
                    default:
                        System.out.println("Unavailable command. Try again.\n");
                        break;
                }

                if (userMenuChoise.equals("2") || userMenuChoise.equals("3") || userMenuChoise.equals("4")) {
                    System.out.println("\n\u001B[35m" + "Id    Name      Age");
                    for (Animal animal : animals) {
                            getAnimalInfo(animal, _class);
                    }
                    System.out.print("\u001B[0m");
                } else if (userMenuChoise.equals("1")) {
                    System.out.println("\n\u001B[35m" + "Id    Name      Age");
                    for (Animal animal : animals) {
                            getAnimalInfo(animal, Horse.class);
                            getAnimalInfo(animal, Camel.class);
                            getAnimalInfo(animal, Donkey.class);
                    }
                    System.out.print("\u001B[0m");
                }
            } else if (menu == "Add new animal") {
                switch (userMenuChoise) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        break;
                    case "7":
                        menu = "Main menu";
                        break;
                    default:
                        System.out.println("Unavailable command. Try again.\n");
                        break;
                }

                if (userMenuChoise.equals("1") || userMenuChoise.equals("2") || userMenuChoise.equals("3") || userMenuChoise.equals("4") || userMenuChoise.equals("5") || userMenuChoise.equals("6")) {
                    animalName = getUserData("Enter animal`s name:");
                    animalBirthday = getUserData("Enter "+ animalName + "`s birthday (format 'yyyy-mm-dd'):");

                    switch (userMenuChoise) {
                        case "1":
                            animals.add(new Dog(animalName, animalBirthday));
                            animalClass = "Pet animal";
                            break;
                        case "2":
                            animals.add(new Cat(animalName, animalBirthday));
                            animalClass = "Pet animal";
                            break;
                        case "3":
                            animals.add(new Hamster(animalName, animalBirthday));
                            animalClass = "Pet animal";
                            break;
                        case "4":
                            animals.add(new Horse(animalName, animalBirthday));
                            animalClass = "Pack animal";
                            break;
                        case "5":
                            animals.add(new Camel(animalName, animalBirthday));
                            animalClass = "Pack animal";
                            break;
                        case "6":
                            animals.add(new Donkey(animalName, animalBirthday));
                            animalClass = "Pack animal";
                            break;
                    }

                    System.out.println(animalName + " was added as a " + animalClass);
                    animalClass = null;
                }
            } else if (menu == "Train the animal") {
                if (userMenuChoise.equals("0")) {
                    menu = "Main menu";
                } else {
                    animalToTrain = Integer.parseInt(userMenuChoise);

                    System.out.println("Available commands to train:");
                    System.out.println("1. " + Commands.Atack);
                    System.out.println("2. " + Commands.Back);
                    System.out.println("3. " + Commands.Lie);
                    System.out.println("4. " + Commands.Sit);
                    System.out.println("5. " + Commands.Stay);

                    commandToTrain = getUserData("\nSelect the command you want to train " + animals.get(animalToTrain - 1).getName() + ":");

                    switch (commandToTrain) {
                        case "1":
                            animals.get(animalToTrain - 1).train(Commands.Atack);
                            break;
                            case "2":
                            animals.get(animalToTrain - 1).train(Commands.Back);
                            break;
                            case "3":
                            animals.get(animalToTrain - 1).train(Commands.Lie);
                            break;
                            case "4":
                            animals.get(animalToTrain - 1).train(Commands.Sit);
                            break;
                            case "5":
                            animals.get(animalToTrain - 1).train(Commands.Stay);
                            break;
                        default:
                            break;
                    }

                    System.out.print(animals.get(animalToTrain - 1) + " now knows '");
                    animals.get(animalToTrain - 1).printAvailableCommands();
                    System.out.println("'");

                }
            } else if (menu == "Animal`s commands") {
                if (userMenuChoise.equals("0")) {
                    menu = "Main menu";
                } else {
                    System.out.print("\u001B[35m" + animals.get(Integer.parseInt(userMenuChoise) - 1).getName() + " knows: ");
                    animals.get(Integer.parseInt(userMenuChoise) - 1).printAvailableCommands();
                    System.out.println("\u001B[0m");
                }
            }
        }
    }

    private static String getUserData(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    private static void getAnimalInfo(Animal animal, Class animalClass) {
        if (animal.getClass() == animalClass) {
            System.out.print(animal.getId() + "     ");
            System.out.print(animal.getName() + "     ");
            System.out.println(animal.getAge());
        }
    }
}
