package com.bytelegend;

import java.util.ArrayList;
import java.util.Collections;

public class Home {
    private final Cat[] cats;

    public Home(Cat[] cats) {
        this.cats = cats;
    }

    public Cat[] getCats() {
        return cats;
    }

    public static void main(String args[]) {
        Home home = new Home(new Cat[]{new Cat("Tom"), new Cat("Jerry")});
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }

    @Override
    public String toString() {
        ArrayList<Cat> arrayList = new ArrayList<>(this.cats.length);
        Collections.addAll(arrayList, this.cats);
        return "Home{cats=" + arrayList.toString() + "}";
    }
}
