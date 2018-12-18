/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import external.Bitmap;
import external.BitmapImpl;
import external.GIF;
import external.GifImpl;

public class BehaviorHelper {
	/** 
	 *  Creates a new Bitmap instance
	 */
	public static Bitmap createBitmap(String fileName) {
		return new BitmapImpl(fileName);
	}
	
	
	/** 
	 *  Creates a new GIF instance
	 */
	protected static GIF createGif(String fileName) {
		return new GifImpl(fileName);
	}
}
