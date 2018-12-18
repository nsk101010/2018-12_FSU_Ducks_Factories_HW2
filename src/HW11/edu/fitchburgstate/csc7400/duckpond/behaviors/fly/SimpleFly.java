/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.SimpleGIFBehavior;

/**
 * Simple flying behavior, prints out GIF file name.
 */
public class SimpleFly extends SimpleGIFBehavior implements FlyingBehavior {

	/**
	 * Constructor with flying GIF name
	 * 
	 * @param gif the GIF file name to display when flying
	 */
	public SimpleFly(String gif) {
		super(gif);
	}

	/**
	 * Animates flying.
	 * 
	 * Notice that this really just changes the name of performBehavior to fly.
	 */
	@Override
	public void fly() {
		performBehavior();
	}

}
