/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botrecvm;

/**
 *
 * @author vvaisan
 */
public class MoveSensor {
    //TODO 1:
    //Create private members Motor and Controller objects. 
    //Create constructor and set private members as parameter values (Associations)
    private Motor motor;
    private Controller controller;
    public MoveSensor (Motor motor, Controller controller) {
        this.motor = motor;
        this.controller = controller;
    }
    
    //TODO 3:
    //Create method buttonPressed()
    //The method calls stop() method of Motor object and buttonPressed() method of Controller object
    public void buttonPressed() {
        motor.stopMotor();
        controller.buttonPressed();
    }
      
}
