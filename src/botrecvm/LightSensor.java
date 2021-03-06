/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botrecvm;

import java.util.Observer;

/**
 *
 * @author vvaisan
 */
public class LightSensor {
    //TODO 1:
    //Create private members for Motor and Controller objects. Also Boolean type member first (Init as true, This to know if the bottle was first)
    //Create constructor (Parameters Motor and Controller objects)
    //In costructor set associations (set private member values as parameter object as value)
    private Motor motor;
    private Controller controller;
    private Boolean first = true;
    public LightSensor (Motor motor, Controller controller) {
        this.motor = motor;
        this.controller = controller;
    }
  
    //TODO 2: 
    //Create checkBottle method (bottle as parameter, type int)
    //Check if it was 1st bottle (member first)
    //If first then call start() method of object motor
    //Set first as false
    //Call bottleAdded method of Controller object (bottle as parameter)
    private int bottle;
    public void checkBottle (int bottle) {
        if (first) {
            motor.start();
            this.first = false;
        }
        controller.bottleAdded(bottle);
    }
 
    public void setFirst() {
        this.first = true;
    }
}
