package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalDisjunction extends LogicalOperator {

    public LogicalDisjunction() {
        super('+');
    }

    @Override
    public boolean performOperation(boolean a, boolean b) {
        return a | b;
    }
}
