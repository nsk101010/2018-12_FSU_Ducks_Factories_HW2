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
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.Squeak;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		super("Rubber Duck",
				"ducky.bmp",
		FlyBehaviorFactory.createFlyBehavior(null),
		SwimBehaviorFactory.createSwimBehavior("rubber duck floating"),
		QuackBehaviorFactory.createQuackBehavior(QuackType.SQUEAK));
	}
}
