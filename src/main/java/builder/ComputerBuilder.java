package builder;

import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 有默认值（开箱即用），也可以对参数进行限制
 */
@Data
public class ComputerBuilder {

    public static final String DEFAULT_OS = "windows";
    public static final String DEFAULT_OFFICE = "office";
    public static final String DEFAULT_CHAT = "msn";
    private static final Map<String, List<String>> configrationMap = new HashMap<>();

    private String os;
    private String office;
    private String chat;

    static {
        configrationMap.put("os", Arrays.asList("windows", "linux"));
        configrationMap.put("windows_office", Arrays.asList("office", "wps"));
        configrationMap.put("linux_office", Arrays.asList("wps"));
        configrationMap.put("windows_chat", Arrays.asList("msn", "qq"));
        configrationMap.put("linux_chat", Arrays.asList("qq"));
    }

    //default值也可以从配置文件里读取，一般是configuration从classpath下读取文件
    {
        os = DEFAULT_OS;
        office = DEFAULT_OFFICE;
        chat = DEFAULT_CHAT;
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setOs(os);
        computer.setOffice(office);
		computer.setChat(chat);
		return computer;
	}

    //builder方式可以对参数进行限制
    public ComputerBuilder setOs(String os) {
        if (!configrationMap.get("os").contains(os)) {
            throw new RuntimeException("os error");
        }
        this.os = os;
        this.office = configrationMap.get(os + "_office") == null ? null : configrationMap.get(os + "_office").get(0);
        this.chat = configrationMap.get(os + "_chat") == null ? null : configrationMap.get(os + "_chat").get(0);
        return this;
    }

    public ComputerBuilder setOffice(String office) {
        if (!configrationMap.get(this.os + "_office").contains(office)) {
            throw new RuntimeException("office error");
        }
        this.office = office;
        return this;
    }

    public ComputerBuilder setChat(String chat) {
        if (!configrationMap.get(this.os + "_chat").contains(chat)) {
            throw new RuntimeException("chat error");
        }
        this.chat = chat;
        return this;
    }

    @Data
    public static class Computer {

		private String os;
		private String office;
		private String chat;

		private Computer() {
		}
	}
}
