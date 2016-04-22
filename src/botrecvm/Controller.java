package botrecvm;

import java.util.Observer;

public class Controller {
    //TODO1:
    //Create private members: sum (float), Display and Printer object members (Associations)
    //Create constructor (Observer as parameter)
    //In costructor create display and printer objects (private members above), give observer as parameter
    private float sum;
    private Display display;
    private Printer printer;
    public Controller (MyObserver myobs) {
        this.display = new Display(myobs);
        this.printer = new Printer(myobs);
    }    
    //TODO 3: 
    //Create buttonPressed() method: Set sum as zero and call printTicket method (printer object)
    public void buttonPressed() {
        printer.printTicket(this.sum);
        this.sum = 0;
    }
    
    //TODO 2:
    //Create bottleAdded() method (bottle as parameters type int)
    //Check the value of bottle parameter: 20  --> 0.2f, 15  --> 0.15f or 30  --> 0.3f (Or then INVALID)
    //Add the value to the sum and call show() method of display object (sum as parameter)
    private int bottle;
    public void bottleAdded(int bottle) {
        switch (bottle) {
            case 20:
                this.sum += 0.2f;
                display.show(this.sum);
                break;
            case 15:
                this.sum += 0.15f;
                display.show(this.sum);
                break;
            case 30:
                this.sum += 0.3f;
                display.show(this.sum);
                break;
            default:
                display.show(this.sum);
                break;
        };
    }  
}
