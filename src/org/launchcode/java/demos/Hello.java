package org.launchcode.java.demos;

import java.util.HashMap;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        HashMap<String, Integer> favoriteNumbers = new HashMap<>();
        favoriteNumbers.put("Ade", 2);
        favoriteNumbers.put("Bade", 1143);
        favoriteNumbers.put("Cade", 84);
        favoriteNumbers.put("Dade", 1855553);
        favoriteNumbers.put("Eade", 2999);
                System.out.println(favoriteNumbers);


//        System.out.println("Hello, World");
    }
}
