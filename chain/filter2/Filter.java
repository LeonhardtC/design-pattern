package filter2;

import lombok.Builder;
import lombok.Data;

public interface Filter {

	void doFilter(Request request, Response response, FilterChain filterChain);
	
	@Data
	@Builder
	public class Request {
		private String msg;
	}
	
	@Data
	@Builder
	public class Response {
		private String msg;
	}
}
