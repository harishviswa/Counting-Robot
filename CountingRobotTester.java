//CountingRobotTester.java
//ITCS
//12.15.20
// Harish Viswa

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class CountingRobotTester{

   public static void main(String[] args){
   
      CountingRobot robot1 = new CountingRobot("Whatever");
      CountingRobot robot2 = new CountingRobot("VonCount",3,4,Display.SOUTH,9);
      
      robot1.moveAndCount();
      robot1.moveAndCount();
      robot1.moveAndCount();
      
      System.out.println(robot1.getMyname() + " took " + robot1.getSteps() + " steps.");
      
      robot2.moveAndCount();
      robot2.moveAndCount();
      System.out.println(robot2.getMyname());
      System.out.println("Steps taken: " + robot2.getSteps());
      System.out.println("Total steps taken: " + robot2.getTotalSteps());
      
      robot2.resetSteps();
      robot2.turnLeft();
      
      for(int i = 0; i < 5; i++){
         robot2.moveAndCount();
       }
         
         System.out.println(robot2.getMyname());
         System.out.println("Steps taken: " + robot2.getSteps());
         System.out.println("Total steps taken: " + robot2.getTotalSteps());
      
      
      
   
  
   }
   
}