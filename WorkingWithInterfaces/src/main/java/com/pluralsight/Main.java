package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> baseballPlayers = new ArrayList<Person>();
        baseballPlayers.add( new Person("Jackie", "Robinson", 53) );   // Age at death
        baseballPlayers.add( new Person("Hank", "Aaron", 86) );        // Age at death
        baseballPlayers.add( new Person("Derek", "Jeter", 49) );       // Age as of 2025
        baseballPlayers.add( new Person("Frank", "Robinson", 83) ); // Age at death
        baseballPlayers.add( new Person("Babe", "Ruth", 53) );        // Age at death
        baseballPlayers.add( new Person("Lou", "Gehrig", 37) );       // Age at death
        baseballPlayers.add( new Person("Joe", "DiMaggio", 84) );     // Age at death
        baseballPlayers.add( new Person("Mickey", "Mantle", 63) );    // Age at death
        baseballPlayers.add( new Person("Yogi", "Berra", 90) );       // Age at death
        baseballPlayers.add( new Person("Mariano", "Rivera", 55) );   // Age as of 2025
        baseballPlayers.add( new Person("Whitey", "Ford", 91) );      // Age at death
        baseballPlayers.add( new Person("Reggie", "Jackson", 78) );   // Age as of 2025
        baseballPlayers.add( new Person("Aaron", "Judge", 33) );      // Age as of 2025


        Collections.sort(baseballPlayers);
        System.out.println(baseballPlayers);
    }
}
