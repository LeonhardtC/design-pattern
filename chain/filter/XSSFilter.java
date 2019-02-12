package filter;

public class XSSFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace("script", "");
	}

}
