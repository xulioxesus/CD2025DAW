package com.xulioxesus;

public class TestGame {

    public static void main(String[] args) {
        Game xogo = new Game();
        Game xogo2 = new Game("GTA",70.0f);
        System.out.println(xogo.name);
        System.out.println(xogo.prize);
    }
}
