package command;

public class RightButton implements Button {

    private Role role = Role.newInstance();

    @Override
    public void execute() {
        role.right();
    }

}
