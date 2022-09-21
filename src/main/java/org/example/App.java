package org.example;

public class App {
    public static void main(String[] names) {
        NameFinder nameFinder = new NameFinder(names);
        System.out.println("Most popular name is " + nameFinder.getMostPopular());
        System.out.println("Least popular name is " + nameFinder.getLeastPopular());
    }
}
