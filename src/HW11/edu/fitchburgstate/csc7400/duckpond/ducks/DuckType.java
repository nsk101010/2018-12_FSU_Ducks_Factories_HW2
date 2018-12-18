/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;

/** 
 *  This is a simple duck interface that will be used to display ducks on a pond in the pond simulator
 */
public interface DuckType extends FlyingBehavior, QuackBehavior, SwimBehavior {

  /** 
   *  Displays a still image of the duck
   */
  public void display();
}
