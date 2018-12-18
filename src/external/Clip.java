/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package external;

/**
 * Mock audio playback
 * 
 * @author orlando
 */
public interface Clip {

	/**
	 * Play the sound clip a specified number of times
	 * 
	 * @param count the number of times to play the clip
	 */
	public void loop(int count);
}
