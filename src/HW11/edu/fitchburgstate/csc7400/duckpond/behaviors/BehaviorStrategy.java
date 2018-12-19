/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Author: Saran,Vamsi,Raghu
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.CannotFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.SimpleFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.CannotQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.DuckQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.SimpleQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.Squeak;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.ducks.QuackType;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;
public class BehaviorStrategy {

	private static FlyingBehavior flyingBehavior;
	private static QuackBehavior quackBehavior;
	private static SwimBehavior swimBehavior;
	
	public FlyingBehavior getFlyBehavior(){
		return flyingBehavior;
	}
	
	public QuackBehavior getQuackBehavior(){
		return quackBehavior;
	}
	
	public SwimBehavior getSwimBehavior(){
		return swimBehavior;
	}
	
	public static BehaviorStrategy getBehaviors(String fly,String swim,QuackType quackType) {
		
		flyingBehavior = fly != null ? new SimpleFly(fly) : new CannotFly();
		quackBehavior = createQuackBehavior(quackType);
		swimBehavior = new SimpleSwim(swim);
		return new BehaviorStrategy();
	}
	
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

