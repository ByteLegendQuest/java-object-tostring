package com.bytelegend;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

public class Home {
    private final Cat[] cats;

    public Home(Cat[] cats) {
        this.cats = cats;
    }

    public Cat[] getCats() {
        return cats;
    }


    public String getCats(Cat[] cats) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < cats.length; i++) {
            stringBuilder.append(cats[i]);
            stringBuilder.append(",");
        }
        stringBuilder.replace(stringBuilder.lastIndexOf(","),stringBuilder.lastIndexOf(",")+1,"]");
//        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Home{" +
                "cats=" + getCats(this.cats) +
                '}';
    }

    public static void main() {

    }

    public static void main(String[] args) {
        Cat[] cats1 = new Cat[] {new Cat("Tom"), new Cat("Jerry")};
        Home home = new Home(new Cat[] {new Cat("Tom"), new Cat("Jerry")});

        // It should print "Home{cats=[Tom,Jerry]}"
//        Home home = new Home(new Cat[] {new Cat("cat_" +48), new Cat("cat_" + (48 + 1))});
        System.out.println(home);
    }
}
 