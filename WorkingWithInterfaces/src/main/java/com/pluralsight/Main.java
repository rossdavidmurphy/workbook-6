package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> baseballPlayers = new ArrayList<Person>();
        baseballPlayers.add( new Person("Babe", "Ruth", 53) );         // Age at death
        baseballPlayers.add( new Person("Jackie", "Robinson", 53) );   // Age at death
        baseballPlayers.add( new Person("Hank", "Aaron", 86) );        // Age at death
        baseballPlayers.add( new Person("Derek", "Jeter", 49) );       // Age as of 2025
        baseballPlayers.add( new Person("Shohei", "Ohtani", 30) );     // Age as of 2025
        baseballPlayers.add( new Person("Mike", "Trout", 33) );        // Age as of 2025
        baseballPlayers.add( new Person("Frank", "Robinson", 83) ); // Age at death


        Collections.sort(baseballPlayers);
        System.out.println(baseballPlayers);
    }
}
