/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
/**
 *
 * @author SepehrSafa
 */
public class UserMain {

public static void main (String [] args) {
    
    Circuit circuit = Circuit.getInstance();
    Scanner input = new Scanner(System.in);

    double componentValue;
    Node firstNode;
    Node secondNode;
    String userInput;
    //keeps reading user input
    while (true){
        //tkaes the next line
        userInput = input.nextLine();
        //checks to see if the input is end
        //if true it breaks the loop
        if (userInput.toLowerCase().equals("end")){
            break;
        }
        //if input == spice it prints the components
        if (userInput.toLowerCase().equals("spice")){
            System.out.println(circuit.toString());
            continue;
        }
        
        // check to see if input is valid
        String lineArry [] = userInput.split(" ");
        if (lineArry.length > 4 || lineArry.length<3){
            System.out.println("Invalid entry, enter the type 'v' or 'r' followed by nodes and value, each separated by a space.");
            continue;
        }
        
        //creaes the component
        try{
            componentValue = Double.parseDouble(lineArry[3]);
            firstNode = new Node(Integer.parseInt(lineArry[1]));
            secondNode = new Node(Integer.parseInt(lineArry[2]));

            if (lineArry[0].toLowerCase().equals("v")) {
                VoltageSource v = new VoltageSource(componentValue,firstNode,secondNode);
                circuit.add(v);
            }
            if (lineArry[0].toLowerCase().equals("r")) {
                Resistor r = new Resistor(componentValue,firstNode,secondNode);
                circuit.add(r);
            }
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Something is wrong try again");
        }
    }
    
    System.out.println("All Done!");
    }
}