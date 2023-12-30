package org.geekbrains.lessons.lesson1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        assertConditionA();
        assertConditionB();
        System.out.println(sum(2_147_483_647, 1));

        happyNY();
        expectedValue();

        checkingShoppingCart();
        String[] colors = {"aqua", "orange", "green", "violet", "yellow", "blue", "gold"};

        testingJavaCollectionsAssertJ(colors);

        checkingHero();
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = -1;

        assert x <= 0;
    }

    public static int sum(int a, int b) {
//        assert (long) a + (long) b > Integer.MAX_VALUE : "Stack Overflow";

        return a + b;
    }

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());

//        assert currentDateTime.equals("01/01/2023 00:00:00") : "It's still 2023 :(";
        System.out.println("Happy New Year");
    }

    public static void checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");
        productCategories.add("drink");

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.getFirst());
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else if (product.equals("water")) {
                System.out.println("category: " + productCategories.get(3));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }

    public static void expectedValue() {
        int result = sum(2, 3);
        assertThat(result).isEqualTo(5);
    }

    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }

    public static void checkingHero() {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        assertThat(emmett.getName()).isEqualTo("Emmett");
        assertThat(emmett.getArmorStrength()).isEqualTo(50);
        assertThat(emmett.getWeapon()).isEqualTo("sword");
        assertThat(emmett.getBag())
                .isNotEmpty()
                .hasSize(3)
                .contains("Bow", "Axe", "Gold");
        assertThat(emmett.isHuman).isTrue();
    }

    static class Hero {
        private String name;
        private int armorStrength;
        private String weapon;
        private List<String> bag;
        private boolean isHuman;

        public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
            this.name = name;
            this.armorStrength = armorStrength;
            this.weapon = weapon;
            this.bag = bag;
            this.isHuman = isHuman;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getArmorStrength() {
            return armorStrength;
        }

        public void setArmorStrength(int armorStrength) {
            this.armorStrength = armorStrength;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public List<String> getBag() {
            return bag;
        }

        public void setBag(List<String> bag) {
            this.bag = bag;
        }

        public boolean isHuman() {
            return isHuman;
        }

        public void setHuman(boolean human) {
            isHuman = human;
        }
    }
}