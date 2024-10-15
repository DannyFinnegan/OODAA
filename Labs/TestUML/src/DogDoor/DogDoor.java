package DogDoor;
import java.time.*;

import static java.lang.Thread.sleep;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door is opening");
        open=true;
    }
    public void close(){
        System.out.println("The dog door is closing");
        open=false;
    }

    public void AutoClose() throws InterruptedException {
        System.out.println("The dog door is Opening");
        sleep(1500);
        open=true;
        System.out.println("Door Status: " +isOpen());
        System.out.println("Waiting for Door...");
        sleep(5000);
        System.out.println("Closing Door");
        sleep(1500);
        open=false;
        System.out.printf("Door Status: " + isOpen());
    }

    //returns the state of the door
    public boolean isOpen(){
        return open;
    }

}
