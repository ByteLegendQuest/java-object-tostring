package com.bytelegend;

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
        String template = "Home{cats=[%s,%s]}";
        return String.format(template, cats[0], cats[1]);
    }

    public static void main() {
        Home home = new Home(new Cat[] {new Cat("Tom"), new Cat("Jerry")});
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }
}
