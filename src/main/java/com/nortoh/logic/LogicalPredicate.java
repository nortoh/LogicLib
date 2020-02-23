package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalPredicate extends LogicalEntity {
    
    private char symbol;
    private String arguments;
    
    public LogicalPredicate(char symbol, String arguments) {
        this.symbol = symbol;
        this.arguments = arguments;
    }
    
    public char getSymbol() {
        return this.symbol;
    }
}
