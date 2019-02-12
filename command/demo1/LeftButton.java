package demo1;

public class LeftButton implements Button {
	
	private Role role = Role.newInstance();

	@Override
	public void excute() {
		role.left();
	}

}
