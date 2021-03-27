package factory.abs;

public class HondaSSSS extends SSSS {

    public HondaSSSS() {
        super.setCarFactory(new HondaCarFactory());
    }
}
