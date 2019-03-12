package prob3.interfaces;

public interface Quackable {

	default void quack(){
		System.out.println("Quack Quack");
	}
	
}
