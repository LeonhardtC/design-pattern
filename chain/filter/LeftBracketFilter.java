package filter;

public class LeftBracketFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace("<", "(");
	}

}
