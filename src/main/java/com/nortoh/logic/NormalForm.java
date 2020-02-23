package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public enum NormalForm {
    
    CXNF("Complex Normal Form"),
    CNF("Conjuntive Normal Form"),
    DNF("Disjunctive Normal Form"),
    PNF("Prenex Normal Form"),
    SKF("Skolem Normal Form");
    
    String name;
    
    NormalForm(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }
}
