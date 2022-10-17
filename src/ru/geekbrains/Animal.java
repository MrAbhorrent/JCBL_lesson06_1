package ru.geekbrains;

public class Animal implements Runnable, Swimmable {
    private static int count;
    private String nickname;
    private int age;
    private int max_distance_running = 0;
    private int max_distance_swimming = 0;


    public Animal(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setMax_distance_running(int limit_distance) {
        this.max_distance_running = limit_distance;
    }

    public void setMax_distance_swimming(int limit_distance) {
        this.max_distance_swimming = limit_distance;
    }

    public void runnig(int distance) {
        if (distance > max_distance_running) {
            System.out.println("I can run only " + max_distance_running);
        } else {
            System.out.println("I can run " + distance);
        }

    }

    @Override
    public void simming(int distance) {
        if (distance > max_distance_swimming) {
            System.out.println("I can swim only " + max_distance_swimming);
        } else {
            System.out.println("I can swim " + distance);
        }
    }
}
