package Jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonValue;

public class Jsonvalue_pojo {
	private String name;
	private int id;
	@JsonValue
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
