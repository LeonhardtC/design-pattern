package jdk;


import java.util.Observable;

public class Subject extends Observable {
	
	boolean async = true;
	
	public void recieve(Event event) {
		setChanged();	//必须设置
		if (async) {
			new Thread(()->notifyObservers(event)).start();
		}else {
			notifyObservers(event);
		}
	}
	
}
