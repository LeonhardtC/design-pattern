package chain.filter2;

import chain.filter2.Filter.Request;
import chain.filter2.Filter.Response;

public interface FilterChain {

    void doFilter(Request request, Response response);
}
