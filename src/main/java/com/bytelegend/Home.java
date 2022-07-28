package com.bytelegend;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        String result = Stream.of(cats)
                .map(Cat::toString)
                .collect(Collectors.joining(","));

        return "Home{cats=[" + result + "]}";
    }

    public static void main() {
        Home home = new Home(new Cat[]{new Cat("Tom"), new Cat("Jerry")});
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }
}
