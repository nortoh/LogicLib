package com.nortoh.logic;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Christian
 */
public class LogicalResolvant {
    
    
    private Set<String> propositions;
    
    public LogicalResolvant() {
        this.propositions = new HashSet();
    }
    
    public void addProposition(String proposition) {
        propositions.add(proposition);
    }
}
