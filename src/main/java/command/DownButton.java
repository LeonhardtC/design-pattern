package command;

public class DownButton implements Button {

    private Role role = Role.newInstance();

    @Override
    public void execute() {
        role.down();
    }

}
