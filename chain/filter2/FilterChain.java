package filter2;

import filter2.Filter.Request;
import filter2.Filter.Response;

public interface FilterChain {

	void doFilter(Request request, Response response);
}
