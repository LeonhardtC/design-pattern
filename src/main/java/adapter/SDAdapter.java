package adapter;

public class SDAdapter implements SD {

    private MicroSD microSD;

    public SDAdapter(MicroSD microSD) {
        this.microSD = microSD;
    }

    @Override
    public String read() {
        return microSD.read();
    }

    @Override
    public void write(String content) {
        microSD.write(content);
    }

}
