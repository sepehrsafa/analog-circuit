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
public class Resistor extends CircuitComponent{
    private static int totalResistors=1;
    private int resistorId;
    /**
     * takes the resistance value and the nodes
     * @param resistance
     * @param node1
     * @param node2 
     */
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance<0){
            throw new IllegalArgumentException("R can't be negative");
        }
        else if(node1 == null){
            throw new IllegalArgumentException("Node 1 can't be null");
        }
        else if(node2 == null){
            throw new IllegalArgumentException("Node 2 can't be null");
        }
        else{
            this.value=resistance;
            this.node1=node1;
            this.node2=node2;
            this.resistorId=Resistor.totalResistors;
            Resistor.totalResistors++;
        }
    }
    /**
     * 
     * @return string representation of the resistor
     */
    @Override
    public String toString() {
        return "R"+this.resistorId+" "+this.node1.toString()+" "+this.node2.toString()+" "+this.value; //FIX THIS
      }
}
