package factory.abs;

public class BenzSSSS extends SSSS {

    public BenzSSSS() {
        super.setCarFactory(new BenzCarFactory());
    }
}
