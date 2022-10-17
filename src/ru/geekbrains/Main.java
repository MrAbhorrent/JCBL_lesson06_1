package ru.geekbrains;

public class Main {

    private static final String running = "Running";
    private static final String swimming = "Swimming";

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 2);
        Cat cat2 = new Cat("Васька", 10);
        Dog dog1 = new Dog("Жучка", 5);
        Dog dog2 = new Dog("Шарик", 15);

        System.out.printf("======= %s =======", running);
        System.out.printf("%s\t->  ", cat1.getName());
        cat1.runnig(100);
        System.out.printf("%s\t->  ", cat2.getName());
        cat2.runnig(250);
        System.out.printf("%s\t->  ", dog1.getName());
        dog1.runnig(150);
        System.out.printf("%s\t->  ", dog2.getName());
        dog2.runnig(600);

        System.out.printf("======= %s =======", swimming);
        System.out.printf("%s\t->  ", cat1.getName());
        cat1.simming(20);
        System.out.printf("%s\t->  ", cat2.getName());
        cat2.simming(300);
        System.out.printf("%s\t->  ", dog1.getName());
        dog1.simming(5);
        System.out.printf("%s\t->  ", dog2.getName());
        dog2.simming(40);

        System.out.println("========================");
        System.out.println("Create all animals count = " + Animal.getCount());
        System.out.println("Create cats count = " + Cat.getCount());
        System.out.println("Create dogs count = " + Dog.getCount());
    }
}
