package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalRegistry {
    public static void main(String[] args) {
        String menuFlag = "0";
        Scanner scanner = new Scanner(System.in);
        String userMenuChoise;
        ArrayList<Classes> classes = new ArrayList<>();
        ArrayList<Subclasses> subclasses = new ArrayList<>();
        ArrayList<Animals> animals = new ArrayList<>();
        ArrayList<Commands> commands = new ArrayList<>();

        classes.add(new Classes("pet animal"));
        classes.add(new Classes("pack animal"));

        subclasses.add(new Subclasses(1, "dog"));
        subclasses.add(new Subclasses(1, "cat"));
        subclasses.add(new Subclasses(1, "hamster"));
        subclasses.add(new Subclasses(2, "horse"));
        subclasses.add(new Subclasses(2, "camel"));
        subclasses.add(new Subclasses(2, "donkey"));

        commands.add(new Commands("stay"));
        commands.add(new Commands("sit"));
        commands.add(new Commands("lie"));

        while (menuFlag != "quit") {
            System.out.println("\nAnimal Registry\n");
            switch (menuFlag) {
                case "0":
                    System.out.println("Main menu:");
                    System.out.println("1. Add new animal.");
                    System.out.println("2. See list of animal`s commands.");
                    System.out.println("3. Train the animal.");
                    System.out.println("4. Quit.\n");
                    System.out.print("Choose one using your numpad: ");
                    break;
                case "2":
                    System.out.println("Commands list\n");
                    System.out.println("1. Enter animal`s name.");
                    System.out.println("2. Back. \n");
                    System.out.print("Choose one using your numpad: ");
                    break;
                case "3":
                    System.out.println("Train the animal\n");
                    System.out.println("1. Enter animal`s name.");
                    System.out.println("2. Back. \n");
                    System.out.print("Choose one using your numpad: ");
                    break;
                // case "4":
                // menuFlag = "quit";
                // break;
                default:
                    System.out.println("Unavailable command. Try again.\n");
                    break;
            }

            userMenuChoise = scanner.nextLine();

            if (userMenuChoise.equals("4")) {
                menuFlag = "quit";
            } else {
                if (menuFlag == "0") {
                    if (userMenuChoise.equals("1")) {
                        String name = "";
                        String birthday = "";
                        int animalSubclass = 0;
                        System.out.print("Enter animal`s name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter " + name + "`s birthday using format 'yyyy-mm-dd': ");
                        birthday = scanner.nextLine();
                        System.out.println("Choose subclass for " + name + ":");

                        for (int i = 0; i < subclasses.size(); i++) {
                            System.out.println(i + 1 + ". " + subclasses.get(i).subclassName);
                        }

                        animalSubclass = Integer.parseInt(scanner.nextLine()) - 1;
                        animals.add(new Animals(subclasses.get(animalSubclass).subclassName, name, birthday));
                        try (Counter counter = new Counter()) {
                            counter.add();
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (userMenuChoise.equals("2") || userMenuChoise.equals("3")) {
                        menuFlag = userMenuChoise;
                    } else {
                        System.out.println("Unavailable command. Try again.\n");
                    }
                } else if (menuFlag.equals("2") || menuFlag.equals("3")) {
                    if (userMenuChoise.equals("1")) {
                        Integer nameIndex = null;
                        String name = "";
                        System.out.print("Enter animal`s name: ");
                        name = scanner.nextLine();
                        int counter = 0;
                        System.out.println(name + "`s index:");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).animalName.equals(name)) {
                                counter++;
                                if (counter == 1) {
                                    nameIndex = i;
                                }
                                System.out.println(
                                        i + " - " + animals.get(i).subclass + ", " + animals.get(i).age + " years old.");
                            }
                        }

                        if (counter > 1) {
                            System.out.println("Several animals have " + name + " name.");
                            System.out.print("Enter " + name + "`s index: ");
                            nameIndex = Integer.parseInt(scanner.nextLine());
                        }

                        if (menuFlag.equals("2")) {
                            System.out.println(animals.get(nameIndex).availableCommands);
                        } else {
                            System.out.println("Choose a command you want to train " + name + ":");

                            for (int i = 0; i < commands.size(); i++) {
                                System.out.println(i + 1 + " " + commands.get(i).commandName);
                            }

                            int commandIndex = Integer.parseInt(scanner.nextLine()) - 1;
                            animals.get(nameIndex).train(commands.get(commandIndex).commandName);
                        }
                    } else {
                        menuFlag = "0";
                    }
                }
            }
        }
        scanner.close();
    }
}
