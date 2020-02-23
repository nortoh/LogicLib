package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalNegation extends LogicalOperator {
    
    public LogicalNegation() {
        super('~');
    }

    @Override
    public boolean performOperation(boolean a, boolean b) {
        return !b;
    }  
}
