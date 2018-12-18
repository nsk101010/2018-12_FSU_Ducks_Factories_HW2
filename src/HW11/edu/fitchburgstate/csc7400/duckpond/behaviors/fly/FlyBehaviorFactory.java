/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

public class FlyBehaviorFactory {

	public static FlyingBehavior createFlyBehavior(String str){
		return str != null ? new SimpleFly(str) : new CannotFly();
	}
}

