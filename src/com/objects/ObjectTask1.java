package com.objects;

public class ObjectTask1 {
    public static void main(String[] args) {
        Mmonster mmonster1 = new Mmonster();
        Mmonster mmonster2 = new Mmonster();
        Mmonster mmonster3 = new Mmonster();
        Mmonster mmonster4 = new Mmonster();
        Mmonster mmonster5 = new Mmonster();

        mmonster1.name = "Romka";
        mmonster2.name = "Karlis";
        mmonster3.name = "Jhon";
        mmonster4.name = "Abdul";
        mmonster5.name = "Dimas";

        Rmonster rmonster1 = new Rmonster();
        Rmonster rmonster2 = new Rmonster();
        Rmonster rmonster3 = new Rmonster();

        rmonster1.name = "XinZhao";
        rmonster1.name = "QidsaE";
        rmonster1.name = "FAseeq";

        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();
        Dragon dragon3 = new Dragon();
        Dragon dragon4 = new Dragon();

        dragon1.name = "Water";
        dragon2.name = "Fire";
        dragon3.name = "Wind";
        dragon4.name = "Rock";
    }
    public static class Mmonster {
        String name;
    }
    public static class Rmonster {
        String name;
    }
    public static class Dragon {
        String name;
    }
}
// create 5 melee type monsters , 3 ranged type monsters and 4 drakes. and give them special name.
