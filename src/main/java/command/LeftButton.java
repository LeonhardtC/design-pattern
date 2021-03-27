package command;

public class LeftButton implements Button {

    private Role role = Role.newInstance();

    @Override
    public void execute() {
        role.left();
    }

}
