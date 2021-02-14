package components.mwe;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;

/**
 * Used to transfer parameters from {@link Mwe2LauncherExtended} to {@link ExtendableResourceSetInitializer}.
 */
@Singleton
public class Mwe2ParamsMap {
	private Map<String, String> params = new HashMap<>();

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(final Map<String, String> params) {
		this.params = params;
	}
	
}
