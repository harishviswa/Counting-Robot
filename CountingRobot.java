//CountingRobot.java
//ITCS
//12.15.20
//Harish Viswa

import edu.fcps.karel2.Robot;

public class CountingRobot extends Athlete{

private int mySteps;
private int myTotalSteps;
private String myName;

   //Constructor using default Athlete
   public CountingRobot(String name){
      super();
      mySteps = 0;
      myTotalSteps = 0;
      myName = name;
   }
   //Constructor with user input for initial parameters
   public CountingRobot(String name, int x, int y, int direction, int beepers){
      super(x,y,direction,beepers);
      myName = name;
      mySteps = 0;
      myTotalSteps = 0;
   
   }
   
   //robot moves and counts each step
   public void moveAndCount(){
      move();
      mySteps++;
      myTotalSteps++;
   }
   
   public int getSteps(){
      return mySteps;
   }
   
   public int getTotalSteps(){
      return myTotalSteps;
   }
   
   public String getMyname(){
      return myName;
   }
   
   public void resetSteps(){
      mySteps = 0;
   }

}