/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

import HW11.edu.fitchburgstate.csc7400.duckpond.ducks.QuackType;

public class QuackBehaviorFactory {
	
	
	public static QuackBehavior createQuackBehavior(QuackType str){
		QuackBehavior quackBehavior = null;
		if( str == null){
			quackBehavior = new CannotQuack();
		}else{
			SimpleQuack simpleQuack = null;
			switch (str) {
			case DUCK:
				simpleQuack =  new DuckQuack();
				break;
			case SQUEAK:
				simpleQuack =  new Squeak();
				break;
			default:
				break;
			}
			quackBehavior = simpleQuack;
		}
		
		if(quackBehavior == null)
			quackBehavior = new CannotQuack();
		
		return quackBehavior;
	}
}

