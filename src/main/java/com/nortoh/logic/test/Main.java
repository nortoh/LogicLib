package com.nortoh.logic.test;

import com.nortoh.logic.LogicalFormula;
import com.nortoh.logic.LogicalResolution;
import com.nortoh.logic.PropositionalLogic;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Christian
 */
public class Main {
    
    public static void main(String[] args) {
        PropositionalLogic pl = new PropositionalLogic();
        
        //= {{p, r}, {q, ¬r}, {¬q}, {¬p, t}, {¬s}, {s, ¬t}}
        String expression = "(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S)";

        /* set the proposition value */
        Map<Character, Boolean> truthValues = new HashMap<>();        
        truthValues.put('P', false);
        truthValues.put('Q', false);
        truthValues.put('G', false);
        truthValues.put('R', true);
        truthValues.put('S', true);

        /* create a new logical formula from the expression */
        LogicalFormula formula = new LogicalFormula(expression);
        
        /* calculate the truth value */
        formula.calculate(truthValues);
        System.out.println(formula.getExpression() + " is " + formula.getTruthValue());
        
        /* execute the resolution method */
        new LogicalResolution(formula).execute();
    }
    
}
