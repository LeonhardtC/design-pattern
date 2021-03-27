package strategy;

public class CDPlayer {
    private CD cd;
    private String brand;

    public CDPlayer(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println(brand + "牌收音机，开始播放...");
        cd.sing();
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }
}
