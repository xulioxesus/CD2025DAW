package com.xulioxesus;

import java.util.HashSet;
import java.util.Set;

public class Player {
    String username = "";
    String password = "";
    String email = "";
    Set<String> xogos = new HashSet<>();

    public Player() {
        username = "Anónimo";
        password = "1234";
        email = "cambiar@cambiar.com";
    }

    public Player(String u, String p, String e) {
        username = u;
        password = p;
        email = e;
    }

    public void comprarXogo(String x){
        this.xogos.add(x);
    }

    public void venderXogo(String x){
        this.xogos.remove(x);
    }
}
