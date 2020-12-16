package components.mwe;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;

@Singleton
public class Mwe2ParamsMap {
	private Map<String, String> params = new HashMap<>();

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
