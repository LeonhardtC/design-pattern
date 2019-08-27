package demo;

public class SanDiskMicroSD implements MicroSD {

    private String content = "";

    @Override
    public String read() {
        return content;
    }

    @Override
    public void write(String content) {
        this.content = content;
    }

}
