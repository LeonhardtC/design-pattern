package demo1;

import lombok.Builder;

@Builder
public class GameHandler {

	//每一个槽位对应一个操作
	private Button a;
	private Button s;
	private Button d;
	private Button f;
	
	public void pushA(){
		a.excute();
	}
	
	public void pushS(){
		s.excute();
	}
	
	public void pushD(){
		d.excute();
	}
	
	public void pushF(){
		f.excute();
	}
}
