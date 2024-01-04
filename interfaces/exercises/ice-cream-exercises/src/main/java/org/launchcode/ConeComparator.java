package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        return cone1.getCost().compareTo(cone2.getCost());
    }
}
