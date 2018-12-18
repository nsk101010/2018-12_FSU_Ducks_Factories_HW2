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
public class SimpleQuack extends ClipImpl implements QuackBehavior {

	/**
	 * Constructor with filename. Defaults loop to 2.
	 * 
	 * @param fileName name of the clip file
	 */
	public SimpleQuack(String fileName) {
		this(fileName, 2);
	}

	/**
	 * Constructor with filename.
	 * 
	 * @param fileName name of the clip file
	 * @param loop number of times to loop sound clip
	 */
	public SimpleQuack(String fileName, int loop) {
		super(fileName);
		timesToLoop = loop;
	}

	/**
	 * Output quacking.
	 * 
	 * @param count number of times to quack
	 */
	@Override
	public void quack(int count) {
		loop(count);
	}

	/**
	 * Output quacking.
	 */
	@Override
	public void quack() {
		quack(timesToLoop);
	}

	/**
	 * Number of times the clip will loop. In this case we are only printing out the
	 * name of the sound clip, but we will do it this many times.
	 */
	private final int timesToLoop;
}
