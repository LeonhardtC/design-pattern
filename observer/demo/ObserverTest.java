package demo;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObserverTest {

	public static void main(String[] args) {
		List<Observer> observers = Stream.generate(ObserverImpl::new).limit(10).collect(Collectors.toList());
		Subject subject = new Subject().addAll(observers);
		// 触发事件
		subject.recieve(Event.CREATE);
	}
}
