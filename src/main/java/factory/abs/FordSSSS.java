package factory.abs;

public class FordSSSS extends SSSS {

    public FordSSSS() {
        super.setCarFactory(new FordCarFactory());
    }
}
