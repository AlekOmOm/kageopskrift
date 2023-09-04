package Repository;

import Model.Ingredienser;

import java.util.Scanner;

public class MængdeBeregner {
    Scanner scanner = new Scanner(System.in);
    private double antal;

    public void bestemAntal() {
        System.out.println("Hvor mange personer skal der bages til?");
        antal = scanner.nextDouble();
    }

    public void omregnUnit(Ingredienser ingrediens) {

    }

    public void beregnMængde(Ingredienser ingrediens) {
        double nyMængde = ingrediens.getMængde() * antal / ingrediens.getOriginaltAntal();
        ingrediens.setMængde(nyMængde);
    }


    public void beregnKcal(Ingredienser ingrediens) {
        double nyKcal = ingrediens.getKcal() * antal / ingrediens.getOriginaltAntal();
        ingrediens.setKcal(nyKcal);
    }

}
