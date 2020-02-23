package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalBiconditional extends LogicalOperator {
    
    public LogicalBiconditional() {
        super('=');
    }

    @Override
    public boolean performOperation(boolean a, boolean b) {
        return (a & b) | (!a & !b);
    } 
}
