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
        StringBuilder listOfCats = new StringBuilder();
        int i = 0;
        while (i < getCats().length) {
            listOfCats.append(cats[i].toString());
            if (i + 1 != getCats().length) {
                listOfCats.append(",");
            }
            i++;
        }
        return "Home{cats=[" + listOfCats + "]}";
    }

    public static void main() {
        Home home = new Home(new Cat[] {new Cat("Tom"), new Cat("Jerry")});
        // It should print "Home{cats=[Tom,Jerry]}"
        System.out.println(home);
    }
}
