/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

/**
 * Mallard duck for pond
 */
public class Mallard extends Duck {

	/**
	 * Creates a new Mallard duck with appropriate bitmaps and GIFs
	 */
	public Mallard() {
		super("Mallard",
				"mallard.bmp",
				FlyBehaviorFactory.createFlyBehavior("mallard flap"),
				SwimBehaviorFactory.createSwimBehavior("mallard paddle"),
				QuackBehaviorFactory.createQuackBehavior(QuackType.DUCK));
	}
}
