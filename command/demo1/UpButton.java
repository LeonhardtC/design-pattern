package demo1;

public class UpButton implements Button {
	
	private Role role = Role.newInstance();

	@Override
	public void excute() {
		role.up();
	}

}
