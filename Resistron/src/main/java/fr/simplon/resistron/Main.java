/*package fr.simplon.resistron;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listeCouleurs = Arrays.asList("noir", "brun", "rouge",
                "orange", "jaune", "vert",
                "bleu", "violet", "gris", "blanc", "or", "argent");

        anneau1();

        anneau2();

        anneau3();

        anneau4();

    }






    private static void anneau4() {
        HashMap<String, Double> anneau4 = new HashMap<String, Double>();
        anneau4.put("noir", null);
        anneau4.put("brun", Double.valueOf(1));
        anneau4.put("rouge", Double.valueOf(2));
        anneau4.put("orange", null);
        anneau4.put("jaune", null);
        anneau4.put("vert", Double.valueOf(0.5));
        anneau4.put("bleu", Double.valueOf(0.25));
        anneau4.put("violet", Double.valueOf(0.10));
        anneau4.put("gris", Double.valueOf(0.05));
        anneau4.put("blanc", null);
        anneau4.put("or", Double.valueOf(5));
        anneau4.put("argent", Double.valueOf(10));
    }

    private static void anneau3() {
        HashMap<String, Double> anneau3 = new HashMap<String, Double>(); //Utilisation du Double sur Integer pour permettre d'écrire tous nos chiffres
        anneau3.put("noir", Double.valueOf(1));
        anneau3.put("brun", Double.valueOf(10));
        anneau3.put("rouge", Double.valueOf(100));
        anneau3.put("orange", Double.valueOf(1000));
        anneau3.put("jaune", Double.valueOf(10000));
        anneau3.put("vert", Double.valueOf(100000));
        anneau3.put("bleu", Double.valueOf(1000000000));
        anneau3.put("violet", Math.pow(10, 7)); // Pour écrire les puissances Math.pow, chiffre suivi de puissance
        anneau3.put("gris", Math.pow(10, 8)); // Pour écrire les puissances Math.pow, chiffre suivi de puissance
        anneau3.put("blanc", Math.pow(10, 9)); // Pour écrire les puissances Math.pow, chiffre suivi de puissance
        anneau3.put("or", Math.pow(10, -1)); // Pour écrire les puissances Math.pow, chiffre suivi de puissance
        anneau3.put("argent", Math.pow(10, -2)); // Pour écrire les puissances Math.pow, chiffre suivi de puissance
    }

    private static void anneau2() {
        HashMap<String, Integer> anneau2 = new HashMap<String, Integer>();
        anneau2.put("noir", 0);
        anneau2.put("brun", 1);
        anneau2.put("rouge", 2);
        anneau2.put("orange", 3);
        anneau2.put("jaune", 4);
        anneau2.put("vert", 5);
        anneau2.put("bleu", 6);
        anneau2.put("violet", 7);
        anneau2.put("gris", 8);
        anneau2.put("blanc", 9);
        anneau2.put("or", null);
        anneau2.put("argent", null);
    }

    private static void anneau1() {
        HashMap<String, Integer> anneau1 = new HashMap<String, Integer>();
        anneau1.put("noir", 0);
        anneau1.put("brun", 1);
        anneau1.put("rouge", 2);
        anneau1.put("orange", 3);
        anneau1.put("jaune", 4);
        anneau1.put("vert", 5);
        anneau1.put("bleu", 6);
        anneau1.put("violet", 7);
        anneau1.put("gris", 8);
        anneau1.put("blanc", 9);
        anneau1.put("or", null);
        anneau1.put("argent", null);

    }



}*/