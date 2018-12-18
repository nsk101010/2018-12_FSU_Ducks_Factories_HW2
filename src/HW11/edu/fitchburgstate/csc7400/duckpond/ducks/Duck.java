/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviorHelper;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import external.Bitmap;

/**
 * Base duck class that will be used for ducks on the pond
 */
public class Duck implements DuckType {
	/**
	 * Creates a duck object given the files that will be used for displaying and
	 * animating
	 * 
	 * @param duckTypeName
	 * 			  a string that identifies the duck type
	 * @param bitmapFilname
	 *            the still bitmap file name of the duck
	 * @param flyingGifFilename
	 *            the flying behavior
	 * @param swimmingGifFilename
	 *            the swimming behavior
	 * @param quackingBehavior
	 *            the quacking behavior
	 */

	public Duck(String duckTypeName,
			String bitmapFilename, 
			FlyingBehavior flyingBehavior, 
			SwimBehavior swimmingBehavior, 
			QuackBehavior quackingBehavior) {
		this.duckTypeName = duckTypeName;
		this.still = BehaviorHelper.createBitmap(bitmapFilename);
		this.flyBehavior = flyingBehavior;
		this.swimBehavior = swimmingBehavior;
		this.quackBehavior = quackingBehavior;
	}

	/**
	 * Displays a still of the duck using bitmap
	 */
	public void display() {
		this.still.show();
	}

	/**
	 * Displays a flying animation using the GIF file.
	 */
	public void fly() {
		System.out.print(this.duckTypeName);
		System.out.print(": ");
		quackBehavior.quack(4);
		System.out.print(this.duckTypeName);
		System.out.print(": ");
		flyBehavior.fly();
	}

	/**
	 * Makes a quacking sound
	 * 
	 * @param count number of times to quack
	 */
	@Override
	public void quack(int count) {
		System.out.print(this.duckTypeName);
		System.out.print(": ");
		quackBehavior.quack(count);
	}

	/**
	 * Makes a quacking sound
	 */
	public void quack() {
		System.out.print(this.duckTypeName);
		System.out.print(": ");
		quackBehavior.quack();
	}

	/**
	 * Shows a swimming animation using the GIF file
	 */
	public void swim() {
		System.out.print(this.duckTypeName);
		System.out.print(": ");
		swimBehavior.swim();
	}

	/**
	 * Picture of duck
	 */
	private final Bitmap still;
	
	/**
	 * Flying behavior
	 */
	private final FlyingBehavior flyBehavior;

	/**
	 * Quacking behavior (sound)
	 */
	private final QuackBehavior quackBehavior;

	/**
	 * Swimming behavior
	 */
	protected SwimBehavior swimBehavior;
	
	/**
	 * Name for type of duck
	 */
	private final String duckTypeName;
}
