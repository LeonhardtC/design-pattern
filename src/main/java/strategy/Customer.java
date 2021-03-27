package strategy;

public class Customer {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer("步步高");
        cdPlayer.setCd(new JayCD());
        cdPlayer.play();
        System.out.println("--------------------------");
        cdPlayer.setCd(new EasonCD());
        cdPlayer.play();
    }
}
