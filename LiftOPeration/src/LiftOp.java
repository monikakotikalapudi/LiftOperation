import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class LiftOp
{

    static int floor=0,destination,person = 0;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        floor=((int) (Math.random() * 15 + 1));
        System.out.println("The elevator is now on floor " +floor);
        System.out.print("Which floor are you at now (0-15): ");
        destination= s.nextInt();
        if(floor == destination)
        {
            System.out.println("Enter the elevator");
        }
        else if(floor > destination)
        {
            ElevatorDown();
        }
        else if(floor < destination)
        {
            ElevatorUp();
        }
        System.out.println("To which floor would you want to go (0-15) where 0 = basement");
        destination = s.nextInt();
        if(floor > destination)
        {
            ElevatorDown();
        }
        else if(floor < destination)
        {
            ElevatorUp();
        }
		 System.out.println(" !!You can leave now!!");
    }
    public static void ElevatorUp()
    {
        System.out.println("The elevator is on it's way up...");

        for (person = destination; destination>=floor; floor++)
            System.out.println("Reached floor"+floor);
          floor--;
        System.out.println("The elevator has reached to "+floor +"floor");
    }

    public static void ElevatorDown()
    {
        System.out.println("The elevator is on it's way down...");
        for (person = destination; destination<=floor; floor--)
            System.out.println("Reached Floor"+floor);
		  floor++;

        System.out.println("The elevator has reached to "+floor+"floor");
    }
	
}

