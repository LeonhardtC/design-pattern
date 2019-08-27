package demo;

public class Laptop {

    /** 笔记本只有SD卡插槽 **/
    private SD sd;

    public void loadMemoryCard(SD sd) {
        this.sd = sd;
    }

    public String readMemoryCard() {
        if (sd == null) {
            throw new RuntimeException("请插入SD卡");
        }
        return sd.read();
    }

    public void writeMemoryCard(String content) {
        if (sd == null) {
            throw new RuntimeException("请插入SD卡");
        }
        sd.write(content);
    }
    
}
