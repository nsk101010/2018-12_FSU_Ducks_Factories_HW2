/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package external;

/** 
 *  Simple implementation of bitmap
 */
public class BitmapImpl implements Bitmap {
  /* {author=Orlando Montalvo, version=1.0, src_lang=Java}*/

  /** 
   *  Creates a new bitmap given a file name
   */
  public BitmapImpl(String fileName) {
  /* {author=Orlando Montalvo, version=1.0}*/
    this.fileName = fileName;
  }

  /** 
   *  Displays the bitmap file name
   */
  public void show() {
  /* {author=Orlando Montalvo, version=1.0}*/
	  System.out.println("Showing bitmap " + this.fileName);
  }

  /**
   * File name of the bitmap
   */
  protected String fileName;
}
