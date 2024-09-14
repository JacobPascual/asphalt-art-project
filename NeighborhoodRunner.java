import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
  
  CanvasPainter john = new CanvasPainter();
   john.paintCanvas("lightblue", 16);


    
  RosePainter jacob = new RosePainter(7,15,"north", 0);



  jacob.paintRose();
  jacob.moveToStart();


    
    
  } //ENDING BRACKET
}