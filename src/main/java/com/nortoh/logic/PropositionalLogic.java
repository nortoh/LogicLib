package com.nortoh.logic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Christian
 */
public class PropositionalLogic {

    public PropositionalLogic() {

    }

    public void calculateTruthTable(LogicalFormula formula) {
        int n = formula.amountOfPropositions();
        int size = (int) Math.pow((long) n, 2);
        Map<Character, Boolean> booleanMap = new HashMap<Character, Boolean>();

        /* this does not work */
        for (int i = 0; i < size; i++) {
            int l = size / (i + 1);
            l = l / 2;
            System.out.println(l);
        }
    }
}
