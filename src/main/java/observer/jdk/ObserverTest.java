package observer.jdk;


import java.util.stream.Stream;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Stream.generate(ObserverImpl::new)
                .limit(10)
                .forEach(subject::addObserver);
        // 触发事件
        subject.recieve(Event.CREATE);
    }
}
