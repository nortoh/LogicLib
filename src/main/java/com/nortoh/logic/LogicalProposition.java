package com.nortoh.logic;

/**
 *
 * @author Christian
 */
public class LogicalProposition extends LogicalEntity {
     
    private final char symbol;
    private boolean value;
    
    public LogicalProposition(char symbol) {
        this.symbol = symbol;
    }
    
    public char getSymbol() {
        return this.symbol;
    }
    
    public boolean getTruthValue() {
        return this.value;
    }
    
    public void setTruthValue(boolean value) {
        this.value = value;
    }
}
