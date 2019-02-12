package filter;

import java.util.Arrays;

public class Consumer {

	public static void main(String[] args) {
		String prepare = "<script>测试代码</script>";
		FilterChain chain = new FilterChain();
		chain.addFilter(Arrays.asList(new XSSFilter(),new LeftBracketFilter(),new RightBracketFilter()));
		String after = chain.doFilter(prepare);
		System.out.println(after);
	}
}
