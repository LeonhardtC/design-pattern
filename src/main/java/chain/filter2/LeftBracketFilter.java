package chain.filter2;

public class LeftBracketFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println(this + ":begin");

        request.setMsg(request.getMsg().replace("<", "("));
        filterChain.doFilter(request, response);
        response.setMsg(response.getMsg() + this.getClass().getSimpleName() + ";");

        System.out.println(this + ":end");
    }

}
