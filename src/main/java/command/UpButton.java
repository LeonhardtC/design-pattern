package command;

public class UpButton implements Button {

    private Role role = Role.newInstance();

    @Override
    public void execute() {
        role.up();
    }

}
