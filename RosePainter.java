import org.code.neighborhood.*;
public class RosePainter extends CanvasPainter{

  public RosePainter(int x, int y, String color, int numPaint) { //Mr Aiello did this
    super(x, y, color, numPaint); //Mr Aiello did this
  } //Mr Aiello did this


  
  public void paintRose(){
    paintStem();
    paintLeaf();
    paintOuterPetal();
    paintInnerPetal();
    outline();
    fixDetail();
  }


  /*
  * Uses paintLine methods and a series of other methods to paint the stem of the rose
  */
  public void paintStem(){ //paints the stem of the flower
    paintLine("green", 1);
    turnRight();
    paintLine("green", 2);
    turnAround();
    moveFar(2);
    turnRight();
    paintLine("green", 2);
    turnLeft();
    move();
    turnRight();
    paintLine("green", 3); //finishes the bottom part of the stem
    
    turnLeft();
    move();
    paintLine("darkGreen", 2);
    turnAround();
    move();
    turnRight();
    move();
    paintLine("darkGreen", 1);
    turnAround();
    moveFar(3);
    turnRight();
    
    paintLine("black", 2); //piece of outline because it was convenient
    
    paintLine("darkGreen", 2);
    turnLeft();
    move();
    turnLeft();
    move();
    turnLeft();
    paintLine("darkGreen", 1);
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("darkGreen", 2);
  }



