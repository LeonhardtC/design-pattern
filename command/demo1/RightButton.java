package demo1;

public class RightButton implements Button {
	
	private Role role = Role.newInstance();

	@Override
	public void excute() {
		role.right();
	}

}
