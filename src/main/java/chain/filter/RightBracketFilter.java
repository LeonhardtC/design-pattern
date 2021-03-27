package chain.filter;

public class RightBracketFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace(">", ")");
    }

}
