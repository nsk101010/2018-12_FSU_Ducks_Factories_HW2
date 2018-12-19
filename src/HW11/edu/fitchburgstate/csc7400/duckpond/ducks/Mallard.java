/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviorStrategy;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.SimpleFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.DuckQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;

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
	BehaviorStrategy.getBehaviors("mallard flap","mallard paddle", QuackType.DUCK));
	}
}
