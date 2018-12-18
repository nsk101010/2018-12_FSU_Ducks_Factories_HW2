/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import external.GIF;

/**
 * Performs simple behavior by animating a GIF. This is really
 * an adapter around GIF. We don't need it, but I thought I would
 * show an adapter.
 * 
 * @author orlando
 */
public class SimpleGIFBehavior {
	
	/**
	 * Constructor with GIF to animate
	 * 
	 * @param gif the GIF used for the behavior
	 */
	public SimpleGIFBehavior(String gifFile) {
		behaviorGif = BehaviorHelper.createGif(gifFile);
	}

	/**
	 * Performs the behavior by animating GIF.
	 * 
	 * Notice that this delegates the behavior to the GIF
	 */
	public void performBehavior() {
		behaviorGif.animate();
	}

	/**
	 * GIF to display to show behavior
	 */
	private final GIF behaviorGif;
}
