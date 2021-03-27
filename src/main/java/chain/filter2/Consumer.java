package chain.filter2;

import chain.filter2.Filter.Request;
import chain.filter2.Filter.Response;

import java.util.Arrays;

public class Consumer {

	public static void main(String[] args) {
		Request request = Request.builder().msg("<script>测试代码</script>").build();
		Response response = Response.builder().msg("result:").build();

		FilterChainImpl chain = new FilterChainImpl();
		chain.addFilter(Arrays.asList(new XSSFilter(), new LeftBracketFilter(), new RightBracketFilter()));
		chain.doFilter(request, response);

		System.out.println(response.getMsg());
	}
}
