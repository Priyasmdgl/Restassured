package Jackson_Annotations;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Jsonanygetter_Pojo {

	private Map<String, Object> employees;

	@JsonAnyGetter
	public Map<String, Object> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, Object> employees) {
		this.employees = employees;
	}
	
}
