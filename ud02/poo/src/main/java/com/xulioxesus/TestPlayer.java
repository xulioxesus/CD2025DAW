package com.xulioxesus;

public class TestPlayer {

    public static void main(String[] args) {
        Player p = new Player();
        Player p2 = new Player("julio", "sadfsaldkfjsaldf", "julio@game.tv");

        p.comprarXogo("GTA");
        p.comprarXogo("GTA2");

        p.venderXogo("GTA");
    }
}
