package org.ethz.day3;

public class Exercise3 {

    /*Task 1 
    -y is not referenced and therefore null
    -c is not initialized and therefore null
    -C has no double as input for constructor
    -The variable c is used in a static method but is declared as an instance variable 
    & method1 is non-static and cannot be called from a static context.
    -Apple has no constructor nor calls the constructor of the superclass
    */

    /*
     * Task 2
     * After swap1: circle1 = 1.0 circle2 = 2.0
     * After swap2: circle1 = 2.0 circle2 = 1.0
     */

     
}

class Node {
    double x;
    double y;
    String id;

    public Node(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getId() {
        return id;
    }
}
// Link.java
public class Link {
    private Node fromNode;
    private Node toNode;
    private String id;
    private String[] modes;
    private double length;
    private int allowedSpeed;
    private double capacity;

    public Link(Node fromNode, Node toNode, String id, String[] modes, double length, int allowedSpeed, double capacity) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.id = id;
        this.modes = modes;
        this.length = length;
        this.allowedSpeed = allowedSpeed;
        this.capacity = capacity;
    }
    public Node getFromNode() {
        return fromNode;
    }

    public Node getToNode() {
        return toNode;
    }

    public String getId() {
        return id;
    }

    public String[] getModes() {
        return modes;
    }
    ublic double getLength() {
        return length;
    }

    public int getAllowedSpeed() {
        return allowedSpeed;
    }

    public double getCapacity() {
        return capacity;
    }

    public interface InnerExercise3 {
    
        
    }
}

