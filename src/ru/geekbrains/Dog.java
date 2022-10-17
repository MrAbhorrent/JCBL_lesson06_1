package ru.geekbrains;

public class Dog extends Animal implements Swimmable, Runnable {

    private static int count;
    private String nickname;
    private final int max_distance_running = 500;
    private final int max_distance_swimming = 10;

    public Dog(String nickname, int age) {
        super(nickname, age);
        this.nickname = nickname;
        count++;
    }

    public static int getCount() {
        return count;
    }


    public String getName() {
        return nickname;
    }

    @Override
    public void runnig(int distance) {
        super.setMax_distance_running(max_distance_running);
        super.runnig(distance);
    }

    @Override
    public void simming(int distance) {
        super.setMax_distance_swimming(max_distance_swimming);
        super.simming(distance);
    }
}
