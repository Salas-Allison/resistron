package fr.simplon.resistron;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/** Hello Everybody,
We started our projet creating a file called Resistron in java, then we created a class LoginController and LoginApplication.
Right now we will work in our LoginController.
Inside our class Controller we are going to declarate our HashMap wich will contain an Integer, String or Double.
 */
public class LoginController {
    HashMap<String, Double> anneau4 = new HashMap<String, Double>();
    HashMap<String, Double> anneau3 = new HashMap<String, Double>();
    HashMap<String, Integer> anneau2 = new HashMap<String, Integer>();
    HashMap<String, Integer> anneau1 = new HashMap<String, Integer>();

    private int mvalueanneau1 = 0;
    private int mvalueanneau2 = 0;
    private double mvalueanneau3 = 0;
    private double mvalueanneau4 = 0;

    /** In our main we are going to declarate our list of colors and also we will write the fonctions of each ring
     that we create.
     */
    public static void main(String[] args) {

        List<String> listeCouleurs = Arrays.asList("noir", "brun", "rouge", "orange", "jaune", "vert",
                "bleu", "violet", "gris", "blanc", "or", "argent");

        anneau1();
        anneau2();
        anneau3();
        anneau4();

    }
    /** For our fonction anneau1: We have declared the list of colors with their respective value.
    We will use HashMap for have the differents kind of values like = String & Integer.
     */
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
    /** For our fonction anneau2: We have declared the list of colors with their respective value.
    We will use also HashMap for have the differents kind of values like = String & Integer.
     */
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
    /** For our fonction anneau3: we have declared the list of colors with their respective value.
    For this part, We will use Double.valueof for be able to have a big number and also Math.pow
    to be able to have a number to the power.
     */
    private static void anneau3() {
        HashMap<String, Double> anneau3 = new HashMap<String, Double>();
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
    /** For our fonction anneau4: we have declared the list of colors with their respective value.
    For this part, We will use Double.valueof for be able to have a decimal number.
     */
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
    /** In this part we have activated the option on click for our MenuButton.
         */
    @FXML private int mNumeroAnneauCourant;
    @FXML private void onAnneau1Click(){
        mNumeroAnneauCourant=1;
    }
    @FXML private void onAnneau2Click(){
        mNumeroAnneauCourant = 2;
    }
    @FXML private void onAnneau3Click(){
        mNumeroAnneauCourant = 3;
    }
    @FXML private void onAnneau4Click(){
        mNumeroAnneauCourant = 4;
    }

    @FXML
    private TextField mTextFieldResultat;

    @FXML
    private TextField mTextFieldAnneau1;

    @FXML
    private TextField mTextFieldAnneau2;

    @FXML
    private TextField mTextFieldMultiplicateur;

    @FXML
    private TextField mTextFieldresistance;

    @FXML
    private TextField mTextFieldtolerance;

    @FXML public void onButtonMenu(){


    }
    /** For our fonction onButtonClick, in this part we have activated the option onClick - ActionEvent for:<br />
    - To be able to choose a ring1, ring2, Multiplicateur or Resistance.<br />
    - Then we will choose a color for have the value.
     */

    @FXML public void onButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        String colorName = button.getText().toLowerCase();


        if (mNumeroAnneauCourant == 1) {
            mvalueanneau1 = anneau1.get(colorName);
        } else if (mNumeroAnneauCourant == 2) {
            mvalueanneau2 = anneau2.get(colorName);
        } else if (mNumeroAnneauCourant == 3) {
            mvalueanneau3 = anneau3.get(colorName);
        } else if (mNumeroAnneauCourant == 4) {
            mvalueanneau4 = anneau4.get(colorName);
        }

        mTextFieldAnneau1.setText(String.valueOf(mvalueanneau1));
        mTextFieldAnneau2.setText(String.valueOf(mvalueanneau2));
        mTextFieldMultiplicateur.setText(String.valueOf(mvalueanneau3));
        mTextFieldresistance.setText(String.valueOf(mvalueanneau4));
        mTextFieldtolerance.setText(String.valueOf(mvalueanneau4));

            mTextFieldAnneau1.setEditable(false);
            mTextFieldAnneau2.setEditable(false);
            mTextFieldMultiplicateur.setEditable(false);
            mTextFieldresistance.setEditable(false);
            mTextFieldtolerance.setEditable(false);
            mTextFieldResultat.setEditable(false);

        }
        /** In this part fonction ButtonCalculer, we will calculate the Resistance of our choice.
        - We will take the value from TextFieldAnneau1 , TextFieldAnneau2 and TextFieldMultiplicateur for make
          a formule and get a result.
        */
        @FXML void onButtonCalculer(ActionEvent event){
            double result;

            mvalueanneau1 = Integer.parseInt(mTextFieldAnneau1.getText());
            mvalueanneau2 = Integer.parseInt(mTextFieldAnneau2.getText());
            mvalueanneau3 = Double.parseDouble(mTextFieldMultiplicateur.getText());

            result = (mvalueanneau1 * 10 + mvalueanneau2) * mvalueanneau3;
            mTextFieldResultat.setText(String.valueOf(result));
            mTextFieldtolerance.setText(mTextFieldresistance.getText());

    }
}
