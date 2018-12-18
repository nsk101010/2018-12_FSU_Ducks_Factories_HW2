/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond;

import java.util.ArrayList;
import java.util.List;

import HW11.edu.fitchburgstate.csc7400.duckpond.ducks.DuckType;

/** 
 *  Class that controls the display of the duck pond
 */
public class DuckPond {

  /** 
   * Adds a duck to the pond
   * 
   * @param newDuck duck to add 
   */
  public void addDuck(DuckType newDuck) {
    this.ducks.add(newDuck);
  }

  /** 
   *  Shows all the ducks swimming in the pond
   */
  public void swimming() {
	this.drawPond();
    for (DuckType duck: this.ducks) {
      duck.quack();
      duck.swim();
    }
  }

  /**
   * Draws what happens after ducks have been spooked.
   */
  public void spook() {
    this.drawSky();
    for (DuckType duck: this.ducks) {
        duck.fly();
      }
  }

  /** 
   *  Draws the base pond
   */
  protected void drawPond() {
    System.out.println("Drawing nice pond with cattails");
  }

  protected void drawSky() {
    System.out.println("Drawing blue sky");
  }

  /** 
   *  All the ducks that will be displayed
   */
  protected List<DuckType> ducks = new ArrayList<DuckType>();
}
