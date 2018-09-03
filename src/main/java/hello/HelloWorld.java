package main.java.hello;
import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = new LocalTime();
		System.out.println(currentTime);
		Greeter morning = new Greeter();
		System.out.println(morning.sayHello());
	}

}
