package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalImplication extends LogicalOperator {
    
    public LogicalImplication() {
        super('>');
    }

    @Override
    public boolean performOperation(boolean a, boolean b) {
        return !a | b;
    }   
}
