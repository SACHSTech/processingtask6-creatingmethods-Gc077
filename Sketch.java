import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 200, 255);
    
    // Output middle y-point of the first house
    System.out.println("Middle y-coordinate of House 1: " + intReturnValue(100, 200));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Environment Designs 
    // Draw Grass
    grass(0, 300, 400, 100);

    // Draw sun
    sun(50, 60, 80);

    // Draw house 1
    house(200, 100, 200);

    // Draw house 2 
    house(50, intReturnValue(100, 200), 100);
    
  }
  /**
  * Draws a base grass for a drawing that utilizes grass for the base
  * 
  * @param intGrassX x-coordinate for the grass
  * @param intGrassY y-coordinate for the grass
  * @param intGrWidth width of grass
  * @param intGrHeight height of grass
  * 
  */
  private void grass(int intGrassX, int intGrassY, int intGrWidth, int intGrHeight)
  { 
    // Draw base grass
    stroke(0, 120, 0);
    fill(0, 120, 0);
    rect(intGrassX, intGrassY, intGrWidth, intGrHeight);
  }

  /**
  * Draws a sun to the screen
  * 
  * @param intSunX x-coordinate of the sun
  * @param intSunY y-coordinate of the sun
  * @param intSunSize size of the sun
  * 
  */
  private void sun(int intSunX, int intSunY, int intSunSize)
  { 
    // Draw sun
    stroke(255, 167, 0);
    fill(255, 255, 0);
    ellipse(intSunX, intSunY, intSunSize, intSunSize);
  }

  /**
   * Draws a house to the screen
   * 
   * @param intHouseX x-coordinate of the house
   * @param intHouseY y-coordinate of the house
   * @param intHouseSize size integer of the house
   * 
   */
  private void house(int intHouseX, int intHouseY, int intHouseSize)
  {
    // Base rectangle of the body of the house
    stroke(0);
    fill(160, 55, 63);
    rect(intHouseX, intHouseY, intHouseSize, intHouseSize);

    // Roof
    fill(0);
    triangle(intHouseX, intHouseY, intHouseX + (intHouseSize / 2), intHouseY - (intHouseSize / 4), intHouseX + (intHouseSize), intHouseY);

    // Window
    fill(0);
    rect((intHouseX + (intHouseSize / 2)), (intHouseY + (intHouseSize / 2)), (intHouseSize / 2), (intHouseSize / 4));

    // Door 
    fill(0);
    rect(intHouseX, (intHouseY + (intHouseSize / 2)), (intHouseSize / 3), (intHouseSize / 2));
  }

  /**
   * 
   * @param intHouseY y-coordinate of the house 
   * @param intHouseSize size of the house 
   * @return returns the middle y-coordinate of the house
   */
  private int intReturnValue(int intHouseY, int intHouseSize)
  {
    return intHouseY + (intHouseSize / 2);
  }
}