package Service;

import Model.Ingredienser;
import Repository.MængdeBeregner;

import java.util.ArrayList;

public class Opskrift {

    MængdeBeregner beregner = new MængdeBeregner();
    ArrayList<Ingredienser> opskrift = new ArrayList<Ingredienser>();

    public void createIngredienser() {

        Ingredienser mælk = new Ingredienser("mælk", 1, "liter", 600);
        Ingredienser mel = new Ingredienser("mel", 500, "gram", 1500);
        Ingredienser æg = new Ingredienser("æg", 3, "stk", 300);
        Ingredienser sukker = new Ingredienser("sukker", 1, "spsk", 100);
        Ingredienser smør = new Ingredienser("smør", 50, "gram", 400);
        Ingredienser bagepulver = new Ingredienser("bagepulver", 1, "tsk", 0);
        opskrift.add(mælk);
        opskrift.add(mel);
        opskrift.add(æg);
        opskrift.add(sukker);
        opskrift.add(smør);
        opskrift.add(bagepulver);
        beregner.bestemAntal();
        for (Ingredienser ingrediens : opskrift) {
            beregner.beregnMængde(ingrediens);
            beregner.beregnKcal(ingrediens);
        }

        System.out.println(opskrift);


    }


}
