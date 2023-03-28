package com.bytelegend;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Home {
    private final Cat[] cats;

    public Home(Cat[] cats) {
        this.cats = cats;
    }

    public Cat[] getCats() {
        return cats;
    }

    @Override
    public String toString() {
        return String.format("Home{cats=%s}",
                Arrays.asList(getCats()).stream().map(Cat::toString).collect(Collectors.toList()).toString());
    }

    public static void main() {
        Home home = new Home(new Cat[] { new Cat("Tom"), new Cat("Jerry") });
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }
}
