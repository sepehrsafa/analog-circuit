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
public class Node {
    private static int totalNodes = 0;
    private int nodeId;
    
    /**
     * Node constructor takes the id of the Node
     * @param id 
     */
    public Node(int id){
        this.nodeId=id;
        Node.totalNodes++;
    }
    /**
     * 
     * @return the node's id
     */
    public int getNodeId(){
        return this.nodeId;
    }
    /**
     * 
     * @return string of node id
     */
    @Override
    public String toString() {
        return ""+this.nodeId; //FIX THIS
      }
}
