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
public class VoltageSource extends CircuitComponent {
    private static int totalSources=1;
    private int voltageSourceId;
    
    /**
     * takes the value of voltage source and its nodes
     * @param voltage
     * @param node1
     * @param node2 
     */
    public VoltageSource(double voltage, Node node1, Node node2){

        if(node1 == null){
            throw new IllegalArgumentException("Node 1 can't be null");
        }
        if(node2 == null){
            throw new IllegalArgumentException("Node 2 can't be null");
        }
        
        else{
            this.value=voltage;
            this.node1=node1;
            this.node2=node2;
            this.voltageSourceId=VoltageSource.totalSources;
            VoltageSource.totalSources++;
        }
    }
    /**
     * 
     * @return string represntation of the voltage source
     */
    @Override
    public String toString() {
        return "V"+this.voltageSourceId+" "+this.node1.toString()+" "+this.node2.toString()+" DC "+this.value; //FIX THIS
      }
}
