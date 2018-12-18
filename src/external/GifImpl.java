/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package external;

/** 
 *  Simple class to mockup a GIF
 */
public class GifImpl implements GIF {

  /** 
   *  Creates a new GIF given a file name.
   */
  public GifImpl(String fileName) {
    this.fileName = fileName;
  }

  /** 
   *  Displays the filename of the GIF file.
   */
  public void animate() {
  	System.out.println("Animating GIF " + this.fileName);
  }

  /** 
   *  Filename of the GIF file
   */
  protected String fileName;
}
