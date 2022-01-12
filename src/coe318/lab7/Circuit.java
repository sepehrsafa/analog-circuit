/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author SepehrSafa
 */
public class Circuit {
    //static instance var
    private static Circuit instance =null; 
    //arrat for all the elements eg resistor and voltage
    private ArrayList<CircuitComponent> circuitComponents = new ArrayList<CircuitComponent>();
    
    /**
     * Returns an instance of the class, if it doesnt exists, it creates one.
     * @return Circuit instance
     */
    public static Circuit getInstance() {
        if (instance == null){ 
            instance = new Circuit();
        }
            return instance;
    }
    private Circuit(){ 
    }
    /**
     * adds a resistor or voltage source
     * @param r 
     */
    public void add(CircuitComponent r){
        circuitComponents.add(r);
    }
    /**
     * @return number of components
     */
    public int numberOfComponents(){
        return circuitComponents.size();
    }
    /**
     * @return String representation of the circuit
     */
    @Override
    public String toString() {
        String output ="";
        for(CircuitComponent component : circuitComponents){
            output+= component.toString()+"\n";
        }
        return output;
      }
}
