/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;


public class SwimBehaviorFactory {

	public static SimpleSwim createSwimBehavior(String str){
		return new SimpleSwim(str);
	}
}

