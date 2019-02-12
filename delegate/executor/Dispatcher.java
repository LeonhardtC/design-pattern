package executor;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Dispatcher implements Executable {
	
	private Executable executor;

	@Override
	public void execute() {
		executor.execute();
	}

}
