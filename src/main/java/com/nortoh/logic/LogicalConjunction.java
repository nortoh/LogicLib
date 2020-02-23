package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalConjunction extends LogicalOperator {

    public LogicalConjunction() {
        super('&');
    }

    @Override
    public boolean performOperation(boolean a, boolean b) {
        return a & b;
    }
}
