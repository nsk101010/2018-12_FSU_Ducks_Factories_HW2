/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.SimpleGIFBehavior;

/**
 * Simple swimming behavior, prints out GIF file name.
 */
public class SimpleSwim extends SimpleGIFBehavior implements SwimBehavior {

	/**
	 * Constructor with swimming GIF name
	 * 
	 * @param gif the GIF file name to display when swimming
	 */
	public SimpleSwim(String gifFile) {
		super(gifFile);
	}

	/**
	 * Animates swimming.
	 * 
	 * Notice that this really just changes the name of performBehavior to swim.
	 */
	@Override
	public void swim() {
		performBehavior();
	}

}
