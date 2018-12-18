/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

/**
 * Allows vocal behavior
 */
public interface QuackBehavior {
	/**
	 * Make quacking sound if you can
	 */
	public void quack();

	/**
	 * Make quacking sound if you can
	 * 
	 * @param count number of times to quack
	 */
	public void quack(int count);
}
