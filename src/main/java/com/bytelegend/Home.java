package com.bytelegend;

import java.util.Arrays;

public class Home {
    private final Cat[] cats;

    public Home(Cat[] cats) {
        this.cats = cats;
    }

    public Cat[] getCats() {
        return cats;
    }

    public static void main() {
        Home home = new Home(new Cat[]{new Cat("Tom"), new Cat("Jerry")});
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }

    @Override
    public String toString() {
        return "Home{" +
                "cats=" + Arrays.toString(cats) +
                '}';
    }
}