  /*
  *  Uses series of methods to paint the leaf of the rose
  */
  public void paintLeaf(){ //paints the leaf of the flower
    move();
    turnLeft();
    moveFar(2); //moves to where the leaf is going to be

    paintLine("green", 1);
    paintLine("black", 2);
    paintLine("green", 2);
    turnLeft();
    paintLine("black",3); //Black in this code is part of the outline
    turnLeft();
    move();
    turnLeft();
    moveFar(2);
    turnRight();
    paintLine("black", 1);
    paintLine("olive", 1);
    paintLine("green", 2);
    turnRight();
    paintLine("black", 1);
    turnRight();
    move();
    paintLine("black", 1);
    paintLine("olive", 1);
    turnLeft();
    paintLine("black", 1);
    turnLeft();
    move();
    paintLine("black", 1);
    move();
    turnLeft();
    moveFar(4);
    turnLeft();
    paintLine("black", 1);
    paintLine("green", 3);
    turnRight();
    paintLine("black", 1);
    turnRight();
    paintLine("black", 1);
    paintLine("green", 2);
    paintLine("black", 1);
    turnLeft();
    move();
    turnLeft();
    moveFar(2);
    paintLine("black", 2);
    turnAround();
    moveFar(5);
    turnRight();
    move();
    paintLine("black", 3);
    
    
  }


/*
* Paints the outer layer of the rose, and provides parts of the outline
*/
public void paintOuterPetal(){ //Paints the outer layer of the rose
  moveFar(5);
  turnLeft();
  moveFar(3);
  paintLine("maroon", 4);
  turnRight();
  move();
  turnRight();
  paintLine("maroon", 3);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("maroon", 1);
  paintLine("brown", 2);
  turnRight();
  paintLine("black", 1);
  turnRight();
  paintLine("black", 1);
  paintLine("brown", 1);
  turnLeft();
  paintLine("maroon", 2);
  paintLine("black", 1);
  turnRight();
  move();
  paintLine("black", 3);
  turnRight();
  move();
  turnLeft();
  paintLine("black", 2);
  turnAround();
  moveFar(3);
  paintLine("brown", 3);
  move();
  turnLeft();
  move();
  paintLine("black", 1);
  turnLeft();
  move();
  turnLeft();
  move();
  turnRight();
  move();
  paintLine("brown", 1);
  paintLine("black", 2);
  moveFar(2);
  paintLine("black", 1);
  turnLeft();
  paintLine("maroon", 1);
  turnLeft();
  paintLine("brown", 2);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("black", 4);
  turnRight();
  move();
  turnRight();
  paintLine("black", 1);
  paintLine("brown", 2);
  turnLeft();
  moveFar(2);
  turnLeft();
  paintLine("black", 1);
  paintLine("maroon", 2);
  paintLine("brown", 1);
  turnRight();
  paintLine("black", 2);
  turnRight();
  move();
  turnRight();
  paintLine("maroon", 1);
  turnLeft();
  paintLine("maroon", 2);
  paintLine("black", 2);
  turnRight();
  moveFar(2);
  turnRight();
  moveFar(2);
  paintLine("maroon", 1);
  paintLine("brown", 2);
  paintLine("black", 1);
  turnRight();
  moveFar(3);
  turnRight();
  move();
  paintLine("black", 1);
  turnLeft();
  move();
  paintLine("black", 1);
  turnRight();
  move();
  paintLine("black", 1);
  turnRight();
  paintLine("black", 1);
  move();
  turnRight();
  move();
  turnRight();
  paintLine("black", 1);
  turnRight();
  paintLine("brown", 4);
  paintLine("black", 2);
  turnRight();
  move();
  turnLeft();
  paintLine("black", 1);
  turnRight();
  paintLine("black", 2);
  turnLeft();
  move();
  paintLine("black", 1);
  turnAround();
  moveFar(4);
  paintLine("black", 2);
  turnRight();
  move();
  paintLine("black", 2);
  turnLeft();
  move();
  turnLeft();
  move();
  turnRight();
  paintLine("brown", 4);
}



/*
* Finishes painting the inner part of the flower, and adds outlines throughout the inside
*/ 
  public void paintInnerPetal(){ //Paints the inner petal of the rose
    turnAround();
    moveFar(6);
    paintLine("brown", 1);
    turnRight();
    paintLine("brown", 1);
    turnRight();
    move();
    turnAround();
    paintLine("brown", 3);

    turnRight();
    move();
    turnRight();
    paintLine("brown", 2);
    turnLeft();
    move();
    turnRight();
    paintLine("brown", 2);
    turnRight();
    move();
    paintLine("maroon", 1);
  }


/*
* Finishes painting the outline of the flower
*/
  public void outline(){
    
    moveAway();
    
    turnRight();
    move();
    paintLine("black", 1);
    move();
    turnRight();
    paintLine("black", 3);
    turnLeft();
    move();
    turnRight();
    paintLine("black", 3);
    turnRight();
    move();
    paintLine("black", 1);
    turnRight();
    paintLine("black", 4);
    turnLeft();
    move();
    paintLine("black", 1);
    turnLeft();
    moveFar(3);
    paintLine("black", 2);
    turnLeft();
    move();
    turnRight();
    paintLine("black", 1);
    turnRight();
    paintLine("black", 3);
    turnAround();
    moveFar(5);
    paintLine("black", 4);
    turnRight();
    move();
    turnLeft();
    paintLine("black", 1);
    turnRight();
    move();
    turnAround();
    paintLine("black", 1);
    moveFar(3);
    turnLeft();
    moveFar(2);
    turnRight();
    paintLine("black", 2);
    turnLeft();
    move();
    paintLine("black", 1);
  }



  /*
  * Fixes details about the flower that looked off or wierd
  */
  public void fixDetail(){ //Finishes details of t
    moveFar(5);
    turnRight();
    moveFar(3);
    turnLeft();
    moveFar(2);
    paintLine("black", 2);
    turnRight();
    move();
    turnRight();
    paintLine("lightblue", 4);
    turnRight();
    moveFar(4);
    turnRight();
    moveFar(2);
    paintLine("olive", 1);
    turnLeft();
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("black", 1);
    paintLine("lightblue", 1);
    turnRight();
    moveFar(3);
    turnRight();
    moveFar(2);
    paintLine("lightblue", 1);
    move();
    turnRight();
    move();
    paintLine("olive", 1);
  }












  
} //ending bracket for RosePainter class