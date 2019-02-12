package filter;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FilterChain implements Filter {

	private final List<Filter> filters = new CopyOnWriteArrayList<>();
	
	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}
	
	public FilterChain addFilter(Collection<Filter> filters) {
		this.filters.addAll(filters);
		return this;
	}

	@Override
	public String doFilter(String str) {
		for (Filter filter : filters) {
			System.out.println("call "+filter.getClass().getSimpleName());
			str = filter.doFilter(str);
		}
		return str;
	}
	
}
