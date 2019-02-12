package proxy.dynamic;

import proxy.stc.Person;

public class Jay implements Person, Singer {

	@Override
	public void sing() {
		System.out.println("七里香");
	}

	@Override
	public void say() {
		System.out.println("我是周杰伦");
	}

}
