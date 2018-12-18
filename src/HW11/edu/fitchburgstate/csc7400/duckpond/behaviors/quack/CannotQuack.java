/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

import external.ClipImpl;

/**
 * Mock simple quacking.
 * 
 * @author orlando
 */
public class CannotQuack extends ClipImpl implements QuackBehavior {

	/**
	 * Constructor
	 */
	public CannotQuack() {
		super(null);
	}

	/**
	 * Output quacking.
	 * 
	 * @param count number of times to quack
	 */
	@Override
	public void quack(int count) {
		quack();
	}
	
	/**
	 * Output quacking, which is just a string saying 'cannot quack'
	 */
	@Override
	public void quack() {
		System.out.println("cannot quack");
	}
}
