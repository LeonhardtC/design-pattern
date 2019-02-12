package demo;


public class ObserverImpl implements Observer {

	@Override
	public void doAction(Event event) {
		System.out.println(Thread.currentThread()+":"+event);
	}

}
