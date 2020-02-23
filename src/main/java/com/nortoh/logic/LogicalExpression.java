package com.nortoh.logic;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Christian
 */
public class LogicalExpression extends LogicalEntity {
    
    private boolean value;
    
    private final List<LogicalEntity> logicalEntities; 

    public LogicalExpression() {
        logicalEntities = new ArrayList<>();
    }
    
    public void addEntity(LogicalEntity e) {
        this.logicalEntities.add(e);
//        System.out.printf("[LogicalExpression.class] %s %n", e.toString());
    }
    
    public List<LogicalEntity> getLogicalEntities() {
        return this.logicalEntities;
    }
}
