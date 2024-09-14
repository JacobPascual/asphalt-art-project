import org.code.neighborhood.*;
public class CanvasPainter extends PainterPlus{
  public CanvasPainter() { //Mr Aiello did this 
    super(0,0,"east",0);//Mr Aiello did this
  }
  public CanvasPainter(int x, int y, String color, int numPaint) { //Mr Aiello did this
    super(x, y, color, numPaint); //Mr Aiello did this
  }


  /*
  * Paints a straight line under a given color and amount
  */
  public void paintLine(String color, int value){
    setPaint(value);
    while(hasPaint()){ //moves in a straight line until it runs out of paint
      paint(color);
      if(canMove()){ //Separated from while statement so that the painter doesn't try to move when it can't
        move();
      }
    }
  }

  
  /*
  *Paints the entire background of the screen a given color
  */
 public void paintCanvas(String color, int value){ //Used to paint the background any color
   setPaint(value);
    while(canMove("south")){
      paintLine(color, value);
      if(getY() % 2 != 0){ 
        turnLeft();
      
        move();
        turnLeft();
      } else if(getY() % 2 == 0){ //If painter is on a y value that is divisible by 2, it will paint as far as it can west, then move down towards a y value that isn't divisible by 2
        turnRight();
      
        
        move();
        turnRight();
      }
      paintLine(color, value);
      
      }
   System.out.println("FINISHED BACKGROUND");
    }


    /*
  * Turns the painter around
  */
  public void turnAround(){
    turnLeft();
    turnLeft();
  }
  
  /*
  *Moves a given distance
  */
  public void moveFar(int move){ //Moves a specified amount of intervals
    for(int i = 0; i < move; i++){
      move();
    }
  }

    /*
  * Pushes the painter to the side of the screen
  */
  public void moveAway(){ //Used to move the painter to the side of the sreen
    while(canMove()){
      move();
    }
  }

  public void moveToStart(){
    while(!isFacingNorth()){
      turnLeft();
    }
    while(canMove()){
      move();
    }
    if(getX() != 0){
      turnLeft();
      moveAway();
    }
    while(!isFacingEast()){
      turnLeft();
    }
  }
 




  
} //Ending bracket for CanvasPainter