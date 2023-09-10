package Service;

import Model.Ingredienser;
import Repository.MængdeBeregner;

import java.util.ArrayList;

public class Opskrift {

    MængdeBeregner beregner = new MængdeBeregner();
    ArrayList<Ingredienser> opskrift = new ArrayList<Ingredienser>();

    public void createIngredienser() {
        // ingredienser objekter skabes og sættes med originalt værdi
        // ingrediens mængder og kcal er beregnet efter 'originalen' 4 personer, de beregnes dermed efter *(nyt antal/originalt(4))
        Ingredienser mælk = new Ingredienser("mælk", 1, "liter", 600);
        Ingredienser mel = new Ingredienser("mel", 500, "gram", 1500);
        Ingredienser æg = new Ingredienser("æg", 3, "stk", 300);
        Ingredienser sukker = new Ingredienser("sukker", 1, "spsk", 100);
        Ingredienser smør = new Ingredienser("smør", 50, "gram", 400);
        Ingredienser bagepulver = new Ingredienser("bagepulver", 1, "tsk", 0);
        // ingrediens objekterne tilføjes til opskrift, hvilket er et array objekt, så tilføjes objekt.add()
        opskrift.add(mælk);
        opskrift.add(mel);
        opskrift.add(æg);
        opskrift.add(sukker);
        opskrift.add(smør);
        opskrift.add(bagepulver);
        beregner.bestemAntal();
        // ingredienser i opskrift-array gåes igennem og beregnes korrekt mængde og kcal.
        for (Ingredienser ingrediens : opskrift) {
            beregner.beregnMængde(ingrediens);
            beregner.beregnKcal(ingrediens);
        }

        // opskrift skabt, så metoden printer opskriften
        System.out.println(opskrift);


    }


}
