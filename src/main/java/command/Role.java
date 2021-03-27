package command;

public class Role {

    private static final Role role = new Role();

    private Role() {
    }

    public static Role newInstance() {
        return role;
    }

    public void up() {
        System.out.println("向上走");
    }

    public void down() {
        System.out.println("向下走");
    }

    public void left() {
        System.out.println("向左走");
    }

    public void right() {
        System.out.println("向右走");
    }
}
