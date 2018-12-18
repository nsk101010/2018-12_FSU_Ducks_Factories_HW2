/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.SimpleGIFBehavior;

/**
 * This behavior indicates the object can't fly
 */
public class CannotFly extends SimpleGIFBehavior implements FlyingBehavior {

	/**
	 * Constructor with flying GIF name
	 * 
	 * @param gif the GIF file name to display when flying
	 */
	public CannotFly() {
		super(null);
	}

	/**
	 * Performs flying which just prints out 'cannot fly'.
	 */
	@Override
	public void fly() {
		System.out.println("cannot fly.");
	}
}
