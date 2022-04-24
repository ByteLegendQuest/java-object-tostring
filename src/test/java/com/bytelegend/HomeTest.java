package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class HomeTest {
    @Test
    public void test() {
        int n = new Random().nextInt(100);
        Home home = new Home(new Cat[] {new Cat("cat_" + n), new Cat("cat_" + (n + 1))});

        Assertions.assertEquals(2, home.getCats().length);
        Assertions.assertEquals("cat_" + n, home.getCats()[0].toString());
        Assertions.assertEquals("cat_" + (n + 1), home.getCats()[1].toString());
        Assertions.assertEquals(
                "Home{cats=[cat_" + n + ",cat_" + (n + 1) + "]}",
                home.toString().replaceAll("\\s+", ""));
    }
}
