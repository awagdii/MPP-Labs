package prob3.interfaces;

public interface Flyable {
	default void fly(){
		System.out.println(" I am flaying");
	}
}
