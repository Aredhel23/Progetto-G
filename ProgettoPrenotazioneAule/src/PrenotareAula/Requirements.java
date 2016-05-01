/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrenotareAula;

/**
 *
 * @author Federico
 */
public class Requirements {
    private int capacity;
    private boolean blackboard;
    private boolean whiteboard;
    private boolean projector;
    private String specialRequirements;

    public Requirements(int capacity, boolean blackboard, boolean whiteboard, boolean projector, String specialRequirements) {
        this.capacity = capacity;
        this.blackboard = blackboard;
        this.whiteboard = whiteboard;
        this.projector = projector;
        this.specialRequirements = specialRequirements;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBlackboard() {
        return blackboard;
    }

    public boolean isWhiteboard() {
        return whiteboard;
    }

    public boolean isProjector() {
        return projector;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }
    
    @Override
    public String toString() {
        return "capacità:" + capacity + ", lavagna: " + blackboard+ ", lavagna lucidi: "+ whiteboard+ ", proiettore: "+ projector;
    }
    
    
}
