package Jackson_Annotations;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Jsonanysetter_pojo {
	private Map<String, Object> employees = new HashMap<String, Object>();

	public Map<String, Object> getEmployees() {
		return employees;
	}
	@JsonAnySetter
	public void setEmployees(String key, Object value) {
		employees.put(key, value);
	}
}
