package com.bytelegend;

public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
