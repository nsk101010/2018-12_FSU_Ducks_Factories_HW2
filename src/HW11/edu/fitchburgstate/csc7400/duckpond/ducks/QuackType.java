/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

public enum QuackType {
	DUCK("quack"),SQUEAK("squeak"),CANNOTFLY(null),CANNOTQUACK(null);
	
	private final String key;
    
	private QuackType(String str) {
		this.key =str;
	}

	public String getKey() {
		return key;
	}
}

