package demo;

public class User {

    public static void main(String[] args) {
        // 买个笔记本
        Laptop laptop = new Laptop();
        // 买个手机内存卡
        SanDiskMicroSD microSD = new SanDiskMicroSD();
        // 电脑直读，插不进去，无法直接读取
        // laptop.loadMemoryCard(microSD);
        // 买个读卡器
        SDAdapter adapter = new SDAdapter(microSD);
        // 插卡
        laptop.loadMemoryCard(adapter);
        // 存文件
        laptop.writeMemoryCard("document");
        // 读文件
        String content = laptop.readMemoryCard();
        // 查验
        System.out.println(content);
    }
}
