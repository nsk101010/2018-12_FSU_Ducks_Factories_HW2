/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.CannotFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.CannotQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

/**
 * Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck {

	/**
	 * Creates a new wooden decoy with appropriate bitmaps and GIFs
	 */
	public WoodenDecoy() {
		super("Wooden Decoy",
				"wooden_decoy.bmp",
		FlyBehaviorFactory.createFlyBehavior(null),
		SwimBehaviorFactory.createSwimBehavior("decoy floating"),
		QuackBehaviorFactory.createQuackBehavior(null));
	}
}
