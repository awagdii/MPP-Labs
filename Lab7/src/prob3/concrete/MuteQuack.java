package prob3.concrete;

import prob3.interfaces.Flyable;
import prob3.interfaces.Quackable;

public class MuteQuack implements Quackable, Flyable {



	@Override
	public void quack() {

		System.out.println("Mute Quack");
	}

}
