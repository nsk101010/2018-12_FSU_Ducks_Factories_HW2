/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.SimpleFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.DuckQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

/** 
 *  Redhead duck for pond
 */
public class Redhead extends Duck {

  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
		super("Redhead",
				"redhead.bmp",
		FlyBehaviorFactory.createFlyBehavior("redhead flap"),
		SwimBehaviorFactory.createSwimBehavior("redhead paddle"),
		QuackBehaviorFactory.createQuackBehavior(null)
  }
}
