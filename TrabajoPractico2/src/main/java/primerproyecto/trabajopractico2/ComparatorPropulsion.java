package primerproyecto.trabajopractico2;

import java.util.Comparator;

public class ComparatorPropulsion implements Comparator<OrniAzul> {

    @Override
    public int compare(OrniAzul o1, OrniAzul o2) {
        return Double.compare(o1.getPropulsion(), o2.getPropulsion());
    }

}
