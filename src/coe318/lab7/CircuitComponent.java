/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author SepehrSafa
 */
public abstract class CircuitComponent {
    private static int totalComponent=0;
    protected int componentId;
    protected double value;
    protected Node node1;
    protected Node node2;
    /**
     * Constructor of the abstract class
     * increments the total number of instances
     */
    public CircuitComponent(){
        CircuitComponent.totalComponent++;
        this.componentId=CircuitComponent.totalComponent;
    }
    /**
     * 
     * @return the nodes of the component
     */
    public Node [] getNodes(){
        Node[] nodes = {this.node1, this.node2};
        return nodes;
    }
    /**
     * 
     * @return string representation of the CircuitComponent
     */
    @Override
    public String toString() {
        return "Override it";
    }
}
