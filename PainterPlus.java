import org.code.neighborhood.*;
public class PainterPlus extends Painter{
  public PainterPlus(int x, int y, String color, int numPaint) { //Mr Aiello did this
    super(x, y, color, numPaint); //Mr Aiello did this
  }
  
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void moveFast(){
    while (canMove() ){
      move();
      paint("white");
    }
  }
  public void takeAllPaint(){
    while (isOnBucket()){
      takePaint();
    }
  }
    public void paintToEmpty(String color){
      while (hasPaint()){
        paint(color);
        move();
      }
    }
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
    }
  }





  
}
