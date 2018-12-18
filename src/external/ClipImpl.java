/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package external;

/**
 * Audio clip mocking class. Just writes out the file name
 * 
 * @author orlando
 */
public class ClipImpl implements Clip {

	public ClipImpl(String fileName) {
		sound = fileName;
	}
	
	/**
	 * Mocks the looping behavior of click
	 */
	@Override
	public void loop(int count) {
		System.out.print(sound);
		for (int i = 1; i < count; i++) {
			System.out.print(", ");
			System.out.print(sound);
		}
		System.out.println();
	}

	private final String sound;
}
