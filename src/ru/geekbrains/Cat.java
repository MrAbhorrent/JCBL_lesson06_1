package ru.geekbrains;

public class Cat extends Animal implements Swimmable {

    private int max_distance = 150;
    private static int count;
    private String nickname;

    public Cat(String nickname, int age) {
        super(nickname, age);
        this.nickname = nickname;
        count++;
    }

    public String getName() {
        return nickname;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void runnig(int distance) {
        super.setMax_distance_running(max_distance);
        super.runnig(distance);

    }

    @Override
    public void simming(int distance) {
        System.out.println("I can't swim");
    }
}
