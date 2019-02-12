package filter2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import filter2.Filter.Request;
import filter2.Filter.Response;

public class FilterChainImpl implements FilterChain {

	private final List<Filter> filters = new CopyOnWriteArrayList<>();
	
	private final AtomicInteger index = new AtomicInteger();
	
	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}
	
	public FilterChain addFilter(Collection<Filter> filters) {
		this.filters.addAll(filters);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response) {
		if (index.get() >= filters.size()) {
			index.set(0);
			System.out.println("do service");
			System.out.println(request.getMsg());
			response.setMsg(response.getMsg()+"success:");
			return;
		}	
		filters.get(index.getAndAdd(1)).doFilter(request, response, this);
	}

}
