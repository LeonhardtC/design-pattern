package demo1;

public class DownButton implements Button {
	
	private Role role = Role.newInstance();

	@Override
	public void excute() {
		role.down();
	}

}
